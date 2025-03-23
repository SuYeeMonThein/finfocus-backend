package com.example.finfocus

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByUsername(username: String): User?

    fun findByEmail(email: String): User?
}

interface ExpenseRepository : JpaRepository<Expense, Long> {
    fun findByUserId(userId: Long): List<Expense>
}

interface CategoryRepository : JpaRepository<Category, Long>

