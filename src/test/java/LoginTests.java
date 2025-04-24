import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {

    @BeforeClass
    public void preCondition(){
        //open browser
        //open site
    }
    @Test
    public void loginSucsses(){
        //Open form (find element + click)
        //Fill to email (find element Email + click + clear + type)
        //Fill to password (find element Password + click + type)
        //Submit form (find element Login + click + type)
    }
    @Test
    public void loginWrongEmail(){
        //Open form (find element + click)
        //Fill to email (find element Email + click + clear + type)
        //Fill to password (find element Password + click + type)
        //Submit form (find element Login + click + type)
    }
    @Test
    public void loginWrongPassword(){
        //Open form (find element + click)
        //Fill to email (find element Email + click + clear + type)
        //Fill to password (find element Password + click + type)
        //Submit form (find element Login + click + type)
    }
    @Test
    public void loginUnregistered(){
        //Open form (find element + click)
        //Fill to email (find element Email + click + clear + type)
        //Fill to password (find element Password + click + type)
        //Submit form (find element Login + click + type)
    }


    @AfterClass
     public void postCondition(){
        //close browser
     }


}
