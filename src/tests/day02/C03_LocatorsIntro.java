package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
//        1. Bir class oluşturun: LocatorsIntro
//        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//                a. http://a.testaddressbook.com adresine gidiniz.
        System.setProperty("webdriver.chrome.driver","C:/Users/acer/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://a.testaddressbook.com");
//        b. Sign in butonuna basin sign-in
        WebElement signIn=driver.findElement(By.linkText("Sign in"));
        signIn.click();
        Thread.sleep(2000);
//        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        WebElement password =driver.findElement(By.id("session_password"));
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement signInButtun= driver.findElement(By.name("commit"));
//        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        emailTextBox.sendKeys("testtechproed@gmail.com");
//        i. Username : testtechproed@gmail.com
        password.sendKeys("Test1234!");
//        ii. Password : Test1234!
        signInButtun.click();
//                e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
          WebElement dogruKullanici=driver.findElement(By.className("navbar-text"));
          String username="testtechproed@gmail.com";
          if (dogruKullanici.getText().equals(username)){
              System.out.println("dogru kullanıcı testi PASS");
          }else {
              System.out.println("yanlis kullanıcı testi FAIL");
          }
//                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
//
        //<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>
        WebElement adressesLink=driver.findElement(By.linkText("Addresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        if (adressesLink.isDisplayed()){
            System.out.println("Adresses Linki görünüyor :test PASS");
        }else {
            System.out.println("Adresses Linki görünmüyor :test FAIL");
        }
        if (signOut.isDisplayed()){
            System.out.println("signOut Linki görünüyor :test PASS");
        }else {
            System.out.println("signOut Linki görünmüyor :test FAIL");
        }
      //  3. Sayfada kac tane link oldugunu bulun.
        //birden fazla olduğu için findElements
        //sol tarafda webelementlerden oluşan  list yapacaz

        List<WebElement> links= driver.findElements(By.tagName("a"));
        int i= links.size();
        System.out.println("sayfadaki link sayısı:" +i);
        for (WebElement each:links
             ) {
            System.out.println(each.getText());
        }
      driver.close();
   }
}
