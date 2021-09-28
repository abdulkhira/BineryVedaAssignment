package com.bineryveda.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bineryveda.assignment.databinding.ActivityMainBinding
import com.bineryveda.assignment.databinding.ActivityRegisterBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()

    }

    fun setupRecyclerView() {
        val imageAdapter = ImageAdapter()
        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerView.adapter = imageAdapter
    }

}