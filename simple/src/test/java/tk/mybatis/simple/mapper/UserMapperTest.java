package tk.mybatis.simple.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import chap2.SysUser;
import junit.framework.Assert;

public class UserMapperTest extends BaseMapperTest{
	@Test
	public void testSelectById() {
		SqlSession sqlSession=getSqlSession();
		try {
			
			
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			SysUser user=userMapper.selectById(1l);
			System.out.println(user.getCreateTime());
			System.out.println(user.getUserEmail()+"\t"+user.getId()+"\t"+user.getUserName()+"\t"+user.getUserPassword()+"\t"+user.getUserInfo());
			Assert.assertNotNull(user);
			//Assert.assertEquals("admin", user.getUserName());
		} catch (Exception e) {
			// TODO: handle exception
			sqlSession.close();
		}
	}
	@Test
	public void testSelectAll() {
		SqlSession sqlSession=getSqlSession();
		try {
			UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
			List<SysUser> users=userMapper.selectAll();
			for(SysUser user:users) {
				System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getUserEmail());
			}
			Assert.assertNotNull(users);
			Assert.assertTrue(users.size()>0);
		} catch (Exception e) {
			// TODO: handle exception
			sqlSession.close();
		}
	}
}
