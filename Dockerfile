FROM openjdk:11-jre-slim

#Establecer el directorio de trabajo

WORKDIR /app

#Copiar el archivo jar generado desde spring boot

COPY target/virtualvuelo-0.0.1-SNAPSHOT.jar app.jar

#EXPONER EL PUERTO DE LA APP

EXPOSE 8080

#EJECUTAR la aplicacion

ENTRYPOINT ["java","-jar","app.jar"]
