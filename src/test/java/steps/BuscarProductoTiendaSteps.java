package steps;

import net.thucydides.core.annotations.Step;
import pages.BuscarProductoTiendaPage;

public class BuscarProductoTiendaSteps {

    BuscarProductoTiendaPage buscarProductoTiendaPage;

    @Step
    public void buscarProducto(){
        buscarProductoTiendaPage.buscarProductoTienda();
    }

    @Step
    public void validarCantidadResultados(){
        buscarProductoTiendaPage.validarCantidadResultadosList();
    }
}