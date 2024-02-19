package com.malaika18khan.janeaustenbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class PdfDetails : AppCompatActivity() {

    private lateinit var pdfBook: PDFView
    private var pdfName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_details)


        pdfBook = findViewById(R.id.book_pv)

        pdfName = intent.getStringExtra("pdfName")

        pdfBook.fromAsset(pdfName).load()
    }
}