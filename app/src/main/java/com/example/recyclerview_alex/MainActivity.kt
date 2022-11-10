package com.example.recyclerview_alex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.superman,
                "Superman",
                "lorem ipsum lorem ipsumlorem ipsumlorem ipsumlorem "
            ),
            Superhero(
                R.drawable.doctor,
                "Doctor Strange",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem "
            ),
            Superhero(R.drawable.captain,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem "
            ),
            Superhero(R.drawable.groot,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem "
            ),
            Superhero(R.drawable.hulk,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem "
            ),
            Superhero(R.drawable.ironman,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsum"
            ),
            Superhero(R.drawable.thanos,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsum"
            ),
            Superhero(R.drawable.marvel,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsum"
            ),Superhero(R.drawable.panther,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsum"
            ),Superhero(R.drawable.spiderman,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsum"
            ),Superhero(R.drawable.thor,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsum"
            ),Superhero(R.drawable.starlod,
                "Superman",
                "lorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsumlorem ipsum"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}