package HomeWork.day3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class day3_hw1 {
    // https://www.seleniumeasy.com/test/basic-checkbox-demo.html
// Check the Multiple Checkbox and check the button message
// When you check all the checkboxes, button message will change to 'Uncheck All'
// When you uncheck at least one checkbox, button message will change to 'Check All'



        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "//Users/orbet/Desktop/selenium/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
            driver.findElement(By.className("dropdown-toggle")).click();
            driver.findElement(By.linkText("Checkbox Demo")).click();

            List<WebElement> option = driver.findElements( By.className( "cb1-element" ) );

            for(int i=0;i<option.size();i++) {

                option.get( i ).click();

            }

            String text=driver.findElement(By.id("check1")).getAttribute("value");


            if(text.equals("Uncheck All")) {
                System.out.println("Pass");
            }else {
                System.out.println("Fail");
            }
            System.out.println("--------------------------------");
            for(int i=0;i<option.size();i++) {

                option.get( i ).click();

                text=driver.findElement(By.id("check1")).getAttribute("value");

                if(text.equals("Check All")) {
                    System.out.println("Pass");
                }else {
                    System.out.println("Fail");
                }

            }

        }
    }


