package stepDefinitions;

import org.openqa.selenium.By;

public class loginObject {
    //--loginPageObject
    By fieldNoPhoneEmail = By.xpath("//*[@id=\"user_identity_textfield\"]");
    By buttonLanjut = By.xpath("//*[@id=\"submit_button\"]");
    By buttonFacebook = By.xpath("/html/body/div[1]/main/div/div[2]/section/section[1]/div[1]/div[3]/div/div/div[1]/button/span/span");
    By buttonGoogle = By.xpath("/html/body/div[1]/main/div/div[2]/section/section[1]/div[1]/div[3]/div/div/div[2]/button/span/span");
    By textLoginYuk = By.xpath("/html/body/div[1]/main/div/div[2]/section/section[1]/div[1]/p");
    By textAtauLoginPakai = By.xpath("/html/body/div[1]/main/div/div[2]/section/section[1]/div[1]/div[3]/p");
    By textBelumPunyaAkun = By.xpath("/html/body/div[1]/main/div/div[2]/section/section[1]/div[2]/div[2]/p");
    By textButtonDaftar = By.xpath("/html/body/div[1]/main/div/div[2]/section/section[1]/div[2]/div[2]/p/a");

}
