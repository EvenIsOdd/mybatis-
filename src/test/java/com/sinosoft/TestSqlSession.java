package com.sinosoft;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestSqlSession extends TestBase{
	@Test
	public void test() {
		SqlSession session=factory.openSession();
		String statement="com.sinosoft.Test.findObjects";
		ChargeBank chargeBank = session.selectOne(statement);
		System.out.println(chargeBank);
	}

}
