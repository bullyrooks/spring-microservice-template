FROM openjdk:15.0.2-slim-buster as build

COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
# download dependencies
RUN ./mvnw dependency:go-offline
COPY lib lib
COPY src src

# Setup the maven cache
RUN ./mvnw -B package -DskipTests

FROM openjdk:15.0.2-slim-buster
COPY --from=build lib/aws-opentelemetry-agent.jar aws-opentelemetry-agent.jar
COPY --from=build target/*.jar app.jar
ENTRYPOINT ["java", "-javaagent:aws-opentelemetry-agent.jar", "-jar", "app.jar"]
