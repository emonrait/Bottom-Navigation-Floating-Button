package com.raihan.bottomnavigationflotaingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var fab_QR: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        fab_QR = findViewById(R.id.fab_QR)

        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false

        fab_QR.setOnClickListener {
            Toast.makeText(this, "QR Pay Button Test", Toast.LENGTH_SHORT).show()
        }



    }
}