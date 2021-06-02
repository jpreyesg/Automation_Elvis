package com.curso.qa.tasks;

import com.curso.qa.models.Usuario;
import com.curso.qa.usersinterfaces.FormularioRegistroUI;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

import static com.curso.qa.usersinterfaces.FormularioRegistroUI.FIRSTNAME;

public class Diligenciar implements Task {

private Usuario usuario;

    public Diligenciar(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    @Step("{0} Diliigencia el formulario con sus datos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitUntil.the(USERNAME, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
                LlenarDatos.delformulario(usuario)
                , Scroll.to(FormularioRegistroUI.BOTONREGISTRAR).andAlignToTop()
                ,Click.on(FormularioRegistroUI.BOTONREGISTRAR)
        );
    }
    public static Diligenciar elFormularioRegistro(Usuario usuario){
        return Tasks.instrumented(Diligenciar.class,usuario);

    }
}
