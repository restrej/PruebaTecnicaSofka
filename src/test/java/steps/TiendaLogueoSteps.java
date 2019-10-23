package steps;

import net.thucydides.core.annotations.Step;
import pages.TiendaLogueoPage;

public class TiendaLogueoSteps {

    TiendaLogueoPage tiendaLogueoPage;

    @Step
    public void irATiendaInicioPage() {
        tiendaLogueoPage.open();
    }

    @Step
    public void llenar_formulario(String strUser,String strPassword){
        tiendaLogueoPage.IngresarDatos(strUser, strPassword);
    }

    @Step
    public void validarLogueo(){
        tiendaLogueoPage.validarLogeoCorrecto();
    }

}
