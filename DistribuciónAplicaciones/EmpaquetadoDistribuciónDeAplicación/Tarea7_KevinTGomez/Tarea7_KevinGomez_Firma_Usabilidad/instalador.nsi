!define APP_NAME "Tarea7_KevinGomez_Firma_Usabilidad"
!define JAR_FILE "Tarea7_KevinGomez_Firmado.jar"
!define OUTPUT_EXE "Tarea7_KevinGomez_Firma_Usabilidad.exe"
!define MUI_ICON "ruta\al\icono.ico"

Outfile "$DESKTOP\${OUTPUT_EXE}"
InstallDir "$DESKTOP\${APP_NAME}"
RequestExecutionLevel user

Section "Verificar Java"
    ReadRegStr $0 HKLM "SOFTWARE\JavaSoft\Java Runtime Environment" "CurrentVersion"
    StrCmp $0 "" 0 +3
        MessageBox MB_OK "Java no está instalado. Por favor, instale Java antes de continuar."
        Abort
SectionEnd

Section "Instalar"
    SetOutPath "$INSTDIR"
    
    ; Copiar el archivo JAR principal
    File "C:\Users\kgv17\OneDrive\Escritorio\2nd DAM 24-25\DESARROLLO DE INTERFACES\DesarrolloInterfacesRepository\Unidad07_Distribucion_Aplicaciones\Empaquetado_Distribucion\Tarea7_KevinGomez_Firma_Usabilidad\${JAR_FILE}"
    
    ; Copiar las bibliotecas adicionales
    File "C:\Users\kgv17\OneDrive\Escritorio\2nd DAM 24-25\DESARROLLO DE INTERFACES\DesarrolloInterfacesRepository\Unidad07_Distribucion_Aplicaciones\Empaquetado_Distribucion\Tarea7_KevinGomez_Firma_Usabilidad\*.jar"
    
    ; Crear un archivo batch que incluya las bibliotecas en el classpath
    FileOpen $0 "$INSTDIR\ejecutar.bat" w
    FileWrite $0 '@echo off$\r$\n'
    FileWrite $0 'cd "$INSTDIR"$\r$\n'
    FileWrite $0 'java -cp "${JAR_FILE}" tarea7_kevingomez.RunJar$\r$\n'
    FileWrite $0 'if errorlevel 1 ($\r$\n'
    FileWrite $0 '  echo Error al ejecutar la aplicación.$\r$\n'
    FileWrite $0 '  pause$\r$\n'
    FileWrite $0 ')$\r$\n'
    FileClose $0
    
    ; Crear un acceso directo
    CreateShortCut "$INSTDIR\${APP_NAME}.lnk" "$INSTDIR\ejecutar.bat" "" "$INSTDIR\icono.ico"
    
    WriteUninstaller "$INSTDIR\uninstall.exe"
SectionEnd

Section "Uninstall"
    Delete "$INSTDIR\${JAR_FILE}"
    Delete "$INSTDIR\*.jar"
    Delete "$INSTDIR\ejecutar.bat"
    Delete "$INSTDIR\${APP_NAME}.lnk"
    Delete "$INSTDIR\uninstall.exe"
    RMDir "$INSTDIR"
SectionEnd