package com.example.library_app.repository


import com.example.library_app.model.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository extends JpaRepository<Book, Long> {
}