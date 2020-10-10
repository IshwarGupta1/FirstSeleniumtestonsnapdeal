package miniproject;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class input{
    public String ReadExcelData(int vRow, int vColumn) throws Exception
    {
        //Get the excel file and create an input stream for excel
        FileInputStream fis = new FileInputStream("/home/ishwar/IdeaProjects/miniproject2/Input/Input.xlsx");

        //load the input stream to a workbook object
        //Use XSSF for (.xlsx) excel file and HSSF for (.xls) excel file
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        //get the sheet from the workbook by index
        XSSFSheet sheet=wb.getSheetAt(0);
        DataFormatter formatter = new DataFormatter();
        Row row=sheet.getRow(vRow);
        Cell cell=row.getCell(vColumn);
        String value=formatter.formatCellValue(sheet.getRow(vRow).getCell(vColumn));
        return value;

    }

}