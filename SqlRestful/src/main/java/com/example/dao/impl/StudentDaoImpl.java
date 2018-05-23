package com.example.dao.impl;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.example.dao.Student;
import com.example.dao.StudentDao;
import com.mybatis.StudentMapper;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		try {
			Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sql=new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSession=sql.openSession();
			StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);
			List<Student> list=mapper.selectAll();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteById(long id) {
		// TODO Auto-generated method stub
		try {
			Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);
			mapper.deleteById(id);
			sqlSession.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean insertIn(Student stu) {
		// TODO Auto-generated method stub
		try {
			Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);
			mapper.insertIn(stu);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean update(HashMap<String, Object> map) {
		try {
			Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSession=sqlSessionFactory.openSession();
			StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);
			mapper.update(map);
			sqlSession.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
