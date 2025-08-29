package com.example.brewme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
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
        val menupage = findViewById<ImageView>(R.id.menu)
        menupage.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        val homepage = findViewById<ImageView>(R.id.home)
        homepage.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }

        val cappaccino = findViewById<Button>(R.id.cappaccinobtn)
        cappaccino.setOnClickListener {
            val intent = Intent(this, cappaccinoActivity::class.java)
            startActivity(intent)
        }

        val americano = findViewById<Button>(R.id.amercanobtn)
        americano.setOnClickListener {
            val intent = Intent(this, AmericanoActivity::class.java)
            startActivity(intent)
        }

        val espresso = findViewById<Button>(R.id.cappaccinobtn2)
        espresso.setOnClickListener {
            val intent = Intent(this, EspressoActivity::class.java)
            startActivity(intent)
        }

        val offer = findViewById<Button>(R.id.offerbtn)
        offer.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        val profile = findViewById<ImageView>(R.id.imageView13)
        profile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}