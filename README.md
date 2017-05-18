# proyectotp1
Proyecto maven de prueba para el módulo Entornos de Desarrollo.

Programa java sencillo que gestiona una pila de pales de un almacén, con diferentes funcionalidades, a las cuales podemos acceder mediante un menú.

Para ejecutar el programa, debemos de ejecutar el archivo TestAlmacen.java, puesto que es el que contiene el método principal que ejecuta el menú. 

Debemos tener en cuenta que este programa es básico, por lo que aún hay muchas funcionalidades por añadir, como un entorno gráfico o que los datos sean guardados en una base de datos, puesto que ahora estos se pierden al detener su ejecución.

### El programa tiene las siguientes funcionalidades:###

1. Añadir palé: añade un palé a la pila.
2. Quitar palé: elimina el palé que se encuentre en lo alto de la pila.
3. Mostrar palés: muestra todos los palés que se encuentren en la pila 
4. Mostrar totales: muestra los totales de peso y de cajas de los palés.

### Para ejecutarlo:
Antes de nada, realizar la descarga o clonación del proyecto, y por suspuesto, tener instalado en el sistema maven y java (jdk y jre).

1. Nos colocaremos en la carpeta donde este el fichero pom.xml y el src(que es donde están los ficheros .java del proyecto).
2. Una vez situados ahí procederemos a construir el proyecto usando el comando de maven
   `mvn package`
3. Una vez construido el proyecto ya podemos proceder a ejecutarlo. Para ello usaremos java, y debemos poner lo siguiente: 
   `java -cp target/proyectomaventp1-0.0.1-SNAPSHOT.jar piladealmacen.TestAlmacen`
 


