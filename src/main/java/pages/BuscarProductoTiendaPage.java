package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class BuscarProductoTiendaPage extends PageObject {


    //txtBuscador
    @FindBy(id="search_query_top")
    WebElementFacade txtBuscador;

    //Resultados
    @FindBy(className="product-container")
    List<WebElementFacade> resultadosList;


    public void buscarProductoTienda(){
        txtBuscador.sendKeys("Printed Dress");
        txtBuscador.sendKeys(Keys.ENTER);
    }

    public void validarCantidadResultadosList(){
        List<WebElementFacade> lsresultados = resultadosList;
        int cantidadResult = lsresultados.size();
        Assert.assertTrue("Los resultados no son menores o iguales a 5:" + cantidadResult, cantidadResult < 6);

    }
}