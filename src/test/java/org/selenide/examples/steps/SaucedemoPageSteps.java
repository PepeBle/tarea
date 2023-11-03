package org.selenide.examples.steps;
import io.cucumber.java.en.Given;
import org.selenide.examples.methods.SaucedemoPage;

import java.util.List;

public class SaucedemoPageSteps {
    @Given("Realizar compra")
    public void realizarCompra(List<List<String>> userAddList){
        SaucedemoPage.AddToCart();
        SaucedemoPage.CartLink();
        SaucedemoPage.Checkout();
        SaucedemoPage.FirstName(userAddList.get(0).get(0));
        SaucedemoPage.LastName(userAddList.get(0).get(1));
        SaucedemoPage.PostalCode(userAddList.get(0).get(2));
        SaucedemoPage.Continue();
        SaucedemoPage.Finish();
        SaucedemoPage.BackHome();

    }


}
