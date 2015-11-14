package testpackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Haroon on 10/11/2015.
 */
public class JobPortalTest {


    @Test
    public void testJobProfileCreationAndJobSearch() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.jobserve.com/gb/en/Candidate/Login.aspx?url=48BB4C724EA6A1F2CADF4243A0D73C13225717A29AE8DAD6913D");
        //WebElement planAJourneyButton = driver.findElement(By.className("plan-journey-button"));
        //planAJourneyButton.click();
        //https://www.jobserve.com/gb/en/Candidate/Login.aspx?url=48BB4C724EA6A1F2CADF4243A0D73C13225717A29AE8DAD6913D
        //WebElement loginMnuButton = driver.findElement(By.className("loginMnu"));
        //loginMnuButton.click();
        //loginMnu
        //WebElement layrButton = driver.findElement(By.className("layr"));
        //layrButton.click();
        //id('layr'
        WebElement PolicyOptInButton = driver.findElement(By.cssSelector("#PolicyOptInLink"));
        PolicyOptInButton.click();
        WebElement Email = driver.findElement(By.id("txbEmail"));
        Email.sendKeys("haroonvicapri@gmail.com");
        WebElement Password = driver.findElement(By.id("txbPassword"));
        Password.sendKeys("august1993");
        WebElement LogInNowButton = driver.findElement(By.cssSelector("#btnlogin"));
        LogInNowButton.click();
        WebElement ViewProfile = driver.findElement(By.cssSelector("#ProfileTab"));
        ViewProfile.click();
        WebElement           =driver.findElement(By.xpath("id('suSection')/div/div[1]")).click();
    }

}
    //driver.findElement(By.xpath("id('PolicyOptInLink')")).click();
        //driver.findElement(By.xpath("id('txbEmail')")).sendKeys(DataCol1);
        //driver.findElement(By.xpath("id('txbPassword')")).sendKeys(DataCol2);
        //driver.findElement(By.xpath("id('btnlogin')")).click();
        //driver.findElement(By.xpath("id('ProfileTab')/div[1]/h2/a")).click();
        //driver.findElement(By.xpath("id('suSection')/div/div[1]")).click();
       // driver.findElement(By.xpath("id('telmob')")).clear();
        //driver.findElement(By.xpath("id('telmob')")).sendKeys(DataCol3);
        //driver.findElement(By.xpath("id('linkedInUrl')")).clear();
        //driver.findElement(By.xpath("id('linkedInUrl')")).sendKeys(DataCol4);
        //driver.findElement(By.xpath("id('role')")).clear();
        //driver.findElement(By.xpath("id('role')")).sendKeys(DataCol5);
       // driver.findElement(By.xpath("id('roletype')")).click();
        //driver.findElement(By.xpath("id('3')")).click();
        //driver.findElement(By.xpath("id('availability')")).click();
       // driver.findElement(By.xpath("id('availability')/option[5]")).click();
       // driver.findElement(By.xpath("id('profile')")).clear();
       // driver.findElement(By.xpath("id('profile')")).sendKeys(DataCol6);
       // driver.findElement(By.xpath("id('suSection')/div/div[5]/input")).click();
       // driver.findElement(By.xpath("id('skSection')/h2/a")).click();
       // driver.findElement(By.xpath("id('nwSkill')")).clear();
       // driver.findElement(By.xpath("id('nwSkill')")).sendKeys(DataCol7);
       // driver.findElement(By.xpath("id('exc')")).click();
       // driver.findElement(By.xpath("id('nwFrom')")).clear();
        //driver.findElement(By.xpath("id('nwFrom')")).sendKeys(DataCol8);
       // driver.findElement(By.xpath("id('nwComment')")).clear();
       // driver.findElement(By.xpath("id('nwComment')")).sendKeys(DataCol9);
        //driver.findElement(By.xpath("id('skEditor')/div[5]/span/input")).click();

       // JavascriptExecutor jse = (JavascriptExecutor)driver;
      //  jse.executeScript("window.scrollBy(0,-250)", "");
    // driver.findElement(By.xpath("id('mnuouter')/ul[1]/li[1]/a")).click();
    //driver.findElement(By.xpath("id('ddcl-selInd')/span/span")).click();
    //driver.findElement(By.xpath("id('ddcl-selInd-ddw')/div/div[1]/label")).click();
    //  driver.findElement(By.xpath("id('ddcl-selInd-i14')")).click();
    //  driver.findElement(By.xpath("id('txtKey')")).clear();
    //  driver.findElement(By.xpath("id('txtKey')")).sendKeys(DataCol17);
    //  driver.findElement(By.xpath("id('txtLoc')")).clear();
    //  driver.findElement(By.xpath("id('txtLoc')")).sendKeys(DataCol18);
    //  driver.findElement(By.xpath("id('btnSearch')")).click();