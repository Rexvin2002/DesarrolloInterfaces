# ColorPanel - Aplicación de Cambio de Colores

## Descripción
Esta aplicación Java Swing permite cambiar los colores de diferentes paneles de la interfaz mediante botones de colores y opciones de selección.

## Características principales
- **Botones de colores**: Rojo, Azul, Verde y Rosa
- **Opciones de aplicación**:
  - Rejilla: Cambia el color del panel de botones
  - Fondo: Cambia el color del panel principal
  - Listado: Cambia el color del panel lateral
- **Botón de restablecimiento**: Vuelve a los colores originales

## Funcionamiento
1. Seleccione una de las opciones de aplicación (Rejilla, Fondo o Listado)
2. Pulse uno de los botones de color para aplicar el color seleccionado
3. Cuando todos los paneles hayan sido coloreados, aparecerá el botón "Restablecer"
4. Use el botón "Restablecer" para volver a los colores originales

## Estructura del código
- **jPanelMain**: Panel principal que contiene todos los elementos
- **jPanelBotones**: Panel con los botones de colores
- **jPanelListado**: Panel lateral con las opciones de aplicación
- **Método setColor()**: Controla la aplicación de colores según la selección

## Autor
Kevin Gómez Valderas - 2º DAM

## Notas técnicas
- Utiliza el look and feel Nimbus
- La interfaz tiene un tamaño fijo
- Usa ButtonGroup para las opciones de aplicación (mutuamente excluyentes)
- El botón de restablecimiento solo aparece después de colorear todos los paneles