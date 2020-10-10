package miniproject;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//getting the top five items that are retrieved after filtering
public class output {
    public void display(WebDriver driver) throws IOException {
        String str[]=new String[5];
        String pri[]=new String[5];
        List<WebElement> name= (List<WebElement>) driver.findElements(By.xpath("//p[@class='product-title']"));
        List<WebElement> price=driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
        for(int i=0;i<5;i++)
        {
            System.out.println("Product name :"+name.get(i).getText()+" price rupees "+price.get(i).getText());

        }
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("sheet");


        XSSFRow firstRow=sheet.createRow(0);
        XSSFCell firstCell=firstRow.createCell(0);
        firstCell.setCellValue("Bluetooth Headphone Title");
        XSSFCell SecondCell=firstRow.createCell(1);
        SecondCell.setCellValue("Cost");


        XSSFRow SecondRow=sheet.createRow(1);
        XSSFCell SecondFirstCell=SecondRow.createCell(0);
        SecondFirstCell.setCellValue(name.get(0).getText() );
        XSSFCell SecondSecondCell=SecondRow.createCell(1);
        SecondSecondCell.setCellValue(price.get(0).getText() );

        XSSFRow ThirdRow=sheet.createRow(2);
        XSSFCell ThirdFirstCell=ThirdRow.createCell(0);
        ThirdFirstCell.setCellValue(name.get(1).getText() );
        XSSFCell ThirdSecondCell=ThirdRow.createCell(1);
        ThirdSecondCell.setCellValue(price.get(1).getText() );

        XSSFRow FourthRow=sheet.createRow(3);
        XSSFCell FourthFirstCell=FourthRow.createCell(0);
        FourthFirstCell.setCellValue(name.get(2).getText() );
        XSSFCell FourthSecondCell=FourthRow.createCell(1);
        FourthSecondCell.setCellValue(price.get(2).getText() );

        XSSFRow FifthRow=sheet.createRow(4);
        XSSFCell FifthFirstCell=FifthRow.createCell(0);
        FifthFirstCell.setCellValue(name.get(3).getText() );
        XSSFCell FifthSecondCell=FifthRow.createCell(1);
        FifthSecondCell.setCellValue(price.get(3).getText() );

        XSSFRow SixthRow=sheet.createRow(5);
        XSSFCell SixthFirstCell=SixthRow.createCell(0);
        SixthFirstCell.setCellValue(name.get(4).getText() );
        XSSFCell SixthSecondCell=SixthRow.createCell(1);
        SixthSecondCell.setCellValue(price.get(4).getText() );

        FileOutputStream writeFile=new FileOutputStream("/home/ishwar/IdeaProjects/miniproject2/Output/BluetoothHeadphones.xlsx");
        workbook.write(writeFile);
    }
}