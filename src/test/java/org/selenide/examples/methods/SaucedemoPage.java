package org.selenide.examples.methods;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SaucedemoPage {
    /*** BUTTON ID ***/
    public static final SelenideElement buttonAddToCart = $(byXpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]"));
    public static final SelenideElement buttonCartLink = $(byXpath("//a[contains(@class,'shopping_cart_link')]"));
    public static final SelenideElement buttonCheckout = $(byXpath("//button[contains(@id,'checkout')]"));
    public static final SelenideElement buttonContinue = $(byXpath("//input[contains(@id,'continue')]"));
    public static final SelenideElement buttonFinish = $(byXpath("//button[contains(@id,'finish')]"));
    public static final SelenideElement buttonBackHome = $(byXpath("//button[contains(@id,'back-to-products')]"));

    /** INPUT ID **/
    public static final SelenideElement inputFirstName = $(byXpath("//input[contains(@id,'first-name')]"));
    public static final SelenideElement inputLastName = $(byXpath("//input[contains(@id,'last-name')]"));
    public static final SelenideElement inputPostalCode = $(byXpath("//input[contains(@id,'postal-code')]"));

    /** BUTTON METHODS **/
    public static void AddToCart(){
        buttonAddToCart.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonAddToCart.click();
    }
    public static void CartLink(){
        buttonCartLink.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonCartLink.click();
    }
    public static void Checkout(){
        buttonCheckout.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonCheckout.click();
    }
    public static void Continue(){
        buttonContinue.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonContinue.click();
    }
    public static void Finish(){
        buttonFinish.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonFinish.click();
    }
    public static void BackHome(){
        buttonBackHome.shouldBe(Condition.visible, Duration.ofSeconds(10));
        buttonBackHome.click();
    }
    /** INPUT METHODS **/
    public static void FirstName(String FirstNameValue){
        inputFirstName.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputFirstName.setValue(FirstNameValue);
    }
    public static void LastName(String LastNameValue){
        inputLastName.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputLastName.setValue(LastNameValue);
    }
    public static void PostalCode(String PostalCodeValue){
        inputPostalCode.shouldBe(Condition.visible, Duration.ofSeconds(10));
        inputPostalCode.setValue(PostalCodeValue);
    }




}

