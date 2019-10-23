package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;

@DefaultUrl("http://automationpractice.com/index.php")
public class TiendaLogueoPage extends PageObject {

    //Link Login
    @FindBy(className="login")
    WebElementFacade linkLogin;

    //TXT Email
    @FindBy(id="email")
    WebElementFacade txtEmail;

    //TXT Password
    @FindBy(id="passwd")
    WebElementFacade txtPassword;

    //BTN Login
    @FindBy(id="SubmitLogin")
    WebElementFacade btnLogin;

    //Cuenta
    @FindBy(className="page-heading")
    WebElementFacade LnameCuenta;


    public void IngresarDatos(String strUser, String strPassword) {
        linkLogin.click();
        waitFor(1).seconds();
        txtEmail.sendKeys(strUser);
        txtPassword.sendKeys(strPassword);
        btnLogin.click();
    }

    public void validarLogeoCorrecto(){
        MatcherAssert.assertThat(LnameCuenta.getText(), Is.is(Matchers.equalTo("MY ACCOUNT")));
    }

}