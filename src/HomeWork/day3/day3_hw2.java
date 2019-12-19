package HomeWork.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//https://www.seleniumeasy.com/test/basic-checkbox-demo.html
// Check the Single Checkbox and check the message bellow it

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class day3_hw2 {




        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "//Users/orbet/Desktop/selenium/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
            driver.findElement(By.className("dropdown-toggle")).click();
            driver.findElement(By.linkText("Checkbox Demo")).click();
            driver.findElement(By.id("isAgeSelected")).click();

            String text = driver.findElement(By.id("txtAge")).getText();

            if (text.equals("Success - Check box is checked")) {
                System.out.println("Pass");
            } else {
                System.out.println("fail");
            }

        }
}
