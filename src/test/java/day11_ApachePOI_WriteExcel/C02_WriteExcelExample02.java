package day11_ApachePOI_WriteExcel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.*;

public class C02_WriteExcelExample02 {


    @Test
    public void changeExcelData() throws IOException {

        String filepath="src/test/java/resources/excelData.xlsx";

        File file=new File(filepath);

        FileInputStream fis=new FileInputStream(file);

        Workbook wb= WorkbookFactory.create(fis);

        Sheet informationData=wb.getSheet("informationData");

        //total row sayısını bulduk ve yazdırdık
        int totalRowsUsed=informationData.getLastRowNum()-informationData.getFirstRowNum();
        System.out.println("total rows= "+ totalRowsUsed);

        Row row5=informationData.createRow(4);

      // Yeni bir row olusturup row icerisindeki
        // celleri de olusturarak degerlerini atadik
        row5.createCell(0).setCellValue("merve");
        row5.createCell(1).setCellValue("C");
        row5.createCell(2).setCellValue("merve");
        row5.createCell(3).setCellValue("merve@gmail.com");
        row5.createCell(4).setCellValue("Female");
        row5.createCell(5).setCellValue("05356896587");
        row5.createCell(0).setCellValue("Address");

        //dosyamıza yazma işlemini gerçekleştirdik
        FileOutputStream fos=new FileOutputStream(file);
        wb.write(fos);

        fis.close();
        fos.close();
        wb.close();













    }
}
