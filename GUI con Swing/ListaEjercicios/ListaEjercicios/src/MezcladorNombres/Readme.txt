# Generador de Nombres mezclados

## Descripción
Este programa es una aplicación de escritorio que permite generar combinaciones creativas de nombres para parejas, mezclando dos nombres ingresados por el usuario. La aplicación incluye validación de entrada y muestra los resultados en un formato atractivo.

## Características principales
- Generación automática de 4 combinaciones diferentes de nombres
- Validación de entrada (mínimo 4 caracteres por nombre)
- Interfaz gráfica intuitiva desarrollada con Java Swing
- Mensaje de error personalizado cuando los nombres son muy cortos
- Opción para reiniciar el proceso y comenzar de nuevo

## Componentes principales

### MainFrame (Ventana principal)
- `jLabelTitulo`: Muestra el título de la aplicación
- `jTextFieldPrimerNombre`: Campo para el primer nombre
- `jTextFieldSegundoNombre`: Campo para el segundo nombre
- `jButtonMezclar`: Botón para generar las combinaciones
- `jButtonReiniciar`: Botón para limpiar los campos
- `jTextPaneNombresMezclados`: Área de texto para mostrar los resultados

### MixedNames (Lógica de mezcla)
- `nombre1` y `nombre2`: Almacenan los nombres a mezclar
- `generateMixedNames()`: Genera 4 combinaciones diferentes

### Error (Diálogo de error)
- `jTextAreaMensaje`: Muestra el mensaje de error
- `jButtonVolver`: Botón para cerrar el diálogo

## Funcionalidad
1. El usuario ingresa dos nombres (mínimo 4 caracteres cada uno)
2. Al hacer clic en "MEZCLAR":
   - Si los nombres son válidos, genera y muestra las combinaciones
   - Si son muy cortos, muestra un diálogo de error
3. El botón "REINICIAR" limpia todos los campos para empezar de nuevo

## Requisitos
- Java 8 o superior instalado
- Entorno de ejecución Java (JRE)

## Instrucciones de uso
1. Ejecutar el programa (el método main está en la clase `MainFrame`)
2. Ingresar dos nombres en los campos correspondientes
3. Hacer clic en "MEZCLAR" para ver las combinaciones
4. Usar "REINICIAR" para limpiar los campos y comenzar de nuevo

## Validación de entrada
- Los nombres deben tener al menos 4 caracteres
- Si no cumplen este requisito:
  - Muestra un diálogo de error con mensaje claro
  - Limpia los campos automáticamente
  - Permite volver a intentar

## Autor
Kevin Gómez Valderas - 2º DAM

## Notas técnicas
- Utiliza el look and feel "Nimbus" de Java Swing
- Texto de resultados centrado y en color azul (#0000CC)
- Fuente grande (18pt) para los nombres mezclados
- Diálogo de error modal que bloquea la interacción con la ventana principal
- Deshabilita campos y botones después de la mezcla para evitar modificaciones

## Licencia
Este código se proporciona libremente para fines educativos. Se permite su uso y modificación siempre que se mantenga esta nota de atribución.