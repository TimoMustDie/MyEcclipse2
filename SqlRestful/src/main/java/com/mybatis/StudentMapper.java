package com.mybatis;

import java.util.HashMap;
import java.util.List;

import com.example.dao.Student;

public interface StudentMapper {
	List<Student> selectAll();
	boolean deleteById(long id);
	boolean insertIn(Student  stu);
	boolean update(HashMap<String, Object> map);
}
