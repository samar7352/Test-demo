package Day23;
//tag id--->tag#id
//tag class--->tag.classname
//tag attribute-->tag[attribute="value"]
//tag class attribute-->tag.classname[attribute="value"]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSandSelectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Samar Anwar\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //tag id--->tag#id
        // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
        //  driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts"); //input(tagname) is optional

        //tag class--->tag.classname
        // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
        // driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");

        //tag attribute-->tag[attribute="value"]
        //  driver.findElement(By.cssSelector("input[placeholder=\"Search store\"")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector("[placeholder=\"Search store\"")).sendKeys("T-shirts");

        //tag class attribute-->tag.classname[attribute="value"]
        driver.findElement(By.cssSelector("input.search-box-text[name\"q\"]")).sendKeys("T-shirts");
        //Shahbaz is very good boy


    }
}
