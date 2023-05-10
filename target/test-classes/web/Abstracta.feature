#language: es
@FEATURE_ABSTRACTA
Característica: Validación del filtro de la página Abstracta
  Como usuario de Abstracta abro la pagina
  Quiero hacer la compra de dos productos
  Para validar el funcionamiento del carrito


  @ESCENARIO1_ABSTRACTA
  Esquema del escenario: Validar Filtro de busqueda
    Dado Abrir la pagina Abstracta en un navegador "chrome"
    Y Hacer click en el botón agregar carrita del primer producto
    Y Hacer click en el botón agregar carrita del segundo producto
    Y Hacer click en ver el carrito
    Y Hacer click en el botón Checkout
    Y Seleccionar Guest Checkout
    Y hacer click en el botón Continue
    Y escribimos "<FirstName>" en el cuadro de texto First Name
    Y escribimos "<LastName>" en el cuadro de texto Last Name
    Y escribimos "<Email>" en el cuadro de texto E-mail
    Y escribimos "<Telephone>" en el cuadro de texto Telephone
    Y escribimos "<Address>" en el cuadro de texto Address
    Y escribimos "<City>" en el cuadro de texto City
    Y escribimos "<PostCode>" en el cuadro de texto PostCode
    Y Seleccionar el Country
    Y Seleccionar la Región
    Y hacer click en el botón Continue del Billing Details
    Y Hacer click en el botón Continue del Delivery Method
    Y Hacer click en el Checkbox de Términos y Condiciones
    Y Hacer click en el botón Continue del Payment Method
    Y Hacer click en el botón Confirm Order
    Entonces validamos que el pedido haya sido procesado con éxito

    Ejemplos:
      | FirstName | LastName      | Email                 | Telephone | Address               | City           | PostCode|
      | Luis      | Marcelo Gómez | luisricardo@gmail.com | 929166766 | N Garatea mz101 lt.52 | Nuevo Chimbote | 27111   |