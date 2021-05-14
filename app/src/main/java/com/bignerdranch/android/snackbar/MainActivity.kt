package com.bignerdranch.android.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private lateinit var viewPros : View
    private lateinit var SnackButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPros = findViewById(R.id.myCoordinatorLayout)
        SnackButton = findViewById(R.id.SnackButton)

        SnackButton.setOnClickListener {
            Snackbar.make(viewPros, "Your Message", Snackbar.LENGTH_LONG)
                .setAction("Action"){
                    Toast.makeText(this, "BRAVO", Toast.LENGTH_SHORT).show()
                }
                .show();
        }

    }
}