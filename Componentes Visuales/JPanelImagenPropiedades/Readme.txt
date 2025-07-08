# JPanelImagen Personalizado

## Descripción
Este proyecto implementa un componente `JPanelImagen` personalizado que extiende `JPanel` de Swing, añadiendo funcionalidades para mostrar imágenes con opciones de configuración avanzadas como opacidad, ajuste de tamaño y detección de arrastre.

## Características principales
- Visualización de imágenes con soporte para diferentes formatos
- Control de opacidad mediante slider
- Opción para ajustar la imagen al tamaño del panel o mantener su tamaño original
- Detección de gestos de arrastre (drag)
- Configuración personalizable mediante editor de propiedades
- Implementación serializable para persistencia
- Soporte completo para entornos de desarrollo (JavaBeans)

## Componentes principales

### JPanelImagen
- Panel personalizado para mostrar imágenes
- Soporta:
  - Ajuste automático de tamaño o tamaño original
  - Control de opacidad
  - Centrado de imágenes
  - Eventos de arrastre

### PropiedadesImagen
- Clase de configuración que almacena:
  - Ruta de la imagen
  - Nivel de opacidad
  - Flag para ajustar tamaño

### ArrastreListener
- Interfaz para manejar eventos de arrastre

### Editores de propiedades
- `PropiedadesImagenPanel`: Panel visual para configurar propiedades
- `PropiedadesImagenPropertyEditorSupport`: Editor de propiedades para IDEs

## Uso básico

1. Crear una instancia del panel:
```java
JPanelImagen panelImagen = new JPanelImagen();
```

2. Configurar las propiedades (opcional):
```java
PropiedadesImagen propiedades = new PropiedadesImagen(
    new File("ruta/imagen.jpg"), // Archivo de imagen
    0.8f,                        // Opacidad (0.0 a 1.0)
    true                         // Ajustar al tamaño del panel
);
panelImagen.setPropiedadesImagen(propiedades);
```

3. Manejar eventos de arrastre (opcional):
```java
panelImagen.addArrastreListener(() -> {
    System.out.println("¡Arrastre detectado!");
});
```

4. Añadir el panel a la interfaz como cualquier JPanel estándar.

## Personalización

### Propiedades configurables:
- `rutaImagen`: Archivo de imagen a mostrar
- `opacidad`: Nivel de transparencia (0.0 transparente - 1.0 opaco)
- `ajustarTamaño`: Si es true, la imagen se ajusta al tamaño del panel; si es false, se muestra en su tamaño original centrada

### Eventos:
- `arrastre`: Se dispara cuando se detecta un gesto de arrastre sobre el panel

## Requisitos
- Java 8 o superior
- Entorno compatible con Swing

## Autor
Kevin Gómez Valderas - 2º DAM

## Notas
- El componente está diseñado para ser utilizado tanto programáticamente como en entornos de desarrollo visual.
- Para usar el editor de propiedades en un IDE, asegúrese de que las clases `*BeanInfo` y `*PropertyEditorSupport` estén correctamente configuradas en el classpath.

## Licencia
Este código se proporciona libremente para fines educativos. Se permite su uso y modificación siempre que se mantenga esta nota de atribución.