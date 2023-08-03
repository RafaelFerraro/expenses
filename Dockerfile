FROM eclipse-temurin:17

WORKDIR /app

COPY build/libs/expenses-0.0.1-SNAPSHOT.jar /app/expenses.jar

EXPOSE 8080

CMD ["java", "-jar", "expenses.jar"]