package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Map;


public class registerPageSteps {
    WebDriver driver;
    registerObject regist = new registerObject();

    @Given("Open the chrome and navigate register page")
    public void Open_the_chrome_and_register_page() {
        driver = new ChromeDriver();
        driver.navigate().to(("https://accounts.bukalapak.com/register"));
        driver.manage().window().maximize();
    }

    @When("system display register page")
    public void systemDisplayRegisterPage() {
        String title = driver.getTitle();
        Assert.assertTrue(driver.findElement(regist.fieldNoPhoneEmail).isDisplayed());
        Assert.assertEquals("Daftar Akun Bukalapak | Bukalapak", title);
        System.out.println("title is"+title);
    }

    @Then("field regist no phone or email")
    public void fieldRegistNoPhoneOrEmail() {
        Assert.assertTrue(driver.findElement(regist.fieldNoPhoneEmail).isDisplayed());
        driver.findElement(regist.fieldNoPhoneEmail).sendKeys("daftar@gmail.com");
    }

    @And("button daftar")
    public void buttonDaftar() {
        Assert.assertTrue(driver.findElement(regist.buttonDaftar).isDisplayed());
        String actual = driver.findElement(regist.buttonDaftar).getText();
        Assert.assertEquals("Daftar",actual);
    }

    @And("button register with facebook")
    public void buttonRegisterWithFacebook() {
        Assert.assertTrue(driver.findElement(regist.buttonFacebook).isDisplayed());
        String actual = driver.findElement(regist.buttonFacebook).getText();
        Assert.assertEquals("Facebook",actual);
    }

    @And("button register with google")
    public void buttonRegisterWithGoogle() {
        Assert.assertTrue(driver.findElement(regist.buttonGoogle).isDisplayed());
        String actual = driver.findElement(regist.buttonGoogle).getText();
        Assert.assertEquals("Google",actual);
    }

    @And("text on page register with word")
    public void textOnPageRegisterWithWord(Map<String,String> nbText) {
        Assert.assertTrue(driver.findElement(regist.textButtonLogin).isDisplayed());
        String actual1 = driver.findElement(regist.textDaftarDulu).getText();
        String actual2 = driver.findElement(regist.textBisaPakaiJuga).getText();
        String actual3 = driver.findElement(regist.textSudahPunyaAkun).getText();
        String actual4 = driver.findElement(regist.textButtonLogin).getText();
        Assert.assertEquals(nbText.get("text1"),actual1);
        Assert.assertEquals(nbText.get("text2"),actual2);
        Assert.assertEquals(nbText.get("text3"),actual3);
        Assert.assertEquals(nbText.get("text4"),actual4);
        System.out.println(actual1);
        System.out.println(actual2);
        System.out.println(actual3);
        System.out.println(actual4);
    }
}