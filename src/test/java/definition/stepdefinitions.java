package definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.CrearPcNuevo;
import step.OpenApp;

public class stepdefinitions {
    @Steps
    OpenApp openApp;
    @Steps
    CrearPcNuevo crearPcNuevo;

    @Given("El usuario quiere agregar un nuevo computador")
    public void elUsuarioQuiereAgregarUnNuevoComputador() {
        openApp.appUrl();
    }

    @When("Seleccione la opción agregar nuevo computador")
    public void seleccioneLaOpcionAgregarNuevoComputador() {
        crearPcNuevo.abrirFormularioDeRegistroPcNuevo();
    }

    @And("ingrese el nombre, fecha introduced, discontinued con el formato \\(AAAA,MM,DD) y compañía")
    public void ingreseElNombreFechaIntroducedDiscontinuedConElFormatoAAAAMMDDYCompania() {
        crearPcNuevo.ingresarDatosPC();
    }

    @And("de clic en el botón {string}")
    public void deClicEnElBoton(String arg0) {
        crearPcNuevo.crearPC(arg0);
    }

    @Then("Sera direccionado al home y el nuevo PC quedara registrado")
    public void seraDireccionadoAlHomeYElNuevoPCQuedaraRegistrado() {
        crearPcNuevo.validation();
    }
}
