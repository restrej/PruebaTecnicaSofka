package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.BuscarProductoTiendaSteps;

public class BuscarProductoTiendaDefinition {

    @Steps
    BuscarProductoTiendaSteps buscarProductoTiendaSteps;

    @When("^él busca la palabra de Printed Dress$")
    public void élBuscaLaPalabraDePrintedDress(){
        buscarProductoTiendaSteps.buscarProducto();
    }

    @Then("^validar la cantidad de resultados sea menor o igual a cinco productos$")
    public void validarLaCantidadDeResultadosSeaMenorOIgualACincoProductos(){
        buscarProductoTiendaSteps.validarCantidadResultados();
    }
}
