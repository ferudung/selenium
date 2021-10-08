package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/acer/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println("şuandaki url :"+driver.getCurrentUrl());//şuandaki url yi veriri
        System.out.println("şuandaki başlık :"+driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000);//içerisen bekletmek istediğiniz süreyi yaz 1000 milisaniye 1 saniye
        driver.navigate().to("https://www.techproeducation.com");//rota oluşturmak için mesela amazondan sonra youtube igtmek isteersenkullanılır
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        //driver.quit();eğer birden fazla sayfa veya browser açıksa hepsini kapatır


        driver.close();//en son çalıştığınsayfayı kapatır

    }
}
