package com.example.expenses.api.http.v1

import com.example.expenses.api.http.v1.requests.ExpenseRequest
import com.example.expenses.entities.Expense
import com.example.expenses.entities.ExpensesRepo
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpensesController(private val repository: ExpensesRepo) {

    @GetMapping("/expenses")
    fun expenses(): Iterable<Expense> {
        return repository.findAll()
    }

    @PostMapping("/expenses", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun createExpenses(@RequestBody expense: ExpenseRequest):Expense {
        return repository.create(
            Expense(
                amount = expense.amount,
                description = expense.description
            )
        )
    }
}

