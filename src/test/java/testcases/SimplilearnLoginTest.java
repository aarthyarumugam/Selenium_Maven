package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass {
	
	@Test
	public void Test1()
	
	{
		
		   LoginPage lp = new LoginPage(driver);
		   lp.Login("abc@xyz.com","Test@1234");
			    
			//Step-6 Validate the error message
			    WebElement Error = driver.findElement(By.id("msg_box"));
			    String ActError = Error.getText();
			    String ExpError = "The email or password you have entered is invalid.";
			    
			    Assert.assertTrue(Error.isDisplayed());
			    Assert.assertEquals(ActError, ExpError);
//			    
//			    if(ActError.equals(ExpError)) {
//			    	System.out.println("Test Passed");
//			    }
//			    
//			    else {
//			    	System.out.println("Test Failed");
//			    }		 
		}
	
	@Test
	@Parameters({"uname","pwd"})
	public void Test2(String Username, String Password) {
		   LoginPage lp = new LoginPage(driver);
		   lp.Login(Username,Password);
	}
	
	@Test
	public void Test3() {
		
		  String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
          String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		   LoginPage lp = new LoginPage(driver);
		   lp.Login(UserName,Password);
	}
	}

