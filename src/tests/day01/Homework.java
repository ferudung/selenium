package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {

       //1.	Yeni bir class olusturalim (Homework)
       //2.	ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        System.setProperty("webdriver.chrome.driver","C:/Users/acer/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String expectedTitle="facebook";
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen degeri ile aynı ,test PASS");
        }else {
            System.out.println("title beklenen ile farklı , test FAIL");
            System.out.println("aktual title :"+driver.getTitle());
        }
       //3.	Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expectedURL="facebook";
        String actualURL=driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("URL beklenen degeri:"+expectedURL+"'U içeriyor ,test PASS");
        }else {
            System.out.println("URL beklenen degeri içermiyor , test FAIL");
            System.out.println("aktual URL :"+driver.getCurrentUrl());
        }
       //4.	https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");
       //5.	Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitle2="Walmart.com";
        String actualTitle2=driver.getTitle();
        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("title beklenen title "+expectedTitle2+"'u içeriyor ,test PASS");
        }else {
            System.out.println("title beklenen title ile farklı , test FAIL");
            System.out.println("aktual title :"+driver.getTitle());        }
       //6.	Tekrar “facebook” sayfasina donun
        driver.navigate().back();
       //7.	Sayfayi yenileyin
        driver.navigate().refresh();
       //8.	Sayfayi tam sayfa (maximize) yapin
       driver.manage().window().maximize();
        // 9.Browser’i kapatin
        driver.quit();
    }
}
