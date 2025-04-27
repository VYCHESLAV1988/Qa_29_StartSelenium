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
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }
    //Atribute for found fill [] - [href]
    //Atribute and value for found fill  [href='value'] -   [href='#item3']
    //Selector ID for found fill # - #nav
    //Selector class for found fill . - .nav


    @Test
    public void cssSelectors() {
        //by tag name
        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form2 = wd.findElement(By.cssSelector("form"));
        WebElement inputEmail = wd.findElement(By.tagName("input"));
        WebElement inputEmail2 = wd.findElement(By.cssSelector("input"));
        WebElement password = wd.findElement(By.tagName("input"));
        WebElement password2 = wd.findElement(By.cssSelector("input"));
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button2 = wd.findElement(By.cssSelector("button"));
        WebElement link = wd.findElement(By.tagName("a"));
        WebElement link2 = wd.findElement(By.cssSelector("a"));
        WebElement linkForgotPassword = wd.findElement(By.tagName("a"));
        WebElement linkForgotPassword2 = wd.findElement(By.cssSelector("a"));
        WebElement linkSignUp = wd.findElement(By.tagName("a"));
        WebElement linkSignUp2 = wd.findElement((By.cssSelector("a")));
        WebElement heading = wd.findElement(By.tagName("h1"));
        WebElement heading2 = wd.findElement(By.cssSelector("h1"));
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div2 = wd.findElement(By.cssSelector("div"));

        //by class
        WebElement container = wd.findElement(By.className("container"));
        WebElement container2 = wd.findElement(By.cssSelector(".container"));
        WebElement loginPage = wd.findElement(By.className("login_login__3EHKB"));
        WebElement loginPage2 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement loginForm = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement loginForm2 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));


    }

    @AfterClass
    public void postCondition() {
        wd.quit(); //close browser

    }
}
