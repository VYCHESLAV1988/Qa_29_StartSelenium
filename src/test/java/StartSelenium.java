import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.net.http.WebSocket;

public class StartSelenium {

WebDriver wd;
@Test
    public void test(){
    wd = new ChromeDriver();
    wd.get("https://github.com/");
}


}
