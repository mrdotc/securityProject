package com.dco.secpro;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dco.secpro.core.entity.AppUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecproApplicationTests {
	
	 private final static Logger logger = LoggerFactory.getLogger(SecproApplicationTests.class); 

	@Test
	public void contextLoads() {
		
		
	
		AppUser u =new AppUser(001,"James Lu",new Date());
		
		logger.info("before name:"+u.getUseName());
		logger.info("before hireday:"+u.getHireday());
		
		
		Date d=u.getHireday();
		d.setTime(d.getTime()+1000*60*10*24*5);
		
		String s=u.getUseName();
		s.replace("J", "A");
		
		logger.info("after s:"+s);
		logger.info("after name:"+u.getUseName());
		logger.info("after hireday:"+u.getHireday());
		
		
		
		
		
	}

}
