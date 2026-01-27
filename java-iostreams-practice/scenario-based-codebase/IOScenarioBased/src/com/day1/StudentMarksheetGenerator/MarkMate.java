package com.day1.StudentMarksheetGenerator;

import com.opencsv.CSVReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.FileReader;

public class MarkMate {

    public static void main(String[] args) throws Exception {

        CSVReader reader = new CSVReader(new FileReader("src/com/day1/StudentMarksheetGenerator/marks.csv"));
        ObjectMapper mapper = new ObjectMapper();

        String[] header = reader.readNext();
        String[] row;

        while((row = reader.readNext()) != null) {

            int total = 0;
            for(int i=2; i<row.length; i++) {
                total += Integer.parseInt(row[i]);
            }

            double avg = total/3.0;
            String grade = avg >= 75 ? "A" : avg >= 60 ? "B" : "C";

            ObjectNode report = mapper.createObjectNode();
            report.put("id", row[0]);
            report.put("name", row[1]);
            report.put("total", total);
            report.put("average", avg);
            report.put("grade", grade);

            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(report));
        }
    }
}
