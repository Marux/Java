# Repositorio de Proyectos Java con Orientación a Objetos

Este repositorio contiene una colección de proyectos Java orientados a objetos desarrollados como parte de la carrera "Analista Programador: Segundo y Tercer Semestre" de mi carrera. Estos proyectos abarcan conceptos basicos y ejemplos de programación orientada a objetos en Java, aplicando lo aprendido durante mis estudios.

## Contenido

El repositorio contiene las siguientes carpetas y proyectos:

- **Ejercicio_Basico**: Un ejercicio básico realizado para la terminal.
- **Leer Mayúsculas y Minúsculas**: Una aplicación de consola para leer mayúsculas y minúsculas.
- **Patrones de Diseño**: Proyectos que implementan patrones de diseño como Singleton, Factory y Abstract Factory.
- **Prestamo**: Un proyecto de consola que simula un sistema de préstamo.
- **ProyectoFinalSwing**: Una aplicación más completa que incluye un sistema de asistencia con registro de entrada y salida de turnos, cálculo de sueldos y vacaciones. Utiliza la interfaz gráfica de usuario (GUI) de Swing y una base de datos SQL.
- **Proyecto_Banco**: Un ejercicio básico en la terminal que simula un sistema de crédito bancario.
- **Triángulo_De_Pascal**: Un proyecto de consola que genera el Triángulo de Pascal.

## Tecnologías Utilizadas

- Lenguaje de programación: Java 8
- Entorno de desarrollo: NetBeans 8
- Patrones de diseño: Singleton, Factory, Abstract Factory
- Interfaz gráfica de usuario (en el caso de ProyectoFinalSwing)
- Base de datos SQL (en el caso de ProyectoFinalSwing)

## Configuración de la Base de Datos (ProyectoFinalSwing) con MAMP y MySQL Workbench

El proyecto ProyectoFinalSwing utiliza una base de datos MySQL para gestionar los registros. Puedes configurar la base de datos importando un archivo SQL previamente respaldado en el repositorio. A continuación, se detallan las instrucciones:

1. **Instalar MAMP**:
   - Descarga e instala MAMP desde el sitio web oficial (https://www.mamp.info/). MAMP incluye un servidor web, MySQL y PHP para entornos de desarrollo locales.

2. **Iniciar el Servidor MAMP**:
   - Abre la aplicación MAMP y, en la pestaña "Start/Stop", inicia los servidores Apache y MySQL. Anota el puerto de MySQL que se muestra en MAMP; por lo general, es 3306.

3. **Acceder a MySQL con MySQL Workbench**:
   - Abre MySQL Workbench y crea una nueva conexión. Utiliza las siguientes credenciales:
     - Host: `localhost`
     - Port: El puerto de MySQL que anotaste en MAMP (por defecto, 3306).
     - Username: El nombre de usuario de MySQL que configures en MAMP (por defecto, "root").
     - Password: La contraseña de MySQL que configures en MAMP.

4. **Importar la Base de Datos desde el Archivo SQL**:
   - Abre el archivo SQL de respaldo que se encuentra en este repositorio `PROYECTOFINAL.sql` en MySQL Workbench.
   - Ejecuta el archivo SQL para importar la base de datos y las tablas.

5. **Actualizar la Configuración en la Aplicación**:
   - En el código de tu aplicación ProyectoFinalSwing, asegúrate de que la configuración de la base de datos (nombre de la base de datos, usuario, contraseña, etc.) esté actualizada para que la aplicación pueda conectarse a la base de datos.

Con estos pasos, deberías poder configurar la base de datos para tu proyecto ProyectoFinalSwing importando un archivo SQL previamente respaldado en el repositorio. Asegúrate de que el archivo SQL esté correctamente respaldado y actualizado para que los usuarios puedan importarlo con éxito.

## Contribuciones

Si deseas contribuir, mejorar o ampliar cualquiera de estos proyectos, ¡las contribuciones son bienvenidas!

## Contacto

Si deseas contactarme, puedes hacerlo a través de mi [Instagram](https://www.instagram.com/vmtrdev/)

¡Gracias por visitar mi repositorio!
