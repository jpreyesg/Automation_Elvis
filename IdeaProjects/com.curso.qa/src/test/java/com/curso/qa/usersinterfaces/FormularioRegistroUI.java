package com.curso.qa.usersinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioRegistroUI {

    public static final Target FIRSTNAME = Target.the("Campo  Username").locatedBy("//input[@name='firstname']");
    public static final Target LASTNAME = Target.the("Campo  Lastname").locatedBy("//input[@name='lastname']");
    public static final Target MOBILE = Target.the("Campo  Mobile").locatedBy("//input[@name='phone']");
    public static final Target EMAIL = Target.the("Campo Email").locatedBy("//input[@name='email']");
    public static final Target PASSWORD = Target.the("Campo Password").locatedBy("//input[@name='password']");
    public static final Target REPETIRPASSWORD = Target.the("repetirPassword").locatedBy("//input[@name='confirmpassword']");

    public static final Target BOTONREGISTRAR = Target.the("BotonRegistrar").locatedBy("//button[contains(.,'Sign Up')]");
    public static final Target MENSAJECREACIONUSUARIO = Target.the("MensajeEsperadoCreacionUsuario").locatedBy("//strong[contains(.,'Nothing Booked Yet')]");
}
