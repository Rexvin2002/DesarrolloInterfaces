!define APP_NAME "Tarea7_KevinGomez"
!define JAR_FILE "Tarea7_KevinGomez.jar"
!define OUTPUT_EXE "Tarea7_KevinGomez_Idioma_Componente.exe"

; Definir la carpeta de instalación en el Escritorio
InstallDir "$DESKTOP\${APP_NAME}"
Outfile "$DESKTOP\${OUTPUT_EXE}"
RequestExecutionLevel user

Section "Instalar"
    ; Crear la carpeta de instalación en el Escritorio
    SetOutPath "$INSTDIR"
    
    ; Copiar el archivo JAR principal
    File "C:\Users\kgv17\OneDrive\Escritorio\2nd DAM 24-25\DESARROLLO DE INTERFACES\DesarrolloInterfacesRepository\Unidad07_Distribucion_Aplicaciones\Empaquetado_Distribucion\Tarea7_KevinGomez_Idioma_Componente\${JAR_FILE}"
    
    ; Crear la carpeta "lib" dentro de la carpeta de instalación
    SetOutPath "$INSTDIR\lib"
    File "C:\Users\kgv17\OneDrive\Escritorio\2nd DAM 24-25\DESARROLLO DE INTERFACES\DesarrolloInterfacesRepository\Unidad07_Distribucion_Aplicaciones\Empaquetado_Distribucion\Tarea7_KevinGomez_Idioma_Componente\lib\*.jar"

    ; Crear un archivo batch para ejecutar la aplicación
    FileOpen $0 "$INSTDIR\ejecutar.bat" w
    FileWrite $0 '@echo off$\r$\n'
    FileWrite $0 'cd "$INSTDIR"$\r$\n'
    FileWrite $0 'java -jar "${JAR_FILE}"$\r$\n'
    FileWrite $0 'if errorlevel 1 ($\r$\n'
    FileWrite $0 '  echo Error al ejecutar la aplicación.$\r$\n'
    FileWrite $0 '  pause$\r$\n'
    FileWrite $0 ')$\r$\n'
    FileClose $0
    
    ; Crear un acceso directo en el Escritorio
    CreateShortCut "$INSTDIR\ejecutar.bat" "" "$INSTDIR\ejecutar.bat" 0
    
    ; Generar el desinstalador en la carpeta de instalación
    WriteUninstaller "$INSTDIR\uninstall.exe"
SectionEnd

Section "Uninstall"
    ; Eliminar archivos instalados
    Delete "$INSTDIR\${JAR_FILE}"
    Delete "$INSTDIR\ejecutar.bat"
    Delete "$INSTDIR\${APP_NAME}.lnk"
    
    ; Eliminar la carpeta "lib" y su contenido
    RMDir /r "$INSTDIR\lib"
    
    ; Eliminar el desinstalador
    Delete "$INSTDIR\uninstall.exe"
    
    ; Eliminar la carpeta de instalación si está vacía
    RMDir "$INSTDIR"
SectionEnd