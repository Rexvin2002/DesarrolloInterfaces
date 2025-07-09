# Salida Segura con Confirmación

## Descripción  
Este programa es una aplicación de escritorio que implementa un sistema de salida segura con confirmación mediante diálogos modales. La aplicación consta de una ventana principal con un botón de salida que abre un diálogo de confirmación antes de cerrar el programa.

## Características principales  
- Sistema de confirmación en dos pasos para salir del programa  
- Interfaz gráfica intuitiva desarrollada con Java Swing  
- Diálogo modal personalizado con efectos visuales en botones  
- Prevención del cierre accidental mediante `DO_NOTHING_ON_CLOSE`  
- Efectos hover y click en botones para mejor experiencia de usuario  

## Componentes principales  

### SalirSeguro (Ventana principal)  
- `jLabelTitulo`: Muestra el título "SALIDA SEGURA"  
- `jLabelSubtitulo`: Muestra el subtítulo descriptivo  
- `jButtonSalir`: Botón que abre el diálogo de confirmación  

### SeguroSalida (Diálogo de confirmación)  
- `jLabelMensaje`: Muestra el mensaje de confirmación  
- `jButtonVolver`: Botón para cancelar y volver a la aplicación  
- `jButtonSalir`: Botón rojo para confirmar la salida  

## Funcionalidad  
1. El usuario hace clic en "SALIR" en la ventana principal  
2. Se abre un diálogo modal de confirmación con dos opciones:  
   - **VOLVER**: Cierra el diálogo y continúa en la aplicación  
   - **SALIR**: Cierra completamente el programa  
3. La ventana principal no puede cerrarse directamente (requiere usar el botón)  

## Requisitos  
- Java 8 o superior instalado  
- Entorno de ejecución Java (JRE)  

## Instrucciones de uso  
1. Ejecutar el programa (el método main está en la clase `SalirSeguro`)  
2. Hacer clic en el botón "SALIR" de la ventana principal  
3. En el diálogo de confirmación:  
   - Seleccionar "VOLVER" para cancelar y seguir usando la aplicación  
   - Seleccionar "SALIR" para terminar el programa  

## Efectos visuales en botones  
- **Botón VOLVER**:  
  - Color de fondo blanco con borde negro  
  - Cambia a gris claro al pasar el ratón  
  - Cambia a gris oscuro al hacer clic  

- **Botón SALIR**:  
  - Color de fondo rojo (#CC0000) con texto blanco  
  - Cambia a rojo oscuro (#960000) al pasar el ratón  
  - Cambia a rojo más oscuro (#640000) al hacer clic  

## Autor  
Kevin Gómez Valderas - 2º DAM  

## Notas técnicas  
- Utiliza el look and feel "Nimbus" de Java Swing  
- Implementa `MouseListener` para efectos interactivos en botones  
- La ventana de diálogo es modal y se centra en pantalla  
- Todos los componentes tienen tamaño fijo para consistencia visual  

## Licencia  
Este código se proporciona libremente para fines educativos. Se permite su uso y modificación siempre que se mantenga esta nota de atribución.