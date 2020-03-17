package GAU;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gau {
	@Test
	public void upload()throws InterruptedException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.in/");
	driver.manage().window().maximize();
	//File fis =new File("D:\\Selenium_Practice\\Task\\Task.xlsx");
	//Thread.sleep(5000);
	//FileInputStream inputStream = new FileInputStream("C:\\Users\\user\\Desktop\\Task.xlsx");
	/*XSSFWorkbook WB=new XSSFWorkbook(inputStream);
	XSSFSheet sheet = WB.getSheetAt(0);
	String s= sheet.getRow(0).getCell(0).getStringCellValue();
	String s1= sheet.getRow(1).getCell(0).getStringCellValue();
	Thread.sleep(5000);
	System.out.println(s);
	System.out.println(s1);*/
	
	
driver.findElement(By.name("q")).sendKeys("volante",Keys.ENTER);
	
	Thread.sleep(5000);
	String x=null;
	int a=1;
	//System.out.println(links.get(0));
	
while(a<2) {
	List<WebElement> e=driver.findElements(By.xpath("(//*[@class='TbwUpd NJjxre'])"));
	for(int i=0;i<e.size();i++)
	{
		
		e=driver.findElements(By.xpath("(//*[@class='TbwUpd NJjxre'])"));
		
		System.out.println(e.get(i).getText());
		
	 x = e.get(i).getText();
		
		if(x.contentEquals("www.volaetech.com"))
		{
			e.get(i).click();
			
			Thread.sleep(2000);
			break;
			
			
		}
	}
	try {
		Boolean e3=driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed();
		
		if(e3.TRUE)
		{
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			
			
		}
		

		
		
	}
	catch(Exception e3)
	{
		
		boolean status= !x.equals("www.volaetech.com");
		if(status)
		{
			System.out.println("no search");
			
			
		}

	
		break;
		
	
	}
}
	}
}
