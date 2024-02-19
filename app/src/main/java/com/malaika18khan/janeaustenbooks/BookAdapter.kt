package com.malaika18khan.janeaustenbooks

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val context : Context, private val books: MutableList<Book>) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.book_item, parent, false)
        return BookViewHolder(view)

    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.bookCover.setImageResource(book.cover)
        holder.bookName.text = book.name

        holder.itemLayout.setOnClickListener {
            val pdfActivityIntent = Intent(context, PdfDetails::class.java)
            pdfActivityIntent.putExtra("pdfName", book.pdfFile)
            context.startActivity(pdfActivityIntent)

        }

    }


    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val bookName: TextView = itemView.findViewById(R.id.bookName)
        val bookCover: ImageView = itemView.findViewById(R.id.bookCover)
        val itemLayout: ConstraintLayout = itemView.findViewById(R.id.book_layout)



    }


}