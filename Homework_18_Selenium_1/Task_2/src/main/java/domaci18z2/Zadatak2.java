package domaci18z2;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("domaci18z2.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFRow row = sheet.getRow(0);

        ArrayList<String> namesList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            namesList.add(String.valueOf(row.getCell(i)));
        }

        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            namesList.add(String.valueOf(faker.name().firstName()));
        }

//        System.out.println(namesList);

        XSSFSheet sheet2 = workbook.createSheet("Sheet2");
        XSSFRow row2 = sheet2.createRow(0);

        for (int i = 0; i < namesList.size(); i++) {
            XSSFCell cell = row2.createCell(i);
            cell.setCellValue(namesList.get(i));
        }

        FileOutputStream outputStream = new FileOutputStream("domaci18z2.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Job done once again, boss!");

    }
}
