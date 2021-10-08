package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageURL {
    public static void main(String[] args) {
        /*
        Yeni bir class olusturalim : (VerifyURLTest)
 Youtube ana sayfasina gidelim https://www.techproeducation.com/
Sayfa URL’inin www. techproeducation.com oldugunu dogrulayin
         */
        System.setProperty("webdriver.chrome.driver","C:/Users/acer/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        String ExpectedURL="https://www.techproeducation.com/";
        String actualURL=driver.getCurrentUrl();

        if (ExpectedURL.equals(actualURL)){
            System.out.println("beklenen URL degeri ile aynı : test PASS");
        }else {
            System.out.println("beklenen URL degeri ile aynı değil : test FAIL");
            System.out.println("aktual URL :"+driver.getCurrentUrl());
        }
        driver.close();
    }
}
