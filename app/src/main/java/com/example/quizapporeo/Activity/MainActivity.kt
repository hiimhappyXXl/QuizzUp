package com.example.quizapporeo.Activity

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quizapporeo.R
import com.example.quizapporeo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window: Window =this@MainActivity.window
        window.statusBarColor= ContextCompat.getColor(this@MainActivity, R.color.grey)

        binding.apply {
            singleBtn.setOnClickListener {
                val intent=Intent(this@MainActivity,QuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list", ArrayList(questionList()))
                startActivity(intent)
            }
        }
    }


private fun questionList() :MutableList<QuestionModel> {
    val question: MutableList<QuestionModel> = mutableListOf()
    question.add(
        QuestionModel(
            1,
            "In quale paese si trova il ponte di Brooklyn?",
            "Canada",
            "Stati Uniti",
            "Germani",
            "Francia",
            "b",
            5,
            "q_1",
            null
        )
    )
    question.add(
        QuestionModel(
            2,
            "Quale di questi è un piatto giapponese",
            "Sushi",
            "Pizza",
            "Pasta",
            "Kimchi",
            "a",
            5,
            "q_2",
            null
        )
    )
    question.add(
        QuestionModel(
            3,
            "Chi fu Diego Armando Maradona?",
            "Un nuotatore",
            "Un calciatore",
            "Un tennista",
            "Un pallavolista",
            "b",
            5,
            "q_3",
            null
        )
    )
    question.add(
        QuestionModel(
            4,
            "A quale classe di animali appartiene il kea?",
            "Pesci",
            "Artropodi",
            "Mammiferi",
            "Pappagalli",
            "d",
            5,
            "q_4",
            null
        )
    )
    question.add(
        QuestionModel(
            5,
            "Qual è il monte più alto del Giappone?",
            "Il Monte Yari",
            "Il Monte Shiomi",
            "Il Monte Fuji",
            "Il Monte Komori",
            "c",
            5,
            "q_5",
            null
        )
    )
    question.add(
        QuestionModel(
            6,
            "Chi ha dipinto La Notte Stellata?",
            "Giorgio Vasari",
            "Vincent Van Gogh",
            "Andrea Del Verrocchio",
            "Titan",
            "b",
            5,
            "q_6",
            null
        )
    )
    question.add(
        QuestionModel(
            7,
            "Quale personaggio Diney è conosciuto come Mickey Mouse in America?",
            "Paperino",
            "Pluto",
            "Pippo",
            "Topolino",
            "d",
            5,
            "q_7",
            null
        )
    )
    question.add(
        QuestionModel(
            8,
            "Quale cibo mangia principalmente il Panda Gigante?",
            "Erba",
            "Carne",
            "Bambù",
            "Banane",
            "c",
            5,
            "q_8",
            null
        )
    )
    question.add(
        QuestionModel(
            9,
            "Cosa produce l'azienda Lindt?",
            "Cosmetici",
            "Articoli di cancelleria",
            "Cioccolata",
            "Prodotti per bambini",
            "c",
            5,
            "q_9",
            null
        )
    )
    question.add(
        QuestionModel(
            10,
            "Cos'è il menisco?",
            "Una secrazione mucosa",
            "Un prodotto dei reni",
            "Un altro nome per la bile",
            "Cartilagine fra femore e tibia",
            "d",
            5,
            "q_10",
            null
        )
    )
    return question }
}