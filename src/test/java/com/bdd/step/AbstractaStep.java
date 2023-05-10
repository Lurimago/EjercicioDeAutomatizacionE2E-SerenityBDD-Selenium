package com.bdd.step;

import com.bdd.page.AbstractaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AbstractaStep extends ScenarioSteps {

    AbstractaPage abstractaPage;

    @Step
    public void abrirLaPaginaAbstractaEnUnNavegador(String navegador) throws Throwable {
        abstractaPage.abrirLaPaginaAbstractaEnUnNavegador(navegador);
    }

    @Step
    public void hacerClickEnElBotónAgregarCarritaDelPrimerProducto() {
        abstractaPage.hacerClickEnElBotónAgregarCarritaDelPrimerProducto();
    }

    @Step
    public void hacerClickEnElBotónAgregarCarritaDelSegundoProducto() {
        abstractaPage.hacerClickEnElBotónAgregarCarritaDelSegundoProducto();
    }

    @Step
    public void hacerClickEnVerElCarrito() {
        abstractaPage.hacerClickEnVerElCarrito();
    }

    @Step
    public void hacerClickEnElBotónCheckout() {
        abstractaPage.hacerClickEnElBotónCheckout();
    }

    /*public void seleccionarGuestCheckoutYHacerClickEnElBotónContinue() {
        abstractaPage.seleccionarGuestCheckoutYHacerClickEnElBotónContinue();
    }*/
    @Step
    public void seleccionarGuestCheckout() {
        abstractaPage.seleccionarGuestCheckout();
    }

    @Step
    public void hacerClickEnElBotónContinue() {
        abstractaPage.hacerClickEnElBotónContinue();
    }

    @Step
    public void escribimosEnElCuadroDeTextoFirstName(String FirstName) {
        abstractaPage.escribimosEnElCuadroDeTextoFirstName(FirstName);
    }

    @Step
    public void escribimosEnElCuadroDeTextoLastName(String LastName) {
        abstractaPage.escribimosEnElCuadroDeTextoLastName(LastName);
    }

    @Step
    public void escribimosEnElCuadroDeTextoEMail(String Email) {
        abstractaPage.escribimosEnElCuadroDeTextoEMail(Email);
    }

    @Step
    public void escribimosEnElCuadroDeTextoTelephone(String Telephone) {
        abstractaPage.escribimosEnElCuadroDeTextoTelephone(Telephone);
    }

    @Step
    public void escribimosEnElCuadroDeTextoAddress(String Address) {
        abstractaPage.escribimosEnElCuadroDeTextoAddress(Address);
    }

    @Step
    public void escribimosEnElCuadroDeTextoCity(String City) {
        abstractaPage.escribimosEnElCuadroDeTextoCity(City);
    }

    @Step
    public void escribimosEnElCuadroDeTextoPostCode(String PostCode) {
        abstractaPage.escribimosEnElCuadroDeTextoPostCode(PostCode);
    }

    @Step
    public void seleccionarElCountry() {
        abstractaPage.seleccionarElCountry();
    }

    @Step
    public void seleccionarLaRegión() {
        abstractaPage.seleccionarLaRegión();
    }

    @Step
    public void hacerClickEnElBotónContinueDelBillingDetails() {
        abstractaPage.hacerClickEnElBotónContinueDelBillingDetails();
    }

    public void hacerClickEnElBotónContinueDelDeliveryMethod() {
        abstractaPage.hacerClickEnElBotónContinueDelDeliveryMethod();
    }

    public void hacerClickEnElCheckboxDeTérminosYCondiciones() {
        abstractaPage.hacerClickEnElCheckboxDeTérminosYCondiciones();
    }

    public void hacerClickEnElBotónContinueDelPaymentMethod() {
        abstractaPage.hacerClickEnElBotónContinueDelPaymentMethod();
    }

    public void hacerClickEnElBotónConfirmOrder() {
        abstractaPage.hacerClickEnElBotónConfirmOrder();
    }

    public void validamosQueElPedidoHayaSidoProcesadoConÉxito() {
        abstractaPage.validamosQueElPedidoHayaSidoProcesadoConÉxito();
    }
}
