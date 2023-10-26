package com.example.expenses.infra.repositories.expenses

import com.example.expenses.entities.Expense
import com.example.expenses.entities.ExpensesRepository
import com.example.expenses.infra.repositories.jpa.JpaExpensesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class ExpensesRepositoryImpl : ExpensesRepository {
    @Autowired
    lateinit var jpaExpensesRepository: JpaExpensesRepository;

    override fun create(expense: Expense): Expense {
        return jpaExpensesRepository.save(expense)
    }

    override fun findAll(): MutableIterable<Expense> {
        return jpaExpensesRepository.findAll()
    }
}