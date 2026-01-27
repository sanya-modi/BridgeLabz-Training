package com.csvdata.dbtocsv;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GenerateEmployeeCSV {
    public static void main(String[] args) {

	// sample database link
    	String url = "jdbc:mysql://localhost:3306/student_db"
    	           + "?useSSL=false"
    	           + "&allowPublicKeyRetrieval=true"
    	           + "&serverTimezone=UTC";

    	String username = "root";
    	String password = "Sanya@05";

	// sample file path
	String filePath = "C:/Users/modis/OneDrive/Pictures/Documents/students.csv";

	try (Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");
		FileWriter writer = new FileWriter(filePath)) {

	    // write header
	    writer.write("Employee ID,Name,Department,Salary\n");

	    while (rs.next()) {

		// write each database record
		writer.write(rs.getInt("id") + "," + rs.getString("name") + "," + rs.getString("department") + ","
			+ rs.getInt("salary") + "\n");
	    }

	    System.out.println("CSV report generated successfully");

	} catch (Exception e) {
	    e.printStackTrace();
	}

    }
}
