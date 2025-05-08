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
    public void classwork(){
        WebElement element = wd.findElement(By.cssSelector("[name = 'login']"));
        String text = element.getText();
        System.out.println();
    }


    @Test
    public void cssSelectors() {
        //by tag name
        WebElement head = wd.findElement(By.tagName("head"));
        WebElement head2 = wd.findElement(By.cssSelector("head"));
        WebElement head3 = wd.findElement(By.xpath("//head"));

        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body2 = wd.findElement(By.cssSelector("body"));
        WebElement body3 = wd.findElement(By.xpath("//body"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form2 = wd.findElement(By.cssSelector("form"));
        WebElement form3 = wd.findElement(By.xpath("//form"));

        WebElement inputEmail = wd.findElement(By.tagName("input"));
        WebElement inputEmail2 = wd.findElement(By.cssSelector("input"));
        WebElement inputEmail3 = wd.findElement(By.xpath("//input"));

        WebElement password = wd.findElement(By.tagName("input"));
        WebElement password2 = wd.findElement(By.cssSelector("input"));
        WebElement password3 = wd.findElement(By.xpath("//input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button2 = wd.findElement(By.cssSelector("button"));
        WebElement button3 = wd.findElement(By.xpath("//button"));

        WebElement link = wd.findElement(By.tagName("a"));
        WebElement link2 = wd.findElement(By.cssSelector("a"));
        WebElement link3 = wd.findElement(By.xpath("//a"));

        WebElement linkForgotPassword = wd.findElement(By.tagName("a"));
        WebElement linkForgotPassword2 = wd.findElement(By.cssSelector("a"));
        WebElement linkForgotPassword3 = wd.findElement(By.xpath("//a"));

        WebElement linkSignUp = wd.findElement(By.tagName("a"));
        WebElement linkSignUp2 = wd.findElement((By.cssSelector("a")));

        WebElement heading = wd.findElement(By.tagName("h1"));
        WebElement heading2 = wd.findElement(By.cssSelector("h1"));
        WebElement heading3 = wd.findElement(By.xpath("//h1"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div2 = wd.findElement(By.cssSelector("div"));
        WebElement div3 = wd.findElement(By.xpath("//div"));


        //by class
        WebElement container = wd.findElement(By.className("container"));
        WebElement container2 = wd.findElement(By.cssSelector(".container"));
        WebElement container10 = wd.findElement(By.xpath("//*[@class = 'container']"));

        WebElement loginPage = wd.findElement(By.className("login_login__3EHKB"));
        WebElement loginPage2 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement loginPage3 = wd.findElement(By.xpath("//*[@class = 'login_login__3EHKB']"));

        WebElement loginForm = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement loginForm2 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement loginForm3 = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));

        //by id
        WebElement element3 = wd.findElement(By.id("root"));
        WebElement element4 = wd.findElement(By.cssSelector("#root"));
        WebElement element12 = wd.findElement(By.xpath("//*[@id = 'root']"));

        //by Attributs
        WebElement element5 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement element13 = wd.findElement(By.xpath("//*[@href = '/home']"));

        WebElement element6 = wd.findElement(By.cssSelector("[placeholder = 'Email' ]"));
        WebElement element14 = wd.findElement(By.xpath("//*[@placeholder = 'Email']"));

        

        WebElement element7 = wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        WebElement element15 = wd.findElement(By.xpath("//*[@placeholder = 'Password']"));

    }

    @AfterClass
    public void postCondition() {
        wd.quit(); //close browser

    }
}
