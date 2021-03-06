package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Student;
import com.example.dao.StudentDao;

@RestController
public class StudentController {
	@Autowired
	private StudentDao studentDao;
	@RequestMapping(value="/students",method=RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentList(){
		List<Student> students=studentDao.getStudentList();
		return students;
	}
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Long> deleteStudent(@PathVariable("id") long id){
		boolean result=studentDao.deleteById(id);
		return new ResponseEntity<Long>(id,HttpStatus.OK);
	}
	
	@RequestMapping(value="/students/{id}&{name}&{sex}", method=RequestMethod.POST)
	public ResponseEntity<String> addStudent(@PathVariable("id") long id, @PathVariable("name") String name, @PathVariable("sex") String sex){
		Student stu=new Student(id,name,sex);
		boolean result=studentDao.insertIn(stu);
		return new ResponseEntity<String>(String.valueOf(id+name+sex),HttpStatus.OK);
	}
	@RequestMapping(value="/students/{id}&{name}&{sex}&{preid}",method=RequestMethod.PUT)
	public ResponseEntity<String> updateStudent(@PathVariable("id") long id, @PathVariable("name") String name, @PathVariable("sex") String sex,@PathVariable("preid") long preid){
		HashMap<String, Object> map=new HashMap<>();
		map.put("id", id);
		map.put("name", name);
		map.put("sex", sex);
		map.put("preid", preid);
		boolean result=studentDao.update(map);
		System.out.println(id+"\t"+name+"\t"+sex+"\t"+"--------------------------------------------------------");
		return new ResponseEntity<String>(String.valueOf(id),HttpStatus.OK);
	}
	
	
	
	
	
	
}
