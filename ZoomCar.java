package Week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.zoomcar.com/in/bangalore");
		 driver.manage().window().maximize();
		
				 driver.findElement(By.xpath(//div[@class()='placeholder']))
			     driver.findElement(By.xpath(//input[@placeholder='Select your starting point']))
								 
	}

}
