package com.sinosoft;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBase {
          SqlSessionFactory factory;
          @Before
          public void testMethod() throws IOException {
        	  InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
        	  SqlSessionFactoryBuilder builder =new SqlSessionFactoryBuilder();
        	 factory = builder.build(inputStream);
        	 SqlSession openSession = factory.openSession();
          }
        @Test
        public void testMethod01() {
        	Assert.assertNotEquals(null,factory);
        	System.out.println(factory);
        	
        }
          
	
}
