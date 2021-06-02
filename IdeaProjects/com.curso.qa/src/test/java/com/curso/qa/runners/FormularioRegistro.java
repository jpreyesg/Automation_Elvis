package com.curso.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "/Users/macbookpro/IdeaProjects/com.curso.qa/src/test/resources/features/formulario_registro.feature",
        glue = "com.curso.qa.stepsdefinitions", snippets = SnippetType.CAMELCASE)
public class FormularioRegistro {
}
