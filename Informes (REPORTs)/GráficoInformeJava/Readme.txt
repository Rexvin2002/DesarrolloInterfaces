Sistema de Informes de Clientes y Trabajos

## Descripción del Proyecto

Este proyecto consiste en un sistema que permite generar informes en PDF para clientes, mostrando los trabajos realizados durante un mes y un resumen del gasto asociado a cada trabajo. El sistema utiliza una base de datos relacional para almacenar la información de clientes, trabajos, empleados y las relaciones entre ellos.

## Base de Datos

### Estructura de la Base de Datos

La base de datos `Empresa` contiene las siguientes tablas:

1. **Cliente**:
   - `IDCliente` (INT, PK, AUTO_INCREMENT)
   - `Nombre` (VARCHAR)
   - `Apellidos` (VARCHAR)
   - `FechaNac` (DATE)
   - `Sexo` (CHAR)
   - `Casado` (BOOLEAN)

2. **Trabajo**:
   - `IDTrabajo` (INT, PK, AUTO_INCREMENT)
   - `IDCliente` (INT, FK)
   - `Nombre` (VARCHAR)
   - `Descripción` (TEXT)

3. **Empleado**:
   - `IDEmpleado` (INT, PK, AUTO_INCREMENT)
   - `Nombre` (VARCHAR)
   - `Apellidos` (VARCHAR)
   - `DNI` (VARCHAR, UNIQUE)
   - `Sueldo` (DECIMAL)

4. **TrabajoEmpleados**:
   - `ID` (INT, PK, AUTO_INCREMENT)
   - `IDTrabajo` (INT, FK)
   - `IDEmpleado` (INT, FK)

### Relaciones

- Un **Cliente** puede tener múltiples **Trabajos** (relación uno a muchos).
- Un **Trabajo** puede involucrar a múltiples **Empleados** (relación muchos a muchos a través de la tabla **TrabajoEmpleados**).

### Datos de Ejemplo

La base de datos incluye datos de ejemplo para cada tabla, que pueden ser utilizados para pruebas y demostraciones.

## Funcionalidades

1. **Selección de Cliente**: El usuario puede seleccionar un cliente existente para generar un informe.
2. **Generación de Informe en PDF**:
   - Muestra la lista de trabajos asociados al cliente.
   - Incluye detalles de cada trabajo.
   - Proporciona un resumen del gasto total por trabajo.
   - Incluye un gráfico circular que visualiza la distribución del gasto.

## Requisitos

- Sistema gestor de bases de datos compatible con SQL (MySQL, PostgreSQL, etc.).
- Java Runtime Environment (JRE) para ejecutar la aplicación.
- Bibliotecas para generación de PDF (ej. iText, Apache PDFBox).
- Bibliotecas para generación de gráficos (ej. JFreeChart).

## Instrucciones de Uso

1. **Configuración de la Base de Datos**:
   - Ejecutar el script SQL proporcionado para crear la base de datos y las tablas.
   - Asegurarse de que la aplicación tenga los permisos necesarios para acceder a la base de datos.

2. **Ejecución de la Aplicación**:
   - Compilar y ejecutar el proyecto Java.
   - Seleccionar un cliente desde la interfaz proporcionada.
   - Generar el informe en PDF con los datos correspondientes.

## Recursos

- **Script SQL**: `Empresa.sql` (incluye la creación de la base de datos y la inserción de datos de ejemplo).
- **Documentación**: Este README y el archivo `UD5_Ejercicio_3_InformeDesdeJava.pdf` con los detalles del proyecto.

## Notas Adicionales

- El informe generado asume que todos los trabajos se realizan en un plazo de un mes.
- El gráfico circular muestra el gasto total por trabajo para el cliente seleccionado.

------------------------------------------------------------------------------------------------------------------------------------------------

BASE DE DATOS UTILIZADA:

-- Crear la base de datos
CREATE DATABASE Empresa;
-- Seleccionar la base de datos
USE Empresa;
-- Crear la tabla Cliente (nota el cambio de ID a IDCliente)
CREATE TABLE Cliente (
    IDCliente INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Apellidos VARCHAR(50),
    FechaNac DATE,
    Sexo CHAR(1),
    Casado BOOLEAN
);

-- Crear la tabla Trabajo (nota el cambio de ID a IDTrabajo y ID_Cliente a IDCliente)
CREATE TABLE Trabajo (
    IDTrabajo INT PRIMARY KEY AUTO_INCREMENT,
    IDCliente INT,
    Nombre VARCHAR(100),
    Descripción TEXT,
    FOREIGN KEY (IDCliente) REFERENCES Cliente(IDCliente)
);

-- Crear la tabla Empleado (nota el cambio de ID a IDEmpleado)
CREATE TABLE Empleado (
    IDEmpleado INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Apellidos VARCHAR(50),
    DNI VARCHAR(20) UNIQUE,
    Sueldo DECIMAL(10, 2)
);

-- Crear la tabla TrabajoEmpleados (nota el cambio de nombre y campos)
CREATE TABLE TrabajoEmpleados (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    IDTrabajo INT,
    IDEmpleado INT,
    FOREIGN KEY (IDTrabajo) REFERENCES Trabajo(IDTrabajo),
    FOREIGN KEY (IDEmpleado) REFERENCES Empleado(IDEmpleado)
);

INSERT INTO Cliente (Nombre, Apellidos, FechaNac, Sexo, Casado) VALUES
('Juan', 'García Pérez', '1985-05-15', 'H', TRUE),
('María', 'López Martínez', '1990-08-22', 'M', FALSE),
('Carlos', 'Ruiz Sánchez', '1978-11-30', 'H', TRUE),
('Ana', 'Fernández García', '1995-03-10', 'M', FALSE),
('Pedro', 'Martín Jiménez', '1982-07-18', 'H', TRUE);

INSERT INTO Empleado (Nombre, Apellidos, DNI, Sueldo) VALUES
('Laura', 'Gómez Díaz', '12345678A', 2500.00),
('Pablo', 'Moreno Ruiz', '87654321B', 1800.50),
('Sofía', 'Alonso Vega', '56781234C', 2200.75),
('David', 'Torres Castro', '43218765D', 1950.25),
('Elena', 'Santos Navarro', '98765432E', 2800.00),
('Javier', 'Romero López', '13579246F', 2100.00),
('Lucía', 'Hernández Gil', '24681357G', 2300.50);

INSERT INTO Trabajo (IDCliente, Nombre, Descripción) VALUES
(1, 'Diseño web corporativo', 'Diseño y desarrollo de página web para empresa de construcción'),
(2, 'Campaña redes sociales', 'Gestión de redes sociales durante 3 meses para tienda online'),
(3, 'Consultoría estratégica', 'Análisis de procesos y recomendaciones de mejora'),
(1, 'App móvil de ventas', 'Desarrollo de aplicación iOS/Android con carrito de compras'),
(4, 'Rediseño de identidad visual', 'Nuevo logo, paleta de colores y manual de marca'),
(5, 'Sistema de inventario', 'Software de gestión de almacén con control de stock'),
(2, 'Posicionamiento SEO', 'Optimización para motores de búsqueda');

INSERT INTO TrabajoEmpleados (IDTrabajo, IDEmpleado) VALUES
(1, 1), (1, 3),
(2, 2), (2, 5), (2, 7),
(3, 4),
(4, 1), (4, 3), (4, 5),
(5, 2), (5, 6),
(6, 4), (6, 7),
(7, 1), (7, 5); 