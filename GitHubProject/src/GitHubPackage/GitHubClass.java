package GitHubPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import SampleGradlePackage.XSSFCell;
import SampleGradlePackage.XSSFRow;
import SampleGradlePackage.XSSFSheet;
import SampleGradlePackage.XSSFWorkbook;

public class GitHubClass {
	FileInputStream fil=new FileInputStream(new File("C:\\Users\\Thara\\Desktop\\Automation\\GradleExcelLogin.exe"));
	XSSFWorkbook workbook=new XSSFWorkbook(fil);
	XSSFSheet sheet=workbook.getSheet("data");
	int count=sheet.getLastRowNum();
	System.out.println(count);
	for (int i=1;i<=count;i++)
	{
		XSSFRow row=sheet.getRow(i);
		XSSFCell cell=row.getCell(0);
		String un=cell.getStringCellValue();
		XSSFCell cell1=row.getCell(1);
		String pwd-cell.getStringCelValue();
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.close();

}
}