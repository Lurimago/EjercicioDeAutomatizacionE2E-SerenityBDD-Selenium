package com.bdd.stepdefinition;

import com.bdd.step.AbstractaStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class AbstractaStepDefinition {
    @Steps
    AbstractaStep abstractaStep;

    @Dado("^Abrir la pagina Abstracta en un navegador \"([^\"]*)\"$")
    public void abrirLaPaginaAbstractaEnUnNavegador(String navegador) throws Throwable {
        abstractaStep.abrirLaPaginaAbstractaEnUnNavegador(navegador);
    }

    @Y("^Hacer click en el botón agregar carrita del primer producto$")
    public void hacerClickEnElBotónAgregarCarritaDelPrimerProducto() {
        abstractaStep.hacerClickEnElBotónAgregarCarritaDelPrimerProducto();

    }

    @Y("^Hacer click en el botón agregar carrita del segundo producto$")
    public void hacerClickEnElBotónAgregarCarritaDelSegundoProducto() {
        abstractaStep.hacerClickEnElBotónAgregarCarritaDelSegundoProducto();
    }

    @Y("^Hacer click en ver el carrito$")
    public void hacerClickEnVerElCarrito() {
        abstractaStep.hacerClickEnVerElCarrito();
    }

    @Y("^Hacer click en el botón Checkout$")
    public void hacerClickEnElBotónCheckout() {
        abstractaStep.hacerClickEnElBotónCheckout();
    }

    /*@Y("^Seleccionar Guest Checkout y hacer click en el botón Continue$")
    public void seleccionarGuestCheckoutYHacerClickEnElBotónContinue() {
        abstractaStep.seleccionarGuestCheckoutYHacerClickEnElBotónContinue();
    }*/

    @Y("^Seleccionar Guest Checkout$")
    public void seleccionarGuestCheckout() {
        abstractaStep.seleccionarGuestCheckout();

    }

    @Y("^hacer click en el botón Continue$")
    public void hacerClickEnElBotónContinue() {
        abstractaStep.hacerClickEnElBotónContinue();
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto First Name$")
    public void escribimosEnElCuadroDeTextoFirstName(String FirstName) throws Throwable {
        abstractaStep.escribimosEnElCuadroDeTextoFirstName(FirstName);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Last Name$")
    public void escribimosEnElCuadroDeTextoLastName(String LastName) throws Throwable {
        abstractaStep.escribimosEnElCuadroDeTextoLastName(LastName);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto E-mail$")
    public void escribimosEnElCuadroDeTextoEMail(String Email) throws Throwable {
        abstractaStep.escribimosEnElCuadroDeTextoEMail(Email);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Telephone$")
    public void escribimosEnElCuadroDeTextoTelephone(String Telephone) throws Throwable {
        abstractaStep.escribimosEnElCuadroDeTextoTelephone(Telephone);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto Address$")
    public void escribimosEnElCuadroDeTextoAddress(String Address) throws Throwable {
        abstractaStep.escribimosEnElCuadroDeTextoAddress(Address);
    }

    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto City$")
    public void escribimosEnElCuadroDeTextoCity(String City) throws Throwable {
        abstractaStep.escribimosEnElCuadroDeTextoCity(City);
    }



    @Y("^escribimos \"([^\"]*)\" en el cuadro de texto PostCode$")
    public void escribimosEnElCuadroDeTextoPostCode(String PostCode) throws Throwable {
        abstractaStep.escribimosEnElCuadroDeTextoPostCode(PostCode);
    }

    @Y("^Seleccionar el Country$")
    public void seleccionarElCountry() {
        abstractaStep.seleccionarElCountry();
    }

    @Y("^Seleccionar la Región$")
    public void seleccionarLaRegión() {
        abstractaStep.seleccionarLaRegión();
    }

    @Y("^hacer click en el botón Continue del Billing Details$")
    public void hacerClickEnElBotónContinueDelBillingDetails() {
        abstractaStep.hacerClickEnElBotónContinueDelBillingDetails();
    }

    @Y("^Hacer click en el botón Continue del Delivery Method$")
    public void hacerClickEnElBotónContinueDelDeliveryMethod() {
        abstractaStep.hacerClickEnElBotónContinueDelDeliveryMethod();
    }

    @Y("^Hacer click en el Checkbox de Términos y Condiciones$")
    public void hacerClickEnElCheckboxDeTérminosYCondiciones() {
        abstractaStep.hacerClickEnElCheckboxDeTérminosYCondiciones();

    }

    @Y("^Hacer click en el botón Continue del Payment Method$")
    public void hacerClickEnElBotónContinueDelPaymentMethod() {
        abstractaStep.hacerClickEnElBotónContinueDelPaymentMethod();
    }

    @Y("^Hacer click en el botón Confirm Order$")
    public void hacerClickEnElBotónConfirmOrder() {
        abstractaStep.hacerClickEnElBotónConfirmOrder();
    }

    @Entonces("^validamos que el pedido haya sido procesado con éxito$")
    public void validamosQueElPedidoHayaSidoProcesadoConÉxito() {
        abstractaStep.validamosQueElPedidoHayaSidoProcesadoConÉxito();
    }
}
