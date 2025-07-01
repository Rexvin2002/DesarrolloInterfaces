# Explicación de la Aplicación de Gestión de Club Deportivo

Esta aplicación permite administrar los socios y deportes de un club deportivo con todas las funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar), además de filtrado y ordenación.

## Funcionalidades principales:

### 1. Gestión de Socios
- **Visualización en tabla**: Muestra datos de socios con columnas para código (String), nombre (String), edad (int), cuota (double) y número de deportes inscritos (calculado automáticamente).
- **Operaciones CRUD**:
  - **Añadir**: Abre un diálogo para ingresar nuevos datos del socio
  - **Borrar**: Elimina el socio seleccionado
  - **Modificar**: Permite editar los datos de un socio existente (excepto su código)
  - **Consultar**: Muestra los detalles completos de un socio

### 2. Gestión de Deportes
- Tabla independiente con información de deportes (código, descripción, niveles)
- Permite realizar las mismas operaciones CRUD que con los socios

### 3. Inscripciones a Deportes
- Cada socio puede inscribirse en múltiples deportes
- En el diálogo de socio se muestra:
  - Lista de deportes disponibles en un desplegable para añadir
  - Tabla con los deportes actuales del socio para poder eliminarlos
  - Posibilidad de seleccionar nivel para cada deporte

### 4. Filtrado y Ordenación
- **Ordenación**: Mediante dos combobox para seleccionar:
  1. Campo por el que ordenar (nombre, edad, cuota, etc.)
  2. Orden (ascendente/descendente)
- **Filtrado**: 
  - Campo de texto para ingresar condición de filtro
  - Combobox para seleccionar el campo a filtrar

### 5. Interfaz de Usuario
- **Ventana principal**: 
  - Pestañas para alternar entre vista de socios y deportes
  - Botones para operaciones CRUD
  - Panel de filtrado/ordenación
- **Diálogos modales**:
  - Para añadir/editar socios
  - Para gestionar deportes
  - Para ver detalles completos (modo solo lectura)

### 6. Validaciones y Estado de la UI
- Los botones se habilitan/deshabilitan según contexto:
  - "Borrar" y "Modificar" solo disponibles con socio seleccionado
  - Campos obligatorios marcados en diálogos
  - Prevención de modificaciones no permitidas (como cambiar códigos)

### 7. Datos en Memoria
- Se usan tres listas (ArrayList) para almacenar:
  1. Socios del club
  2. Deportes disponibles
  3. Relación de inscripciones (qué socio practica qué deporte y en qué nivel)

Esta aplicación proporciona una solución completa para la gestión administrativa de un club deportivo, permitiendo mantener organizada la información de socios, deportes e inscripciones con una interfaz intuitiva y todas las operaciones básicas necesarias.