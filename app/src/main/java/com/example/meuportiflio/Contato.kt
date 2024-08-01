package com.example.meuportiflio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.meuportiflio.databinding.ActivityContatoBinding

class Contato : AppCompatActivity() {
    private lateinit var binding: ActivityContatoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContatoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbarContato = binding.toolbarContato
        toolbarContato.setNavigationOnClickListener {
            finish()
        }

        binding.btnWhatsapp.setOnClickListener {
            val url = "https://api.whatsapp.com/send?phone=5592995086461"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }
}