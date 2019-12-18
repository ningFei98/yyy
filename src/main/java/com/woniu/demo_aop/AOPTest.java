package com.woniu.demo_aop;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="aop.xml")
public class AOPTest {

	@Autowired
	UserService us;
	@Test
	public void test() {
		int save = us.save();
		//us.save(1);
		//us.exit();
		System.out.println(save);
	}

}
