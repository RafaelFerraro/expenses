# expenses
Personal expenses API application

Requirements:
- Docker

App dependencies
- Postgresql
- Gradle
- Spring

# Running the application

There are two ways we can run the application

### Using docker-compose
To build and start the container, run `docker-compose up --build`.

The application will be available at http://localhost:8080.

### Using IntelliJ
First, run the database using docker-compose `docker-compose up database`

Now, we need to make sure the following variables are defined:

- DATABASE_URL 
- DATABASE_USER
- DATABASE_PASSWORD

When the variables are defined, it is just build and run the application.

The application will be available at http://localhost:8080.

### Interacting with the API
To create an expense, you can do a POST request like:
`curl -X POST http://localhost:8080/expenses -H 'Content-Type: application/json' -d '{"amount": 50.5, "description": "Beer with friends"}'`

Then, to list all expenses, do `curl http://localhost:8080/expenses`. This will return a json containing a list of expenses.
