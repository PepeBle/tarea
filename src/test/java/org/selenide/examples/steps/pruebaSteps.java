package org.selenide.examples.steps;

import io.cucumber.java.en.Given;
import org.selenide.examples.methods.prueba;

import java.util.List;

public class pruebaSteps {

    @Given("Abrir Google Chrome")
    public void abrirGoogleChrome() {
        prueba.abrimosGoogle();
    }

    @Given("Realizar busqueda")
    public void realizarBusqueda(List<List<String>> busqueda) {
        prueba.ingresamosPalabra(busqueda.get(0).get(0));
        prueba.damosEnter();
    }

}
