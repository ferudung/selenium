package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //   a.amazon web sayfasına gidin. https://www.amazon.com/
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //   b. Search(ara) “city bike”
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("city bike"+ Keys.ENTER);
       //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucYazdir=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println("city bike arama sonuc degerleri :"+sonucYazdir.getText());
        //   d. “Shopping” e tıklayın.
        WebElement shopping=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
        Thread.sleep(1000);
        shopping.click();
        //   e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ilkSonuc=driver.findElement(By.xpath("//*[@id=\"slot-5\"]/div/div/div[2]/div[3]/div/div[1]/div/div/a[1]/div/div/img"));
        Thread.sleep(2000);
        ilkSonuc.click();




    }
}
