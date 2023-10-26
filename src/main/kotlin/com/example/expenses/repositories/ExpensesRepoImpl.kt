package com.example.expenses.repositories

import com.example.expenses.entities.Expense
import com.example.expenses.entities.ExpensesRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpensesRepoImpl : ExpensesRepo {
    @Autowired
    lateinit var jpaExpensesRepository: JpaExpensesRepository;

    override fun create(expense: Expense): Expense {
        return jpaExpensesRepository.save(expense)
    }

    override fun findAll(): MutableIterable<Expense> {
        return jpaExpensesRepository.findAll()
    }
}