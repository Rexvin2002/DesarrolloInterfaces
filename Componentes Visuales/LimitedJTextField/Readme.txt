# LimitedJTextField

## Descripción
Este proyecto implementa un componente personalizado `LimitedJTextField` que extiende `JTextField` de Swing, añadiendo funcionalidad para limitar la cantidad de texto y cambiar automáticamente los colores cuando se supera dicho límite.

## Características principales
- Campo de texto con límite de caracteres configurable
- Cambio automático de colores (foreground y background) cuando se supera el límite
- Configuración personalizable de colores para ambos estados (dentro y fuera del límite)
- Soporte completo para editores de propiedades en entornos de desarrollo
- Implementación serializable para persistencia

## Componentes principales

### LimitedJTextField
- Clase principal que hereda de JTextField
- Monitorea los cambios en el texto mediante DocumentListener
- Actualiza colores dinámicamente según el límite establecido

### LimitedText
- Clase de configuración que almacena:
  - Colores para cuando no se supera el límite
  - Colores para cuando se supera el límite
  - Valor del límite de caracteres

### LimitedTextProperties
- Panel de configuración visual para el editor de propiedades
- Permite seleccionar colores mediante JColorChooser
- Permite establecer el límite de caracteres

### LimitedTextPropertyEditorSupport
- Editor de propiedades personalizado para entornos de desarrollo
- Soporta edición visual de la configuración

## Uso básico

1. Crear una instancia del componente:
```java
LimitedJTextField textField = new LimitedJTextField();
```

2. Configurar los parámetros (opcional):
```java
LimitedText config = new LimitedText(
    Color.BLACK,  // Foreground sin superar
    Color.WHITE,  // Background sin superar  
    Color.RED,    // Foreground superando
    Color.YELLOW, // Background superando
    10            // Límite de caracteres
);
textField.setLimitedTextConfig(config);
```

3. Añadir el componente a la interfaz como cualquier JTextField estándar.

## Personalización

Los parámetros configurables son:
- `foregroundSinSuperarLimite`: Color del texto cuando no se supera el límite
- `backgroundSinSuperarLimite`: Color de fondo cuando no se supera el límite
- `foregroundSuperandoLimite`: Color del texto cuando se supera el límite
- `backgroundSuperandoLimite`: Color de fondo cuando se supera el límite
- `textLimit`: Número máximo de caracteres permitidos

## Requisitos
- Java 8 o superior
- Entorno compatible con Swing

## Autor
Kevin Gómez Valderas - 2º DAM

## Notas
El componente está diseñado para ser utilizado en entornos de desarrollo que soporten JavaBeans, pero también puede usarse directamente en código.

## Licencia
Este código se proporciona libremente para fines educativos. Se permite su uso y modificación siempre que se mantenga esta nota de atribución.