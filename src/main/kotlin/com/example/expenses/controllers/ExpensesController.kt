package com.example.expenses.controllers

import com.example.expenses.entities.Expense
import com.example.expenses.repositories.ExpensesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpensesController(@Autowired private var repository: ExpensesRepository) {

    @GetMapping("/expenses")
    fun expenses(): Iterable<Expense> {
        return repository.findAll()
    }

    @PostMapping("/expenses")
    fun createExpenses(): Expense {
        return repository.save(
            Expense(
                amount = 10.0,
                description = "Beer with friends"
            )
        )
    }
}