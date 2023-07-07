import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class TestS {

    @Test
    public void Test() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://ananas.rs/");
        driver.close();
    }

    @Test
    public void checkBox()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        driver.findElement(By.className("rct-checkbox")).click();
        driver.quit();
    }

    @Test
    public void radioButton()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        WebElement radioButtonYes = driver.findElement(By.id("yesRadio"));
        Actions actions = new Actions(driver);
        actions.click(radioButtonYes).perform();
        driver.quit();
    }

    @Test
    public void clickButtons()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement dubleClick = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(dubleClick).perform();
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClick).perform();
        driver.findElement(By.xpath("//button[text() = 'Click Me']")).click();
        driver.quit();
    }

    @Test
    public void linkText()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/links");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Home")).click();
        driver.quit();
    }

    @Test
    public void uploadDownload()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\QA36\\IdeaProjects\\SeleniumMaven\\src\\test\\java\\monalisa-v.jpg");
        driver.findElement(By.id("downloadButton")).click();
    }

    @Test
    public void studentRegistrationForm()
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.findElement(By.id("firstName")).sendKeys("Marko");
        driver.findElement(By.id("lastName")).sendKeys("Naumovic");
        driver.findElement(By.id("userEmail")).sendKeys("marko@mail.com");
        Actions actions = new Actions(driver);
        WebElement gender = driver.findElement(By.id("gender-radio-1"));
        actions.moveToElement(gender).click().perform();
        driver.findElement(By.id("userNumber")).sendKeys("0653246410");

        WebElement calendar = driver.findElement(By.id("dateOfBirthInput"));
        calendar.click();
        Select mesec = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        mesec.selectByVisibleText("June");
        Select godina = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        godina.selectByVisibleText("2023");
        driver.findElement(By.className("react-datepicker__day--025")).click();
        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("English");
        subject.sendKeys(Keys.ENTER);
        WebElement checkBox = driver.findElement(By.cssSelector("label[for ='hobbies-checkbox-1']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",checkBox);
        checkBox.click();
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\QA36\\IdeaProjects\\SeleniumMaven\\src\\test\\java\\monalisa-v.jpg");
        WebElement state = driver.findElement(By.id("react-select-3-input"));
        state.sendKeys("NCR");
        state.sendKeys(Keys.ENTER);
        WebElement city = driver.findElement(By.id("react-select-4-input"));
        city.sendKeys("Noida");
        city.sendKeys(Keys.ENTER);

        driver.findElement(By.id("submit")).submit();
        driver.quit();

    }

    @Test

    public void Test1() {
        WebDriver sreten = new ChromeDriver();
        sreten.navigate().to("https://www.google.com/");
        sreten.findElement(By.id("APjFqb")).sendKeys("polovni automobili");
        sreten.findElement(By.name("btnK")).submit();
        sreten.navigate().to("https://www.mojauto.rs/rezultat/status/automobili/poredjaj-po/oglas_najnoviji/po_stranici/20/prikazi_kao/lista/" );
        //sreten.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sreten.findElement(By.id("filter_quarter_202")).click();
        sreten.findElement(By.xpath("//*[@id=\"filter_quarter_202\"]/div/ul/li[2]")).click();

        sreten.findElement(By.id("filter_count_href")).click();
        }

}
