package org.selenide.examples.steps;

import io.cucumber.java.en.Given;
import org.selenide.examples.methods.SaucedemoLogin;
import static com.codeborne.selenide.Selenide.sleep;

import java.util.List;

public class SaucedemoLoginSteps {
    @Given("Ingresamos a Saucedemo")
    public void IngresamosASaucedemo(){ SaucedemoLogin.abrimosPaginaWeb(); }

    @Given("Iniciamos sesion")
    public void iniciamosSesion(List<List<String>> LoginList){
        SaucedemoLogin.username(LoginList.get(0).get(0));
        SaucedemoLogin.password(LoginList.get(0).get(1));
        SaucedemoLogin.login();
    }
    @Given("Esperamos cingo segundos")
    public void esperamosCincoSegundos() { sleep(5000); }
}
