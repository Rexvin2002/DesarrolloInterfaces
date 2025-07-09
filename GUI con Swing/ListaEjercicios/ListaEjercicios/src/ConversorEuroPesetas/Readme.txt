# Conversor de Euros a Pesetas

## Descripción
Este programa es una aplicación de escritorio que permite convertir cantidades de euros a pesetas utilizando el tipo de cambio fijo de 1 euro = 166.386 pesetas. La aplicación consta de una interfaz principal y un diálogo para ingresar la cantidad a convertir.

## Características principales
- Conversión precisa de euros a pesetas
- Interfaz gráfica intuitiva desarrollada con Java Swing
- Validación de entrada para asegurar que se ingresen valores numéricos
- Diálogo modal para ingresar la cantidad
- Muestra el resultado en la ventana principal después de la conversión

## Componentes principales

### ConvertidorEuroPeseta (Ventana principal)
- `jLabelTitulo`: Muestra el título de la aplicación
- `jButtonIngresarCantidad`: Botón para abrir el diálogo de conversión
- `jLabelPesetas`: Muestra el resultado de la conversión

### IngresarCantidad (Diálogo de conversión)
- `jTextFieldEuros`: Campo para ingresar la cantidad en euros
- `jButtonConvertirAPesetas`: Botón para realizar la conversión
- `resultado`: Variable que almacena el resultado de la conversión

## Funcionalidad
1. El usuario hace clic en "INGRESA CANTIDAD" en la ventana principal
2. Se abre un diálogo donde ingresa la cantidad en euros
3. Al hacer clic en "CONVERTIR A PESETAS":
   - Si la entrada es válida, realiza la conversión y cierra el diálogo
   - Si la entrada no es válida, muestra un mensaje de error
4. La ventana principal muestra el resultado en pesetas

## Requisitos
- Java 8 o superior instalado
- Entorno de ejecución Java (JRE)

## Instrucciones de uso
1. Ejecutar el programa (el método main está en la clase `ConvertidorEuroPeseta`)
2. Hacer clic en el botón "INGRESA CANTIDAD"
3. Ingresar la cantidad en euros en el campo correspondiente
4. Hacer clic en "CONVERTIR A PESETAS"
5. Ver el resultado en la ventana principal

## Manejo de errores
El programa detecta y maneja los siguientes casos de error:
- Cuando se ingresan valores no numéricos en el campo de euros
- Muestra un mensaje de error claro al usuario
- Permite volver a intentar la conversión sin cerrar la aplicación

## Autor
Kevin Gómez Valderas - 2º DAM

## Notas técnicas
- Tipo de cambio fijo: 1 euro = 166.386 pesetas
- Utiliza el look and feel "Nimbus" de Java Swing
- La ventana de diálogo es modal, lo que evita interactuar con la ventana principal mientras está abierta

## Licencia
Este código se proporciona libremente para fines educativos. Se permite su uso y modificación siempre que se mantenga esta nota de atribución.