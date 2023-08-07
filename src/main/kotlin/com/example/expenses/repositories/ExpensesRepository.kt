package com.example.expenses.repositories

import com.example.expenses.entities.Expense
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface ExpensesRepository: CrudRepository<Expense, UUID>