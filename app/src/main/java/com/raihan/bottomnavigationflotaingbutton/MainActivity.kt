package com.raihan.bottomnavigationflotaingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toast.*
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var navController: NavController

    private lateinit var fab_QR: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        fab_QR = findViewById(R.id.fab_QR)
        navController = findNavController(R.id.nav_host_fragment)


        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false

        fab_QR.setOnClickListener {
            makeText(this, "QR Pay Button Test", LENGTH_SHORT).show()
        }
        bottomNavigationView.setupWithNavController(navController)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_statement,
                R.id.navigation_beneficiary,
                R.id.navigation_menu
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.navigation_home)

                    return@setOnItemSelectedListener true
                }
                R.id.navigation_statement -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.navigation_statement)

                    return@setOnItemSelectedListener true
                }
                R.id.navigation_beneficiary -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.navigation_beneficiary)

                    return@setOnItemSelectedListener true
                }
                R.id.navigation_menu -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.navigation_menu)

                    return@setOnItemSelectedListener true
                }
                else -> return@setOnItemSelectedListener false

            }

        }


    }

    /* override fun onNavigationItemSelected(item: MenuItem): Boolean {
         when (item.itemId) {
             R.id.navigation_home -> {
                 findNavController(R.id.nav_host_fragment).navigate(R.id.navigation_home)

                 return true
             }
             R.id.navigation_statement -> {
                 findNavController(R.id.nav_host_fragment).navigate(R.id.navigation_statement)

                 return true
             }
             R.id.navigation_beneficiary -> {
                 findNavController(R.id.nav_host_fragment).navigate(R.id.navigation_beneficiary)

                 return true
             }
             R.id.navigation_menu -> {
                 findNavController(R.id.nav_host_fragment).navigate(R.id.navigation_menu)

                 return true
             }
             else -> return false

         }

     }*/
}