package com.example.kevinjonsonrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "AntMan adalah manusia semut AntMan adalah manusia semut AntMan adalah manusia semut"
            ),
            Superhero(
                R.drawable.black,
                "Black Widow",
                "Black Widow adalah seorang karakter di MCU"
            ),
            Superhero(
                R.drawable.captain,
                "Captain America",
                "Captain America adalah karakter yang memegang shield di tangannya"
            ),
            Superhero(
                R.drawable.iron,
                "Iron Man",
                "Iron Man adalah karakter yang memakai kostum berwarna merah"
            ),
            Superhero(
                R.drawable.marvel,
                "Captain Marvel",
                "Dia adalah karakter superhero perempuan"
            ),
            Superhero(
                R.drawable.gamora,
                "Gamora",
                "Gamora adalah anaknya Thanos"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hulk adalah karakter yang berwarna hijau"
            ),
            Superhero(
                R.drawable.doctor,
                "Doctor Strange",
                "Dia adalah karakter yang dapat kembali ke masa lalu"
            ),
            Superhero(
                R.drawable.hawkeye,
                "Clint Barton",
                "Dia adalah karakter yang memakai panah jika bertarung"
            )
        )

        val RecyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}