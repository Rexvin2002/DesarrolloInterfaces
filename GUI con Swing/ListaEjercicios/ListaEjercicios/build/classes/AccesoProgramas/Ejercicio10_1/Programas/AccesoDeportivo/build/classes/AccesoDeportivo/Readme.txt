# Acceso Deportivo - Sistema de Matrícula

## Descripción
Este proyecto es un sistema de matrícula deportiva desarrollado en Java con interfaz gráfica Swing. Permite a los usuarios acceder al sistema, registrar hijos para actividades deportivas y completar el proceso de matrícula.

## Características principales
- **Autenticación de usuarios**: Validación de credenciales (usuario/contraseña)
- **Gestión de deportistas**: Añadir, visualizar y gestionar información de hijos
- **Selección de deportes**: Elección entre Tenis, Pádel o Squash
- **Niveles de habilidad**: Inicial, Medio, Avanzado o Profesional
- **Opciones de matrícula**: Turnos (Mañana/Tarde) y modalidades de renovación (Trimestral/Anual)

## Estructura del proyecto
El sistema está compuesto por varias clases principales:

1. **AccesoDeportivo**: Ventana principal de login
2. **Registro**: Ventana de matrícula principal
3. **AñadirHijo**: Diálogo para añadir nuevos deportistas
4. **Persona**: Clase modelo para almacenar datos de deportistas
5. **LogicaPersonas**: Lógica para gestionar la lista de deportistas
6. **Error/Exito**: Diálogos para mostrar mensajes al usuario

## Requisitos
- Java 8 o superior
- Entorno de desarrollo compatible con Swing

## Uso
1. Ejecutar la clase `AccesoDeportivo`
2. Ingresar las credenciales (usuario: "user", contraseña: "passwd")
3. En la ventana de registro:
   - Seleccionar deporte y nivel
   - Elegir turno y modalidad de renovación
   - Añadir hijos con sus datos personales
4. Finalizar el proceso de matrícula

## Autor
Kevin Gómez Valderas - 2º DAM

## Notas
- El proyecto utiliza el look and feel Nimbus
- Todas las ventanas tienen tamaños fijos y no redimensionables
- La persistencia de datos es en memoria (no utiliza base de datos)