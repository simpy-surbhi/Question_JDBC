package fr.epita;

import java.sql.SQLException;

public class Launcher {
	
    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:~/test";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestJDB1  job1 = new TestJDB1 ();
		try {
			job1.test();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Message " + e.getLocalizedMessage());
		}
	}

	
	
}
