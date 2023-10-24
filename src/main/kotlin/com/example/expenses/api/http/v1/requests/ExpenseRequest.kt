package com.example.expenses.api.http.v1.requests

data class ExpenseRequest(
    var amount: Double,
    var description: String
)