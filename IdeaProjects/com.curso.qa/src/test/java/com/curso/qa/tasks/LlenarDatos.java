package com.curso.qa.tasks;

import com.curso.qa.models.Usuario;
import com.curso.qa.usersinterfaces.FormularioRegistroUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static com.curso.qa.usersinterfaces.FormularioRegistroUI.FIRSTNAME;
import static com.curso.qa.usersinterfaces.FormularioRegistroUI.FIRSTNAME;

public class LlenarDatos {

    public static Performable delformulario (Usuario usuario){
        return Task.where("{0} llena los datos del formulario",
                Enter.theValue(usuario.getUsername()).into(FIRSTNAME.waitingForNoMoreThan(Duration.ofSeconds(10)))
                ,Enter.theValue(usuario.getEmail()).into(FormularioRegistroUI.LASTNAME)
                ,Enter.theValue(usuario.getEmail()).into(FormularioRegistroUI.MOBILE)
                ,Enter.theValue(usuario.getEmail()).into(FormularioRegistroUI.EMAIL)
                ,Enter.theValue(usuario.getPassword()).into(FormularioRegistroUI.PASSWORD)
                ,Enter.theValue(usuario.getPassword()).into(FormularioRegistroUI.REPETIRPASSWORD)
                );
    }
}
