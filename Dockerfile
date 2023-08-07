FROM gradle:7.6.2-jdk17 AS build
WORKDIR /app-gradle
COPY . /app-gradle
RUN gradle build

FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app-gradle/build/libs/expenses-0.0.1-SNAPSHOT.jar /app/expenses.jar
EXPOSE 8080
CMD ["java", "-jar", "expenses.jar"]