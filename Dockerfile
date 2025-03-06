FROM jelastic/maven:3.9.5-openjdk-21
WORKDIR /app
COPY pom.xml ./
COPY src ./src/

CMD ["mvn", "spring-boot:run"]
