# Sistema de Registro de Personas

## Descripción  
Aplicación de escritorio desarrollada en Java Swing para gestionar encuestas de personas con almacenamiento en archivos. Permite registrar información personal, preferencias y hábitos, con capacidad para guardar y cargar los datos desde ficheros.

## Características principales  
- Interfaz gráfica intuitiva con menús y diálogos modales  
- Validación de campos obligatorios  
- Almacenamiento y carga de datos en formato CSV  
- Visualización tabular de registros con formato centrado  
- Diálogos personalizados para formularios, ayuda y manejo de errores  

## Componentes principales  

### MainFrame (Ventana principal)
- `jTableDatos`: Tabla central que muestra todos los registros  
- Menú Archivo: Opción para salir de la aplicación  
- Menú Encuesta: Formulario para añadir nuevos registros  
- Menú Ayuda: Información "Acerca de"  
- Menú Fichero: Opciones para leer/guardar archivos  

### Formulario (Diálogo de encuesta)
- Campos para: Profesión, N° hermanos, Rango de edad, Sexo  
- Checkbox para deporte con lista de deportes disponibles  
- Sliders para valorar afición a compras, TV y cine (1-10)  
- Validación de campo profesión obligatorio  

### Persona (Modelo de datos)
Almacena todos los campos de información:
- Profesión, Hermanos, Edad, Sexo  
- Deporte practicado  
- Nivel de afición a compras, TV y cine  

### About (Diálogo de información)
Muestra detalles de la aplicación:
- Versión, Autor, Página web de referencia  
- Descripción breve de la funcionalidad  

### Error (Diálogo de error)
Muestra mensajes de error con:
- Texto descriptivo del problema  
- Botón para volver y corregir  

## Funcionalidad  
1. **Añadir encuestas**:  
   - Acceso desde menú Encuesta → Realizar Encuesta  
   - Completa todos los campos requeridos  
   - Los datos se añaden automáticamente a la tabla principal  

2. **Gestión de archivos**:  
   - **Guardar**: Exporta todos los registros a archivo CSV  
   - **Cargar**: Importa registros desde archivo CSV existente  

3. **Visualización**:  
   - Tabla con scroll y todas las columnas visibles  
   - Contenido centrado tanto en celdas como en cabeceras  

## Requisitos  
- Java 8 o superior  
- JRE instalado  

## Instrucciones de uso  
1. Ejecutar la clase `MainFrame`  
2. Usar el menú:  
   - "Realizar Encuesta" para añadir registros  
   - "Leer/Escribir" para cargar/guardar datos  
   - "Acerca de" para información de la aplicación  
3. Los datos se validan automáticamente al enviar el formulario  

## Formatos soportados  
- **CSV**: Archivos de texto con valores separados por comas  
  Ejemplo:  
  `Profesión,N°Hermanos,Edad,Sexo,Deporte,Compras,TV,Cine`  

## Autor  
Kevin Gómez Valderas - 2º DAM  

## Notas técnicas  
- Look and Feel Nimbus para interfaz moderna  
- Centrado automático de todas las ventanas  
- Validación de campos obligatorios  
- Persistencia de datos en archivos  
- Diseño responsive para la tabla principal  

## Licencia  
Código libre para fines educativos. Se requiere mantener los créditos del autor.