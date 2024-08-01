package com.example.meuportiflio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.meuportiflio.databinding.ActivityProjetosBinding

class Projetos : AppCompatActivity() {
    private lateinit var binding: ActivityProjetosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjetosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbarProjetos = binding.toolbarProjetos
        toolbarProjetos.setNavigationOnClickListener {
            finish()
        }



    }
}