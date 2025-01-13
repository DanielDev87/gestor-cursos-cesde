![FILTRO-CURSOS-PRECIO](https://github.com/user-attachments/assets/85c45f39-c797-4cd6-ab71-fbf9159c923d)
![FILTRO-CURSOS-NOMBRE](https://github.com/user-attachments/assets/ddc470a4-d5ea-484a-a62b-44e058fc9dd6)
![POST-RESPUESTA-CURSO](https://github.com/user-attachments/assets/dfb8e681-972d-475a-8459-6909a7509c26)
![GET-DOCENTES](https://github.com/user-attachments/assets/c67eaab1-4bba-4aef-9c72-81354031fa63)
![POST-RESPUESTA-DOCENTE](https://github.com/user-attachments/assets/7449bed7-38fc-441c-8b6a-19e82e63e4f5)
![POST-DOCENTE](https://github.com/user-attachments/assets/f60eb5a5-76be-4bfe-af03-5121592bcbcd)

## Estructura del proyecto
gestion-cursos-cesde/
├── src/
│   ├── main/
│   │   ├── java/com/cesde/cursos/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   ├── resources/
│   │       ├── application.properties
├── pom.xml

Gestión de Cursos - CESDE
Descripción del Proyecto

Esta es una aplicación web desarrollada con Spring Boot que permite gestionar la información de los cursos ofrecidos por CESDE. Los administradores pueden:

    Agregar, editar y eliminar cursos.
    Administrar los docentes asociados a los cursos.
    Realizar búsquedas con filtros avanzados.

Cada curso incluye información como nombre, descripción, duración, precio, fecha de inicio, y el docente que lo dicta. Cada docente tiene datos básicos como nombre, documento y correo electrónico.

Tecnologías Utilizadas

    Backend: Java (Spring Boot, Spring Data JPA)
    Base de Datos: MySQL
    Control de Versiones: GitHub
    Gestión de Dependencias: Maven

  Instalación
1. Clonar el Repositorio
   git clone https://github.com/usuario/gestion-cursos-cesde.git
   cd gestion-cursos-cesde
   
3. Configurar el Entorno
Asegúrate de tener instalado:

    JDK 11 o superior
    Maven
    MySQL Server

3. Instalar Dependencias
Ejecuta el siguiente comando en el directorio raíz del proyecto para instalar las dependencias:
mvn clean install

Configuración de la Base de Datos
4. Crear la Base de Datos
Accede a un servidor MySQL y ejecuta el siguiente script para crear la base de datos:

CREATE DATABASE gestion_cursos;
USE gestion_cursos;

5. Configurar el archivo application.properties
En el archivo src/main/resources/application.properties, configura las credenciales de tu base de datos:

spring.datasource.url=jdbc:mysql://localhost:3306/gestion_cursos
spring.datasource.username=usuario
spring.datasource.password=contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Ejecución del Proyecto
Para iniciar la aplicación, ejecuta el siguiente comando:
mvn spring-boot:run

Accede a la API en: http://localhost:8080

Rutas Docentes
    GET /api/docentes: Listar todos los docentes.
    POST /api/docentes: Crear un nuevo docente.
    
    Cuerpo de la solicitud (JSON):

{
    "nombre": "Juan Pérez",
    "documento": "123456789",
    "correo": "juan.perez@cesde.edu"
}
DELETE /api/docentes/{id}: Eliminar un docente por ID

Cursos

    GET /api/cursos: Listar todos los cursos.
    POST /api/cursos: Crear un nuevo curso.
    Cuerpo de la solicitud (JSON):
[
    {
        "id_curso": 1,
        "nombre": "Curso de Python",
        "descripcion": "Curso avanzado de Python.",
        "duracion": 10,
        "precio": 399.99,
        "fechaInicio": "2025-03-01T10:00:00",
        "docente": {
            "id": 1,
            "nombre": "Juan Pérez"
        }
    }
]


  GET /api/cursos/filter: Buscar cursos con filtros.
  Parámetros de consulta: nombre, duracion, precioMax

  Autor: Daniel Felipe Agudelo Molina
