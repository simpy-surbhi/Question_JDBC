package fr.epita;

import java.sql.SQLException;

public class Launcher {
	
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
