package com.example.jobsheet16

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                val btn1 = findViewById<Button>(R.id.button1)
                val btn2 = findViewById<Button>(R.id.button2)
                val biodata = arrayOf("Zuliana", "XI PPLG 1", "3040")

                btn1.setOnClickListener {
                    AlertDialog.Builder( this)
                        .setTitle("Biodata Diri")
                        .setItems(biodata, DialogInterface.OnClickListener { dialog, which ->
                        })
                        .setPositiveButton( "YA", DialogInterface.OnClickListener { DialogInterface, i ->
                        })
                        .show()
                }

                btn2.setOnClickListener {
                    val inflater = layoutInflater
                    val dialoglayout = inflater.inflate(R.layout.activity_dialog, null)
                    val editText = dialoglayout.findViewById<EditText>(R.id.editText)
                    AlertDialog.Builder(this)
                        .setTitle("Masukkan Nama Lengkap")
                        .setView(dialoglayout)
                        // Add action buttons
                        .setPositiveButton("Benar",
                            DialogInterface.OnClickListener { dialogInterface, i ->
                                Toast.makeText(
                                    this,
                                    " Nama Kamu Adalah " + editText.getText().toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                            })
                        .setNegativeButton("Batal",
                            DialogInterface.OnClickListener { dialogInterface, i ->
                            }).show()
                }
    }
}