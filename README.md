# expenses
Personal expenses API application

Requirements:
- Docker

App dependencies
- Postgresql
- Gradle
- Spring

To build and start the container, run `docker-compose up --build`.

The application will be available at http://localhost:8080.

To create an expense, you can do a POST request like:
`curl -X POST http://localhost:8080/expenses -H 'Content-Type: application/json' -d '{"amount": 50.5, "description": "Beer with friends"}'`

If you want to list all expenses, do `curl http://localhost:8080/expenses`. This will return a json containing a list of expenses.
