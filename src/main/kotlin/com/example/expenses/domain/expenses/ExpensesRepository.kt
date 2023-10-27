package com.example.expenses.domain.expenses

interface ExpensesRepository {
    fun create(expense: Expense): Expense
    fun findAll(): MutableIterable<Expense>
}