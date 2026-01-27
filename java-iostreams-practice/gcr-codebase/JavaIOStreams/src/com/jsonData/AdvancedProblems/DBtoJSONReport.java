package com.jsonData.AdvancedProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBtoJSONReport {
    public static void main(String[] args) throws Exception {
        //DB connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT id, name, salary FROM employees");

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode jsonArray = mapper.createArrayNode();

        while(rs.next()) {
            ObjectNode obj = mapper.createObjectNode();
            obj.put("id", rs.getInt("id"));
            obj.put("name", rs.getString("name"));
            obj.put("salary", rs.getDouble("salary"));
            jsonArray.add(obj);
        }

        conn.close();

        //Write JSON report
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new java.io.File("src/com/jsonData/AdvancedProblems/db_report.json"), jsonArray);

        System.out.println("JSON report generated from database");
    }
}
