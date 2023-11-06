package borno_UtiliTY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class borno_base {
	  public static WebDriver driver;
	   public static Properties bornoPro;
	
	public borno_base() {
		try {
			FileInputStream bornofile = new FileInputStream(System.getProperty("user.dir")+ ("//src//test//java//borno_conFig//Config.properties"));
			 bornoPro = new Properties();
			 bornoPro.load(bornofile);
		} catch (FileNotFoundException e) {
			System.out.println("Please look the code");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Please look the code");
			e.printStackTrace();
		}
	}
	public void bornobrowser() {
	String boAllbrowser = bornoPro .getProperty("BornoBrowser1");
	if( boAllbrowser.equalsIgnoreCase("Chrome")) {
		 System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+ ("//Bornomala22//borno_ChromeDriver//chrome.exe"));
		  ChromeOptions naz= new ChromeOptions();
		  naz.addArguments("--remote-allow-origins=*");
		  
		  driver= new ChromeDriver();
		  
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(borno_utiliti.pageLoadTimeout));   
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(borno_utiliti.implicitlyWait)); 
		  driver.manage().window().maximize(); 
	      }
	  else if(boAllbrowser.equalsIgnoreCase("Edge")) {
		  System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+ ("//Bornomala22//borno_EdgeDriver//msedgedriver.exe"));
		  EdgeOptions naz= new EdgeOptions();
		  naz.addArguments("--remote-allow-origins=*");
		  
		  driver= new EdgeDriver(); 
				  
		  
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(borno_utiliti.pageLoadTimeout));   
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(borno_utiliti.implicitlyWait)); 
		  driver.manage().window().maximize(); 
	      }
     }
    
    public static void bornolaunchurl(String url) {
    	 driver.get( bornoPro.getProperty("BornoUrl"));
	}
	}


