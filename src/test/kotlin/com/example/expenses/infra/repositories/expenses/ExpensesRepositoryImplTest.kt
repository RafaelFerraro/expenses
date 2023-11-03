package com.example.expenses.infra.repositories.expenses

import com.example.expenses.domain.expenses.Expense
import com.example.expenses.infra.repositories.jpa.JpaExpensesRepository
import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class ExpensesRepositoryImplTest {

    @MockK
    private lateinit var jpaExpensesRepository: JpaExpensesRepository

    @Test
    fun `returns a list of Expenses from jpa repository method`() {
        val expenseList = mutableListOf<Expense>()

        every { jpaExpensesRepository.findAll() } returns expenseList

        val result = ExpensesRepositoryImpl(jpaExpensesRepository).findAll()

        assertEquals(expenseList, result)
    }

    @Test
    fun `returns the saved expense properly`() {
        val expense = mockk<Expense>(relaxed = true)

        every { jpaExpensesRepository.save(expense) } returns expense

        val result = ExpensesRepositoryImpl(jpaExpensesRepository).create(expense)

        assertEquals(expense, result)
    }
}