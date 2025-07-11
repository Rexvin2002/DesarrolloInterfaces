# Juego de Paneles - Sistema Interactivo

## Descripción
Este proyecto Java Swing implementa un sistema interactivo que permite alternar entre diferentes paneles de acciones y resultados, con funcionalidades para contar pulsaciones de botones y mostrar selecciones de opciones.

## Características principales
- **Interfaz modular**: Alterna entre paneles de Acciones y Resultados
- **Dos modos de acciones**:
  - Panel de botones (B1-B4) con contador de pulsaciones
  - Panel de opciones con checkboxes (Leer, Escalada, Esquiar, Submarinismo)
- **Dos modos de resultados**:
  - Tabla de recuento de pulsaciones
  - Área de texto con opciones seleccionadas
- **Diseño flexible**: Uso de CardLayout para cambiar entre vistas

## Estructura del proyecto
### Clases principales:
1. **Main**: Punto de entrada de la aplicación
2. **VentanaPrincipal**: Interfaz gráfica principal
3. **ContadorPulsaciones**: Lógica para contar pulsaciones de botones

## Funcionalidades clave
- Contador de pulsaciones para cada botón
- Visualización de opciones seleccionadas
- Cambio dinámico entre paneles usando CardLayout
- Diseño responsive con tamaños mínimos definidos

## Uso
1. Seleccionar entre paneles de "ACCIONES" o "RESULTADOS"
2. En Acciones:
   - Elegir entre "Botones" o "Opciones"
   - Interactuar con los elementos correspondientes
3. En Resultados:
   - Elegir entre "Pulsaciones" o "Selecciones"
   - Ver la información recopilada

## Autor
Kevin Gómez Valderas - 2º DAM

## Notas técnicas
- Utiliza el look and feel Nimbus
- Implementa el patrón MVC (Modelo-Vista-Controlador)
- Usa CardLayout para la gestión de paneles
- Tabla dinámica para mostrar recuento de pulsaciones
- Gestión de eventos con ActionListener