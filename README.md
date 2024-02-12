# User-Details-Application

## Quickstart

1. Clone the repository
2. Open the project in your IDE: IntelliJ IDEA (recommended) or eclipse
    * If you're using IntelliJ IDEA, make sure the IDE opens project as **Maven** and recognizes it as a Spring Boot project.
3. Configure the database connection in `application.properties` (PostgreSQL should be used as the database for this project).
   ```properties
    db.url=jdbc:postgresql://[ip address of your db]:[port of your db]/[name of your db]
    db.username=[username]
    db.password=[password, if any]
   ```
   other properties:
   ```properties
   spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true
   server.error.include-message=always
   ```
4. Run the project by (by running the `main` method in `Application.java`)
5. Open http://localhost:8080/ in your browser!
