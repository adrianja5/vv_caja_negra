# Práctica caja negra 
**GRUPO**: IWT-41 Grupo 5

## Instrucciones para la ejecución de la práctica.

1. Se deberá tener instalado Maven en el ordenador así como tener debidamente configuradas las variables de entorno[^1].
2. Será necesario instalar manualmente, si no está instalado, el paquete `SingleList.jar`. Esto puede hacerse con el comando: `mvn install:install-file '-Dfile=.\lib\SingleList.jar' '-DgroupId=com.singleList' '-DartifactId=SingleList' '-Dversion=0.0.1-SNAPSHOT' '-Dpackaging=jar'`.
3. A través de la línea de comandos navegaremos hasta el directorio donde se encuentra nuestro proyecto haciendo uso del comando `cd`, por ejemplo `cd vv_caja_negra`.
4. Una vez estemos dentro del directorio deseado deberemos ejecutar los siguientes comandos para ejecutar los test:
  >- 4.1- mvn clean
  >- 4.2- mvn compile
  >- 4.3- mvn test
  
  
[^1]: Tutorial para instalar Maven en Windows 10: https://dev.to/vanessa_corredor/instalar-manualmente-maven-en-windows-10-50pb
