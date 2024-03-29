package com.example.expenses.infra.repositories.jpa

import com.example.expenses.domain.expenses.Expense
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface JpaExpensesRepository : CrudRepository<Expense, UUID> {
}