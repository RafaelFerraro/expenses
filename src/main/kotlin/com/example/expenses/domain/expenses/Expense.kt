package com.example.expenses.domain.expenses

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "expenses")
data class Expense(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID = UUID.randomUUID(),
    var amount: Double,
    var description: String?,
    @CreatedDate
    var createdAt: Instant = Instant.now(),
    @LastModifiedDate
    var updatedAt: Instant = Instant.now()
)