package tk.mybatis.simple.mapper;

import java.util.List;

import chap2.SysUser;

public interface UserMapper {
	SysUser selectById(Long id);
	List<SysUser> selectAll();
}
