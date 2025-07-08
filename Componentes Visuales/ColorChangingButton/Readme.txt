# Botón Cambiante de Color

## Descripción
Este programa implementa un botón personalizado (`ColorChangingButton`) que cambia de color al ser clickeado. El botón también muestra un cursor de mano cuando el ratón pasa sobre él para mejorar la experiencia de usuario.

## Características principales
- Botón que alterna entre dos colores (color por defecto y color secundario) al hacer clic
- Cursor personalizado (mano) cuando el ratón está sobre el botón
- Configuración personalizable de colores
- Posibilidad de activar/desactivar el cambio de color

## Uso básico
1. Crea una instancia de `ColorChangingButton`:
   ```java
   ColorChangingButton myButton = new ColorChangingButton();
   ```

2. Personaliza los colores si es necesario:
   ```java
   myButton.setDefaultColor(Color.BLUE);
   myButton.setSecondaryColor(Color.GREEN);
   ```

3. Añade el botón a tu interfaz gráfica como cualquier otro JButton.

## Métodos disponibles
- `getDefaultColor()` / `setDefaultColor(Color)`: Obtiene/establece el color inicial del botón
- `getSecondaryColor()` / `setSecondaryColor(Color)`: Obtiene/establece el color alternativo
- `isChangeColor()` / `setChangeColor(boolean)`: Habilita/deshabilita la función de cambio de color

## Requisitos
- Java 8 o superior
- Entorno de desarrollo compatible con Swing

## Autor
Kevin Gómez Valderas - 2º DAM

## Notas
El color por defecto del botón es el mismo que un JButton estándar, y el color secundario por defecto es rojo. Estos pueden modificarse según sea necesario.

## Licencia
Este código se proporciona libremente para fines educativos. Se permite su uso y modificación siempre que se mantenga esta nota de atribución.