package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.TiendaLogueoSteps;

import java.util.List;
import java.util.Map;

public class TiendaLogueoDefinition {

    @Steps
    TiendaLogueoSteps tiendaLogueoSteps;


    @Given("^que un usuario ingreso a la página de inicio de tienda ropa$")
    public void queUnUsuarioIngresoALaPáginaDeInicioDeTiendaRopa(){
        tiendaLogueoSteps.irATiendaInicioPage();
    }

    @When("lleno los datos requeridos para el cliente")
    public void llenoLosDatosRequeridosParaElCliente(DataTable logueo) {
        List<Map<String,String>> data = logueo.asMaps(String.class,String.class);
        tiendaLogueoSteps.llenar_formulario(data.get(0).get("Email"),data.get(0).get("Passw"));
    }

    @Then("^el cliente ingresa exitosamente a la cuenta$")
    public void elClienteIngresaExitosamenteALaCuenta(){
        tiendaLogueoSteps.validarLogueo();


    }
}
