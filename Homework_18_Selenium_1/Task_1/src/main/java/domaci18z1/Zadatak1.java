package domaci18z1;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zadatak1 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("domaci18z1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        XSSFSheet sheet2 = workbook.createSheet("Sheet2");

        for (int i = 0; i < 3; i++) {
            XSSFRow row = sheet.getRow(i);
            XSSFCell cell1 = row.getCell(0);
            XSSFCell cell2 = row.getCell(1);
            XSSFCell cell3 = row.getCell(2);
            XSSFCell cell4 = row.getCell(3);
            XSSFCell cell5 = row.getCell(4);

            double nr1 = cell1.getNumericCellValue();
            double nr2 = cell2.getNumericCellValue();
            double nr3 = cell3.getNumericCellValue();
            double nr4 = cell4.getNumericCellValue();
            double nr5 = cell5.getNumericCellValue();

            double prosek = (nr1 + nr2 + nr3 + nr4 + nr5) / 5;

            XSSFRow row2 = sheet2.createRow(i);
            XSSFCell cellProsek = row2.createCell(0);
            cellProsek.setCellValue(prosek);

        }

        FileOutputStream outputStream = new FileOutputStream("domaci18z1.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Job done, boss!");

    }

}
