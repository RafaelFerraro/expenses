package com.example.expenses.repositories

import com.example.expenses.entities.Expense
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface JpaExpensesRepository : CrudRepository<Expense, UUID> {
}