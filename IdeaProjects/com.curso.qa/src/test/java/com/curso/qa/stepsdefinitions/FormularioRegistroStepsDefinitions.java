package com.curso.qa.stepsdefinitions;

import com.curso.qa.models.Usuario;
import com.curso.qa.questions.ElMensaje;
import com.curso.qa.tasks.Diligenciar;
import com.gargoylesoftware.htmlunit.javascript.host.webkitURL;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioRegistroStepsDefinitions {

    @Managed
    WebDriver driver;
    @Before
    public void Setup() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("JuanPa");

    }

    @Given("^El se encuentra el la zona de registro de la pagina$")
    public void elSeEncuentraElLaZonaDeRegistroDeLaPagina() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().attemptsTo(Open.url("https://www.phptravels.net/register"));

    }

    @When("^El completa el registro con la informacion requerida por el formulario$")
    public void elCompletaElRegistroConLaInformacionRequeridaPorElFormulario(List <Usuario> usuarios) {
    theActorInTheSpotlight().attemptsTo(Diligenciar.elFormularioRegistro(usuarios.get(0)));

    }
    @Then("^El deberia poder ver el mensaje de creacion exitosa del usuario$")
    public void elDeberiaPoderVerElMensajeDeCreacionExitosaDelUsuario() {

        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ElMensaje.deCreacionExitosaDelUsuario(), Matchers.is("Nothing Booked Yet"))
        );

    }
}
