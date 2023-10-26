package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class ExpensesApplication

fun main(args: Array<String>) {
	runApplication<ExpensesApplication>(*args)
}
