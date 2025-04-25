import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {

    WebDriver wd;



    @BeforeClass
    public void setUp(){
     wd = new ChromeDriver();
     wd.get("https://telranedu.web.app/login");
    }
    //Atribute for found fill [] - [href]
    //Atribute and value for found fill  [href='value'] -   [href='#item3']
    //Selector ID for found fill # - #nav
    //Selector class for found fill . - .nav


    @Test
    public void cssSelectors(){
        //by tag name
        WebElement input = wd.findElement(By.name("email"));
        WebElement input2 = wd.findElement(By.cssSelector("[name ='email']"));
        WebElement name = wd.findElement(By.name("password"));
        WebElement name2 = wd.findElement(By.cssSelector("[name ='password']"));
        WebElement sabmit = wd.findElement(By.name("login"));
        WebElement sabmit2 = wd.findElement(By.cssSelector("[name ='login']"));
        WebElement registration = wd.findElement(By.name("registration"));
        WebElement registration2 = wd.findElement(By.cssSelector("[name='registration']"));


        //by class
       WebElement container = wd.findElement(By.className("container"));
       WebElement container2 = wd.findElement(By.cssSelector(".container"));
       //WebElement div = wd.findElement(By.className(""));

        //by id


        //by attribute

    }

    @AfterClass
    public void postCondition(){
       //wd.quit(); //close browser

    }
}
