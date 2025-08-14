NO FINALIZADO

# README - Generador de Informes de Clientes y Trabajos

## Descripción del Proyecto
Este proyecto consiste en una aplicación que permite seleccionar un cliente de una base de datos y generar un informe en PDF que muestre los trabajos realizados por dicho cliente en un plazo de un mes. El informe incluye detalles de cada trabajo, un resumen de gastos y un gráfico circular que representa el total gastado.

## Base de Datos
- **Nombre de la BD**: `ClientesTrabajosEmpleados.db`
- **Archivos necesarios**:
  - `ClientesTrabajosEmpleados.sql` (script de creación y datos).
  - Ambos archivos deben ubicarse en la sección **RECURSOS**.

### Estructura de las Tablas
1. **Tabla Cliente**:
   - `IDCliente` (entero, autoincremental).
   - `Nombre`, `Apellidos`, `FechaNac`, `Sexo`, `Casado` (no nulos).

2. **Tabla Trabajo**:
   - `IDTrabajo` (entero, autoincremental).
   - `Nombre` (no nulo), `Descripción`, `IDCliente` (no nulo).

3. **Tabla Empleado**:
   - `IDEmpleado` (entero, autoincremental).
   - `Nombre`, `Apellidos`, `DNI`, `Sueldo` (no nulos).

4. **Tabla TrabajoEmpleados**:
   - `ID` (entero, autoincremental).
   - `IDTrabajo`, `IDEmpleado` (no nulos).

### Datos de Ejemplo
- **Clientes**:
  - Maria Rosa Rosa, Miguel Ángel Marrón Marrón, Sandra Azul Azul.
- **Trabajos**:
  - Ejemplos: "Ayuntamiento Guadix: aceras", "Banco BB", "Construcción edificio".
- **Empleados**:
  - 10 empleados con datos como nombre, apellidos, DNI y sueldo.

## Funcionalidades
1. **Selección de Cliente**:
   - El usuario puede seleccionar un cliente de la lista existente.

2. **Generación de Informe**:
   - Muestra la lista de trabajos asociados al cliente seleccionado.
   - Para cada trabajo, se incluye:
     - Nombre y descripción.
     - Empleados asignados y sueldo asociado.
   - Resumen de gastos totales por trabajo.
   - Gráfico circular que representa el gasto total del mes.

## Requisitos Técnicos
- **Lenguaje/Plataforma**: A definir (ej. Python con SQLite y librerías para PDF).
- **Dependencias**:
  - Librería para generación de PDF (ej. `reportlab` o `fpdf`).
  - Librería para gráficos (ej. `matplotlib`).

## Ejemplo de Informe
El informe generado tendrá la siguiente estructura:
1. **Cabecera**: Datos del cliente (nombre, apellidos, etc.).
2. **Lista de Trabajos**:
   - Nombre y descripción de cada trabajo.
   - Empleados asignados y sueldo.
3. **Resumen**:
   - Total gastado por trabajo.
   - Gráfico circular con el gasto total del mes.

## Instrucciones de Uso
1. Ejecutar la aplicación.
2. Seleccionar un cliente de la lista.
3. Generar el informe en PDF.
4. El informe se guardará en la ubicación especificada.

## Notas Adicionales
- Los trabajos se asumen realizados en un plazo de un mes.
- El gráfico puede adaptarse según los datos disponibles.