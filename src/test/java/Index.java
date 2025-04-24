import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.util.List;

public class Index {



    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/Admin/Desktop/21.index.html");
    }


    @Test
    public void cssLocator(){
        //by tag name
        WebElement el = wd.findElement(By.tagName("button")); //var 1 - found button
        WebElement el1 = wd.findElement(By.cssSelector("button"));  //var 2 classic - found button

        WebElement a = wd.findElement(By.tagName("a")); //found 1 element a
        WebElement a1 = wd.findElement(By.cssSelector("a")); //var 2 classic

        List<WebElement> list = wd.findElements(By.tagName("a")); //found full list elements a
        List<WebElement> list1 = wd.findElements(By.cssSelector("a")); //found full list elements a var 2

        //by class
        WebElement divContainer = wd.findElement(By.className("container"));
        WebElement divContainer2 = wd.findElement(By.cssSelector(".container")); //have input .container

        List<WebElement> nav = wd.findElements(By.className("nav-item"));
        List<WebElement> nav2 = wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement div = wd.findElement(By.id("nav"));
        WebElement div2 = wd.findElement(By.cssSelector("#nav"));

        WebElement alert = wd.findElement(By.id("alert"));
        WebElement alert2 = wd.findElement((By.cssSelector("#alert")));

        //Atribute for found fill [] - [href]
        //Atribute and value for found fill  [href='value'] -   [href='#item3']
        //Selector ID for found fill # - #nav
        //Selector class for found fill . - .nav

        //by atribute
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder ='Type your name']"));
        WebElement a2 = wd.findElement(By.cssSelector("[href = '#item3']"));

        //by name
        WebElement inputS = wd.findElement(By.cssSelector("[name ='surename']"));
        WebElement inputS2 = wd.findElement(By.name("surename"));
        }




}
