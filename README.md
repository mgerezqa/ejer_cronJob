# Ejercicio Opcional propuesto

## Descripción

Calendarización de un archivo txt que acepta texto por linea de comandos, al ejecutar el script se obtiene el output con el contenido del archivo.

## Pasos

	1. Crear un nuevo proyecto Java, con Maven como gestor de dependencias
    2. Crear una clase Writer que permita escribir una línea de texto en un archivo .txt (la ruta al archivo debe ser parametrizada y recibida como input por línea de comando)
    3. Crear una clase MainWriter que contenga un método main y que simplemente llame a la clase Writer y le pase una línea para escribir en el archivo recibido por parámetro de línea de comandos. 
    4. Ejemplo de línea a escribir: "[2024/06/05 11:25] Estoy ejecutando desde el cron".
    5. Crear un archivo "jar", ejecutando el comando mvn package (pueden hacerlo desde el panel gráfico de Maven que figura en IntelliJ)
    6. Configurar el cronJob desde el archivo Crontab (Linux/MacOS), o bien desde el Programador de Tareas (Windows); para que corra cada 1 minuto.
    7. La sentencia para que ejecute debe ser algo como "java -jar rutaAmiArchivo.jar rutaAlArchivo.txt"
    8. Revisar si el archivo se está escribiendo correctamente.

## Ejecución

Para ejecutar el script, se debe correr el siguiente comando:

```bash

java -jar out/artifacts/ejer_cronJob_jar/ejer_cronJob.jar src/main/java/domain/archivo.txt "Texto"
    
```

## Output
Funcionamiento del Writer

![outPutCronJob](https://github.com/mgerezqa/ejer_cronJob/assets/54424951/017b6e72-3203-4831-ad9e-2b71b76bed55)
