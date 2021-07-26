package helper;

import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Helper {
    public static WebDriver driver;

    public void hover(By byElement){

        WebElement mainMenu = driver.findElement(byElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();

    }
    public Actions hover2(By byElement){

        WebElement mainMenu = driver.findElement(byElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();
        return actions;
    }
    public void clickTargetOnHover(By byElement1,By byElement2) throws InterruptedException {

        WebElement mainMenu = driver.findElement(byElement1);
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).perform();

        TimeUnit.SECONDS.sleep(2);

        WebElement subMenu = driver.findElement(byElement2);
        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }

    public void clickTargetOnHover2(By byElement1,Actions actions){


        WebElement subMenu = driver.findElement(byElement1);
        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }
    public void click(By byElement){

        driver.findElement(byElement).click();
    }
    public void sendKeys(By byElement, String text) {

        driver.findElement(byElement).sendKeys(text);
    }
    public List<WebElement> elementList(By byElement){

        return driver.findElements(byElement);
    }
    public WebElement getElement(By byElement){

        return driver.findElement(byElement);
    }
    public int randomElement(By element){
        List<WebElement> elements = driver.findElements(element);
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(elements.size());
        return randomNumber;
    }
    public String getText(By byElement){

        return driver.findElement(byElement).getText();

    }

}
