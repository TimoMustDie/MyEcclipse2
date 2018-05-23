package com.elan.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.elan.pojo.User;
import com.elan.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml"})//读取所有spring配置文件
public class MybatisAndSpringTest {
	private static Logger logger = Logger.getLogger(MybatisAndSpringTest.class);
	@Autowired
	private IUserService userService = null;

	@Test
	public void test1() {
		User user = userService.getById(1);
		logger.info(JSON.toJSONString(user));
	}
}
