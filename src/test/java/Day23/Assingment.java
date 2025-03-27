package Day23;
//tag id--->tag#id
//tag class--->tag.classname
//tag attribute-->tag[attribute="value"]
//tag class attribute-->tag.classname[attribute="value"]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Samar Anwar\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new  ChromeDriver();
        driver.get("https://www.meesho.com/?srsltid=AfmBOoozA1AWCeFobJI_MEZiWlI_agMcfTNBsReNXeuSBBnXWwP3y4KY");
        driver.manage().window().maximize();
        //1)---> id--->tag#id
        driver.findElement(By.cssSelector("script#__NEXT_DATA__").


    }
}
