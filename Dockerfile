# Use uma imagem base do Java
FROM openjdk:17-jdk

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo .jar para o contêiner
COPY target/conversor-temperatura-0.0.1-SNAPSHOT.jar /app/conversor-temperatura.jar

# Execute o .jar
CMD ["java", "-jar", "conversor-temperatura.jar"]
