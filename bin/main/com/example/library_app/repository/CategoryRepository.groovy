package com.example.library_app.repository


import com.example.library_app.model.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository extends JpaRepository<Category, Long> {
}