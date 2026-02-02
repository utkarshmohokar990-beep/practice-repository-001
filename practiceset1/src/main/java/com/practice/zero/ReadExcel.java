package com.practice.zero;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) {
        try {
            // Step 1: Open Excel file
            FileInputStream fis = new FileInputStream(
                    "src/test/resources/testdat/testdata1.xlsx");
            // Step 2: Create Workbook
            Workbook workbook = new XSSFWorkbook(fis);
            // Step 3: Get Sheet
            Sheet sheet = workbook.getSheet("Sheet1");
            // Step 4: Read rows and cells
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "  ");
                }
                System.out.println();
            }

            workbook.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


