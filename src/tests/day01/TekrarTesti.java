package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
 // 1.	Yeni bir class olusturun (TekrarTesti)
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/acer/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//2.Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com/");
        String expectedTitle="youtube";
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen degeri ile aynı ,test PASS");
        }else {
            System.out.println("title beklenen ile farklı , test FAIL");
            System.out.println("aktual title :"+driver.getTitle());
        }
//3.Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String expectedURL="youtube";
        String actualURL=driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("URL beklenen degeri:"+expectedURL+"'U içeriyor ,test PASS");
        }else {
            System.out.println("URL beklenen degeri içermiyor , test FAIL");
            System.out.println("aktual URL :"+driver.getCurrentUrl());
        }
//4.Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
//5.Youtube sayfasina geri donun
        driver.navigate().back();
        //6.	RefrSayfayi yenileyin
        driver.navigate().refresh();
        //7.	Amazon sayfasina donun
        driver.navigate().forward();
        //8.	Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
//9.Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedTitle2="Amazon";
        String actualTitle2=driver.getTitle();
        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("title beklenen title "+expectedTitle2+"'u içeriyor ,test PASS");
        }else {
            System.out.println("title beklenen title ile farklı , test FAIL");
            System.out.println("aktual title :"+driver.getTitle());        }
//10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String expectedURL2="https://www.amazon.com/";
        String actualURL2=driver.getCurrentUrl();
        if (expectedURL2.equals(actualURL2)){
            System.out.println("URL beklenen degeri:"+expectedURL2+"'U içeriyor ,test PASS");
        }else {
            System.out.println("URL beklenen degeri içermiyor , test FAIL");
            System.out.println("aktual URL :"+driver.getCurrentUrl());        }
//11.Sayfayi kapatin
        driver.close();
    }
}
