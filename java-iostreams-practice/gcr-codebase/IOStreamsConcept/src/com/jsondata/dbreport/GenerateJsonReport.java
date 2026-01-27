package com.jsondata.dbreport;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenerateJsonReport {
    public static void main(String[] args) {
	// sample file path
	String outputFile = "C:/Users/modis/OneDrive/Pictures/Documents/output.json";

	List<EmployeeRecord> records = new ArrayList<>();

	try {
	    // Connect to database
	    String url = "jdbc:mysql://localhost:3306/student_db" + "?useSSL=false" + "&allowPublicKeyRetrieval=true"
		    + "&serverTimezone=UTC";

	    Connection con = DriverManager.getConnection(url, "root", "Sanya@05");

	    // Execute query to fetch employees
	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");

	    // Convert each row into EmployeeRecord object
	    while (rs.next()) {

		EmployeeRecord emp = new EmployeeRecord(rs.getInt("id"), rs.getString("name"),
			rs.getString("department"), rs.getDouble("salary"));

		records.add(emp);
	    }

	    rs.close();
	    stmt.close();
	    con.close();

	    ObjectMapper mapper = new ObjectMapper();

	    // Write database records into JSON file
	    mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), records);
	    System.out.println("JSON report generated successfully.");

	} catch (SQLException e) {
	    System.out.println("Database error occurred.");
	    System.out.println(e.getMessage());

	} catch (IOException e) {
	    System.out.println("Error writing JSON file.");
	    System.out.println(e.getMessage());
	}
    }
}
