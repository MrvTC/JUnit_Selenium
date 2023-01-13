package day11_ApachePOI_WriteExcel;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class WebTablesTask extends BaseTest {

//  Go to URL: https://the-internet.herokuapp.com/tables
//  Print the entire table
//  Print All Rows
//  Print Last row data only
//  Print column 5 data in the table body
//  Write a method that accepts 2 parameters
//  parameter 1 = row number
//  parameter 2 = column number
//  printData(3,4); => prints
//  parameter 3 = table id
//  printData(3,4,"table1") => prints data in 3rd row 4th Column with table id

    @Override
    @After
    public void tearDown() {

    }

    @Test
    public void test() {

//        Go to URL: https://the-internet.herokuapp.com/tables

        driver.get("https://the-internet.herokuapp.com/tables");

//        Print the entire table

        WebElement table1 = driver.findElement(By.id("table1"));

        System.out.println(table1.getText());

//        Print All Rows

        System.out.println();

        List<WebElement> table1Rowlist = table1.findElements(By.xpath(".//tr"));

        table1Rowlist.forEach(t -> System.out.println(t.getText()));

//        Print Last row data only

        System.out.println();

        WebElement table1lastRow = table1.findElement(By.xpath(".//tr[4]"));

        System.out.println("lastRow = " + table1lastRow.getText());


//        Print column 5 data in the table body

        System.out.println();

        List<WebElement> table1Column5list = table1.findElements(By.xpath(".//tr//td[5]"));

        table1Column5list.forEach(t -> System.out.println(t.getText()));

        System.out.println();

        printData2Parameters(3, 4);

        printData3Parameters(3, 4, "table1");
    }

    private void printData3Parameters(int r, int c, String id) {

        // Write a method that accepts 2 parameters
        // parameter 1 = row number
        // parameter 2 = column number
        // printData(3,4); => prints

        WebElement cellData1 = driver.findElement(By.id(id)).findElement(By.xpath(".//tr[" + r + "]//td[" + c + "]"));

        System.out.println("cell data= " + cellData1.getText());

    }

    private void printData2Parameters(int r, int c) {

        // parameter 3 = table id
        // printData(3,4,"table1") => prints data in 3rd row 4th Column with table id

        WebElement cellData2 = driver.findElement(By.xpath(".//tr[" + r + "]//td[" + c + "]"));

        System.out.println("cell Data = " + cellData2.getText());
    }

}


