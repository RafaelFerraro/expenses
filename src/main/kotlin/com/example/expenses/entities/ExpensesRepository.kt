package com.example.expenses.entities

interface ExpensesRepository {
    fun create(expense: Expense): Expense
    fun findAll(): MutableIterable<Expense>
}