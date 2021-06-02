package com.curso.qa.questions;

import com.curso.qa.usersinterfaces.FormularioRegistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.time.Duration;

public class ElMensaje implements Question <String >{

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FormularioRegistroUI.MENSAJECREACIONUSUARIO.waitingForNoMoreThan(Duration.ofSeconds(30))).viewedBy(actor).asString();
    }
    public static ElMensaje deCreacionExitosaDelUsuario(){
        return new ElMensaje();
    }
}
