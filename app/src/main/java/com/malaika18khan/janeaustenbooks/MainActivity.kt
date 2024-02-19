package com.malaika18khan.janeaustenbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  lateinit var booksAdapter: BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val books = mutableListOf<Book>()
        books.add(Book("Emma", R.drawable.emma, "Emma.pdf"))
        books.add(Book("Pride and Prejudice", R.drawable.pride, "Pride.pdf"))
        books.add(Book("Sense and Sensibility", R.drawable.sense, "Sense_and_Sensibility.pdf"))
        books.add(Book("Persuasion", R.drawable.persuasion, "Persuasion.pdf"))
        books.add(Book("Northanger Abbey", R.drawable.abbey, "Northanger_Abbey.pdf"))
        books.add(Book("Mansfield Park", R.drawable.mans, "Mansfield_Park.pdf"))
        books.add(Book("Lady Susan", R.drawable.susan, "Lady_Susan.pdf"))
        books.add(Book("Juvenilia Part I", R.drawable.juvenilia, "Juvenilia Volume I.pdf"))
        books.add(Book("Juvenilia Part II", R.drawable.juvenilia, "Juvenilia Volume II.pdf"))
        books.add(Book("Juvenilia Part III", R.drawable.juvenilia, "Juvenilia Volume III.pdf"))


        booksAdapter = BookAdapter(this, books)
        val bookRecyclerView = findViewById<RecyclerView>(R.id.books_rv)

        bookRecyclerView.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = booksAdapter
        }
    }




}