package org.selenide.examples.methods;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SaucedemoLogin {
    public static final SelenideElement inputUsername = $(byName("user-name"));
    public static final SelenideElement inputPassword = $(byName("password"));
    public static final SelenideElement buttonLogin = $(byXpath("//input[contains(@id,'login-button')]"));

    public static void abrimosPaginaWeb() { open("https://www.saucedemo.com/"); }

    public static void username(String userNameValue){
        inputUsername.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputUsername.setValue(userNameValue);
    }
    public static void password(String passwordValue){
        inputPassword.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputPassword.setValue(passwordValue);
    }

    public static void login(){
        buttonLogin.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonLogin.click();
    }

}
