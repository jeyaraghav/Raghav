package d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dd2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\D2\\driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement b =a.findElement(By.xpath("//p[contains(text(),'Greens')][1]"));
		String a1=b.getText();
		System.out.println(a1);
		WebElement c =a.findElement(By.xpath("//p[contains(text(),' Learn ')][1]"));
		String a2=c.getText();
		System.out.println(a2);
		
	}

}
