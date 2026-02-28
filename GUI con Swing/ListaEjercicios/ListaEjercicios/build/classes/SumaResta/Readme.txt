# Calculadora de Suma y Resta Sencilla

## Descripción
Este programa es una aplicación de escritorio simple que permite realizar operaciones básicas de suma y resta entre dos números. La interfaz gráfica está desarrollada con Java Swing.

## Características principales
- Interfaz gráfica intuitiva con campos para ingresar dos números
- Botones para realizar operaciones de suma y resta
- Muestra el resultado de la operación en formato entero o decimal según corresponda
- Validación de entrada para asegurar que se ingresen números válidos
- Manejo de errores para entradas no numéricas

## Componentes de la interfaz
- `jTextFieldN1`: Campo de texto para el primer número
- `jTextFieldN2`: Campo de texto para el segundo número
- `jButtonSumar`: Botón para realizar la suma
- `jButtonRestar`: Botón para realizar la resta
- `jLabelResultado`: Etiqueta que muestra el resultado de la operación

## Funcionalidad
1. El usuario ingresa dos números en los campos de texto
2. Selecciona la operación deseada (suma o resta)
3. El programa calcula el resultado y lo muestra:
   - Si el resultado es un número entero, lo muestra sin decimales
   - Si el resultado es decimal, muestra todos los decimales necesarios
4. En caso de ingresar texto no numérico, muestra un mensaje de error y limpia los campos

## Requisitos
- Java 8 o superior instalado
- Entorno de ejecución Java (JRE)

## Instrucciones de uso
1. Ejecutar el programa (el método main está en la clase `OperacionesSencillas`)
2. Ingresar dos números en los campos correspondientes
3. Hacer clic en el botón "SUMAR" o "RESTAR" según la operación deseada
4. Ver el resultado en la parte inferior de la ventana

## Manejo de errores
El programa detecta y maneja los siguientes casos de error:
- Cuando se ingresan valores no numéricos en los campos
- Muestra un mensaje de error claro al usuario
- Limpia los campos de entrada para permitir un nuevo intento

## Personalización
El programa utiliza el look and feel "Nimbus" de Java Swing, pero puede modificarse cambiando la línea correspondiente en el método main.

## Autor
Kevin Gómez Valderas - 2º DAM

## Licencia
Este código se proporciona libremente para fines educativos. Se permite su uso y modificación siempre que se mantenga esta nota de atribución.