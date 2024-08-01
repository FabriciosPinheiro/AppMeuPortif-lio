package com.example.meuportiflio

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.example.meuportiflio.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val  fotoPerfil = BitmapFactory.decodeResource(resources, R.drawable.perfil)
        val circular = RoundedBitmapDrawableFactory.create(resources, fotoPerfil)
        circular.isCircular = true
        binding.imgPerfil.setImageDrawable(circular)

        binding.btnProjetos.setOnClickListener{
            val intent = Intent(this, Projetos::class.java)
            startActivity(intent)
        }

        binding.btnContato.setOnClickListener{
            val intent = Intent(this, Contato::class.java)
            startActivity(intent)
        }
    }
}