package com.ln.junit;

import com.github.pagehelper.SqlUtil;

public class PageHelperTest extends SqlUtil {

	public PageHelperTest(String strDialect) {
		super(strDialect);
	}

	public static void main(String[] args) {
		// [mysql,mariadb,sqlite,oracle,hsqldb,postgresql]
		testSql("oracl", " select * from User");
	}

}
