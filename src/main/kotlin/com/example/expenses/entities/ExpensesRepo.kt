package com.example.expenses.entities

interface ExpensesRepo {
    fun create(expense: Expense): Expense
    fun findAll(): MutableIterable<Expense>
}