package com.example.expenses.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpensesController {

    @GetMapping("/expenses")
    fun expenses(): String {
        println("It has arrived with GET =================")
        return "OK 200"
    }

    @PostMapping("/expenses")
    fun createExpenses(): String {
        println("A new expense has created")
        return "A new expense has created"
    }
}