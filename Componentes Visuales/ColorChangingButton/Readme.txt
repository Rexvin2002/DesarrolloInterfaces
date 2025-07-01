Componente Visual: Botón Cambiante (ColorChangingButton)
Descripción del Componente
El ColorChangingButton es un botón personalizado en Java Swing que alterna su color de fondo cada vez que se hace clic en él. Tiene las siguientes características:

Color por defecto:

Si no se especifica, usa el color normal de un JButton.

Se puede configurar mediante una propiedad (defaultColor).

Alternancia de color:

Si está activado (colorChangeEnabled = true), cambia de color al hacer clic.

Si está desactivado (colorChangeEnabled = false), funciona como un botón normal.

Color secundario:

Si el cambio de color está activado, se puede definir un secondaryColor.

Si no se define, usará un color aleatorio.

Nombre del componente:

ColorChangingButton (extiende JButton).