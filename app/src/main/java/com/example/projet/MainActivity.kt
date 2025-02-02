package com.example.projet

import SearchActivity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Activer le mode Edge-to-Edge
        enableEdgeToEdge()

        // Définir le layout de l'activité principale
        setContentView(R.layout.activity_main)

        // Gérer les "window insets" pour adapter le padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Récupérer la BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Gérer la navigation de la BottomNavigationView
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Si l'item "Home" est sélectionné, on reste sur la MainActivity
                    true
                }
                R.id.search -> {
                    // Si l'item "Search" est sélectionné, on ouvre SearchActivity
                    val intent = Intent(this, SearchActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.library -> {
                    // Gérer la navigation vers LibraryActivity si nécessaire
                    true
                }
                R.id.profile -> {
                    // Gérer la navigation vers ProfileActivity si nécessaire
                    true
                }
                else -> false
            }
        }
    }
}
