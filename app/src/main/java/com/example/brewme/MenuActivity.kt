package com.example.brewme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //navigation bar linking
        val offerspage = findViewById<ImageView>(R.id.offers)
        offerspage.setOnClickListener {
            val intent = Intent(this, OffersActivity::class.java)
            startActivity(intent)
        }
        val cartpage = findViewById<ImageView>(R.id.cart)
        cartpage.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }
        val favouritespage = findViewById<ImageView>(R.id.favourite)
        favouritespage.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        val homepage = findViewById<ImageView>(R.id.home)
        homepage.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }

        //menu nagivation linking
        val cappacino = findViewById<Button>(R.id.cappaccino)
        cappacino.setOnClickListener {
            val intent = Intent(this, cappaccinoActivity::class.java)
            startActivity(intent)
        }

        val espresso = findViewById<Button>(R.id.espresso)
        espresso.setOnClickListener {
            val intent = Intent(this, EspressoActivity::class.java)
            startActivity(intent)
        }

        val americano = findViewById<Button>(R.id.americano)
        americano.setOnClickListener {
            val intent = Intent(this, AmericanoActivity::class.java)
            startActivity(intent)
        }

        val mocha = findViewById<Button>(R.id.mocha)
        mocha.setOnClickListener {
            val intent = Intent(this, MochaActivity::class.java)
            startActivity(intent)
        }

        val bCoffee = findViewById<Button>(R.id.blackCoffee)
        bCoffee.setOnClickListener {
            val intent = Intent(this, BlackCoffeeActivity::class.java)
            startActivity(intent)
        }
    }
}