package org.selenide.examples.methods;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class prueba {
    //Declaran nuestros indentificadores

    //IDENTIFICADORES
    public static final SelenideElement inputUsername = $(byName("q"));

    //MÉTODOS
    public static void abrimosGoogle(){
        open("https://www.google.com");
    }

    public static void ingresamosPalabra(String ingresamosPalabraValue){
        inputUsername.sendKeys(ingresamosPalabraValue);
    }

    public static void damosEnter(){
        inputUsername.pressEnter();
    }
}
