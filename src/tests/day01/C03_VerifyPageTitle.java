package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {
    public static void main(String[] args) {

        /*
        Yeni bir Class olusturalim. (VerifyTitle)
Amazon ana sayfasina gidelim . https://www.amazon.com/
Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)
         */
        System.setProperty("webdriver.chrome.driver","C:/Users/acer/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        String expectedTitle="amazon";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen degeri ile aynı, test PASS");
        }else {
            System.out.println("title beklenenden farklı , test FAIL");
            System.out.println("aktual title :"+driver.getTitle());
        }
        driver.close();


    }
}
