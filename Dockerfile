FROM --platform=linux/x86_64  openjdk:17-oracle 
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src
RUN ./mvnw package -Dmaven.test.skip=true -Dcheckstyle.skip=true
RUN mv target/*.jar /app/spring-petclinic.jar
CMD ["java", "-jar", "/app/spring-petclinic.jar"]
EXPOSE 8082
