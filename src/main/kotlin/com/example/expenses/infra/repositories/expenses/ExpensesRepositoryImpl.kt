package com.example.expenses.infra.repositories.expenses

import com.example.expenses.domain.expenses.Expense
import com.example.expenses.domain.expenses.ExpensesRepository
import com.example.expenses.infra.repositories.jpa.JpaExpensesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class ExpensesRepositoryImpl(
    @Autowired private val jpaExpensesRepository: JpaExpensesRepository
) : ExpensesRepository {

    override fun create(expense: Expense): Expense {
        return jpaExpensesRepository.save(expense)
    }

    override fun findAll(): MutableIterable<Expense> {
        return jpaExpensesRepository.findAll()
    }
}