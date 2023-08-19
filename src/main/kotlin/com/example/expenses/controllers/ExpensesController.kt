package com.example.expenses.controllers

import com.example.expenses.entities.Expense
import com.example.expenses.repositories.ExpensesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpensesController(@Autowired private var repository: ExpensesRepository) {

    @GetMapping("/expenses")
    fun expenses(): Iterable<Expense> {
        return repository.findAll()
    }

    @PostMapping("/expenses", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun createExpenses(@RequestBody expense: ExpenseRequestBody): Expense {
        return repository.save(
            Expense(
                amount = expense.amount,
                description = expense.description
            )
        )
    }
}

data class ExpenseRequestBody(
    var amount: Double,
    var description: String
)