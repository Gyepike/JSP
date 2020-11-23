package com.anti.Dao;

public class TestDao {

	public static void main(String[] args) {
		
	   LoginDao testdao = new LoginDao();
	   System.out.println("hello");
	   System.out.println(testdao.checkAccess("alma", "alma"));
    }

}
