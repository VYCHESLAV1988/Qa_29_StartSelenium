import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class StartSelenium {

WebDriver wd;
@Test
    public void test(){
    wd = new ChromeDriver();
    //wd.get("https://github.com/"); //without history - Не сохраняется история перехода в методе .get
    wd.navigate().to("https://github.com/");
    wd.navigate().back();     // Вернутся назад
    wd.navigate().forward(); // Впееред стрелка
    wd.navigate().refresh(); // Обновить страницу

    //wd.close(); // comand .clouse cloused windows 1 tab - Команда закрывает только одно окно!
    wd.quit();  // comand .quit cloused windows closed full opened  tabs - Команда закрывает все открытые окна!
}



}
