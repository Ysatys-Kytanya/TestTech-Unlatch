// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class PasswordTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void password() {
    driver.get("https://www.legalife.fr/");
    driver.manage().window().setSize(new Dimension(1282, 682));
    driver.findElement(By.linkText("MON COMPTE")).click();
    driver.switchTo().frame(2);
    js.executeScript("window.scrollTo(0,0)");
    driver.switchTo().defaultContent();
    driver.findElement(By.linkText("Mon mot de passe")).click();
    driver.findElement(By.id("pass")).click();
    driver.switchTo().frame(1);
    js.executeScript("window.scrollTo(0,0)");
    driver.switchTo().defaultContent();
    driver.findElement(By.id("pass")).sendKeys("az");
    driver.findElement(By.id("newpass")).click();
    driver.findElement(By.id("newpass")).sendKeys("abc");
    driver.findElement(By.id("password-confirm")).click();
    driver.findElement(By.id("password-confirm")).sendKeys("abc");
    driver.findElement(By.cssSelector(".btn--default")).click();
    driver.findElement(By.linkText("Déconnexion")).click();
    driver.switchTo().frame(1);
    js.executeScript("window.scrollTo(0,0)");
    driver.switchTo().defaultContent();
    driver.switchTo().frame(2);
    js.executeScript("window.scrollTo(0,0)");
  }
}