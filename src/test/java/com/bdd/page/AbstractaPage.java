package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://opencart.abstracta.us/")
public class AbstractaPage extends PageObject {
    @FindBy(xpath = "//button[@onclick=\"cart.add('43');\"]")
    WebElement Btn_AddToCart1;
    @FindBy(xpath = "//button[@onclick=\"cart.add('40');\"]")
    WebElement Btn_AddToCart2;
    @FindBy(xpath = "//span[text()='Shopping Cart']")
    WebElement Btn_ShoppingCart;

    @FindBy(xpath = "//a[text()='Checkout']")
    WebElement Btn_Checkout;
    @FindBy(xpath = "//input[@type='radio'][@name='account'][@value='guest']")
    WebElement Radio_Guest;
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement Btn_Continue;
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement Txt_firstName;
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement Txt_lastName;
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement Txt_email;
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement Txt_telephone;
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement Txt_address;
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement Txt_city;
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement Txt_postCode;
    @FindBy(xpath = "//option[contains(text(),'Peru')]")
    WebElement Slc_Country;
    @FindBy(xpath = "//option[contains(text(),'Ancash')]")
    WebElement Slc_Region;
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement Btn_ContinueGuest;
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    WebElement Btn_ContinueShipping;
    @FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[3]/div[1]/input[1]")
    WebElement Chk_Terminos;
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement Btn_ContinuePayment;
    @FindBy(xpath = "//input[@id='button-confirm']")
    WebElement Btn_Confirm;

    @FindBy(xpath = "//body/div[@id='common-success']/div[1]/div[1]/h1[1]")
    WebElement Lbl_Resultado;


    public void abrirLaPaginaAbstractaEnUnNavegador(String navegador) {
        Browser.Start(this, navegador);
    }

    public void hacerClickEnElBotónAgregarCarritaDelPrimerProducto() {
        try{
            Thread.sleep(2000);
        }catch (Exception x){}
    Btn_AddToCart1.click();
    }

    public void hacerClickEnElBotónAgregarCarritaDelSegundoProducto() {
        try{
            Thread.sleep(2000);
        }catch (Exception x){}
        Btn_AddToCart2.click();
    }

    public void hacerClickEnVerElCarrito() {
        try{
            Thread.sleep(2000);
        }catch (Exception x){}
        Btn_ShoppingCart.click();
    }

    public void hacerClickEnElBotónCheckout() {
        try{
            Thread.sleep(2000);
        }catch (Exception x){}
        Btn_Checkout.click();
    }

    public void seleccionarGuestCheckout() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Radio_Guest.click();
    }

    public void hacerClickEnElBotónContinue() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Btn_Continue.click();
    }

    public void escribimosEnElCuadroDeTextoFirstName(String FirstName) {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Txt_firstName.sendKeys(FirstName);
    }

    public void escribimosEnElCuadroDeTextoLastName(String LastName) {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Txt_lastName.sendKeys(LastName);
    }

    public void escribimosEnElCuadroDeTextoEMail(String Email) {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Txt_email.sendKeys(Email);
    }

    public void escribimosEnElCuadroDeTextoTelephone(String Telephone) {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Txt_telephone.sendKeys(Telephone);
    }

    public void escribimosEnElCuadroDeTextoAddress(String Address) {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Txt_address.sendKeys(Address);
    }

    public void escribimosEnElCuadroDeTextoCity(String City) {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Txt_city.sendKeys(City);
    }

    public void escribimosEnElCuadroDeTextoPostCode(String PostCode) {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Txt_postCode.sendKeys(PostCode);
    }
    public void seleccionarElCountry() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Slc_Country.click();
    }
    public void seleccionarLaRegión() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Slc_Region.click();
    }

    public void hacerClickEnElBotónContinueDelBillingDetails() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Btn_ContinueGuest.click();
    }

    public void hacerClickEnElBotónContinueDelDeliveryMethod() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Btn_ContinueShipping.click();
    }

    public void hacerClickEnElCheckboxDeTérminosYCondiciones() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Chk_Terminos.click();
    }

    public void hacerClickEnElBotónContinueDelPaymentMethod() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Btn_ContinuePayment.click();
    }

    public void hacerClickEnElBotónConfirmOrder() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        Btn_Confirm.click();
    }

    public void validamosQueElPedidoHayaSidoProcesadoConÉxito() {
        try{
            Thread.sleep(1000);
        }catch (Exception x){}
        if (Lbl_Resultado.isDisplayed()){
            Assert.assertTrue(true);
        }else{
            Assert.fail("Error al completar el pedido");
        }
        try{
            Thread.sleep(5000);
        }catch (Exception x){}
    }
}
