$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/web/Abstracta.feature");
formatter.feature({
  "name": "Validación del filtro de la página Abstracta",
  "description": "  Como usuario de Abstracta abro la pagina\n  Quiero hacer la compra de dos productos\n  Para validar el funcionamiento del carrito",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@FEATURE_ABSTRACTA"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validar Filtro de busqueda",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@ESCENARIO1_ABSTRACTA"
    }
  ]
});
formatter.step({
  "name": "Abrir la pagina Abstracta en un navegador \"chrome\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "Hacer click en el botón agregar carrita del primer producto",
  "keyword": "Y "
});
formatter.step({
  "name": "Hacer click en el botón agregar carrita del segundo producto",
  "keyword": "Y "
});
formatter.step({
  "name": "Hacer click en ver el carrito",
  "keyword": "Y "
});
formatter.step({
  "name": "Hacer click en el botón Checkout",
  "keyword": "Y "
});
formatter.step({
  "name": "Seleccionar Guest Checkout",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en el botón Continue",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cFirstName\u003e\" en el cuadro de texto First Name",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cLastName\u003e\" en el cuadro de texto Last Name",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cEmail\u003e\" en el cuadro de texto E-mail",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cTelephone\u003e\" en el cuadro de texto Telephone",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cAddress\u003e\" en el cuadro de texto Address",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cCity\u003e\" en el cuadro de texto City",
  "keyword": "Y "
});
formatter.step({
  "name": "escribimos \"\u003cPostCode\u003e\" en el cuadro de texto PostCode",
  "keyword": "Y "
});
formatter.step({
  "name": "Seleccionar el Country",
  "keyword": "Y "
});
formatter.step({
  "name": "Seleccionar la Región",
  "keyword": "Y "
});
formatter.step({
  "name": "hacer click en el botón Continue del Billing Details",
  "keyword": "Y "
});
formatter.step({
  "name": "Hacer click en el botón Continue del Delivery Method",
  "keyword": "Y "
});
formatter.step({
  "name": "Hacer click en el Checkbox de Términos y Condiciones",
  "keyword": "Y "
});
formatter.step({
  "name": "Hacer click en el botón Continue del Payment Method",
  "keyword": "Y "
});
formatter.step({
  "name": "Hacer click en el botón Confirm Order",
  "keyword": "Y "
});
formatter.step({
  "name": "validamos que el pedido haya sido procesado con éxito",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Telephone",
        "Address",
        "City",
        "PostCode"
      ]
    },
    {
      "cells": [
        "Luis",
        "Marcelo Gómez",
        "luisricardo@gmail.com",
        "929166766",
        "N Garatea mz101 lt.52",
        "Nuevo Chimbote",
        "27111"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar Filtro de busqueda",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@FEATURE_ABSTRACTA"
    },
    {
      "name": "@ESCENARIO1_ABSTRACTA"
    }
  ]
});
formatter.step({
  "name": "Abrir la pagina Abstracta en un navegador \"chrome\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "AbstractaStepDefinition.abrirLaPaginaAbstractaEnUnNavegador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hacer click en el botón agregar carrita del primer producto",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnElBotónAgregarCarritaDelPrimerProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hacer click en el botón agregar carrita del segundo producto",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnElBotónAgregarCarritaDelSegundoProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hacer click en ver el carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnVerElCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hacer click en el botón Checkout",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnElBotónCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seleccionar Guest Checkout",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.seleccionarGuestCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en el botón Continue",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnElBotónContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Luis\" en el cuadro de texto First Name",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.escribimosEnElCuadroDeTextoFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Marcelo Gómez\" en el cuadro de texto Last Name",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.escribimosEnElCuadroDeTextoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"luisricardo@gmail.com\" en el cuadro de texto E-mail",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.escribimosEnElCuadroDeTextoEMail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"929166766\" en el cuadro de texto Telephone",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.escribimosEnElCuadroDeTextoTelephone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"N Garatea mz101 lt.52\" en el cuadro de texto Address",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.escribimosEnElCuadroDeTextoAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"Nuevo Chimbote\" en el cuadro de texto City",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.escribimosEnElCuadroDeTextoCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escribimos \"27111\" en el cuadro de texto PostCode",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.escribimosEnElCuadroDeTextoPostCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seleccionar el Country",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.seleccionarElCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seleccionar la Región",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.seleccionarLaRegión()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hacer click en el botón Continue del Billing Details",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnElBotónContinueDelBillingDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hacer click en el botón Continue del Delivery Method",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnElBotónContinueDelDeliveryMethod()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hacer click en el Checkbox de Términos y Condiciones",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnElCheckboxDeTérminosYCondiciones()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hacer click en el botón Continue del Payment Method",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnElBotónContinueDelPaymentMethod()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hacer click en el botón Confirm Order",
  "keyword": "Y "
});
formatter.match({
  "location": "AbstractaStepDefinition.hacerClickEnElBotónConfirmOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validamos que el pedido haya sido procesado con éxito",
  "keyword": "Entonces "
});
formatter.match({
  "location": "AbstractaStepDefinition.validamosQueElPedidoHayaSidoProcesadoConÉxito()"
});
formatter.result({
  "status": "passed"
});
});