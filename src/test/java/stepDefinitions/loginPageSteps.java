package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;


public class loginPageSteps {
    WebDriver driver;
    loginObject login = new loginObject();

    @Given("Open the chrome and navigate login page")
    public void Open_the_chrome_and_login_page() {
        driver = new ChromeDriver();
        driver.navigate().to(("https://accounts.bukalapak.com/login"));
        driver.manage().window().maximize();
    }

    @When("system display login page")
    public void systemDisplayLoginPage(){
        String title = driver.getTitle();
        Assert.assertTrue(driver.findElement(login.fieldNoPhoneEmail).isDisplayed());
        Assert.assertEquals("Accounts", title);
        System.out.println("title is "+title);
    }

    @Then("field login no phone or email")
    public void fieldLoginNoPhoneOrEmail() {
        Assert.assertTrue(driver.findElement(login.fieldNoPhoneEmail).isDisplayed());
        driver.findElement(login.fieldNoPhoneEmail).sendKeys("login@gmail.com");
    }

    @And("button lanjut")
    public void buttonLanjut() {
        Assert.assertTrue(driver.findElement(login.buttonLanjut).isDisplayed());
        String actual = driver.findElement(login.buttonLanjut).getText();
        Assert.assertEquals("Lanjut",actual);
    }

    @And("button login with facebook")
    public void buttonLoginWithFacebook() {
        Assert.assertTrue(driver.findElement(login.buttonFacebook).isDisplayed());
        String actual = driver.findElement(login.buttonFacebook).getText();
        Assert.assertEquals("Facebook",actual);
    }

    @And("button login with google")
    public void buttonLoginWithGoogle() {
        Assert.assertTrue(driver.findElement(login.buttonGoogle).isDisplayed());
        String actual = driver.findElement(login.buttonGoogle).getText();
        Assert.assertEquals("Google",actual);
    }

    @And("text on page login with word")
    public void textOnPageLoginWithWord(Map<String,String> nbText) {
        Assert.assertTrue(driver.findElement(login.textButtonDaftar).isDisplayed());
        String actual1 = driver.findElement(login.textLoginYuk).getText();
        String actual2 = driver.findElement(login.textAtauLoginPakai).getText();
        String actual3 = driver.findElement(login.textBelumPunyaAkun).getText();
        String actual4 = driver.findElement(login.textButtonDaftar).getText();
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



