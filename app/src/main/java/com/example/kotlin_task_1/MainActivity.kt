package com.example.kotlin_task_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.text_view);

        button.setOnClickListener(View.OnClickListener {
            textView.setText("TextTextText!");
        });

        readRepositoryFor()
        testWhen(ProffessionOfPerson.TEACHER);
    }



    private fun readRepositoryFor(){
        for (Person in Repository.personArray){
            println(Person);
        }
    }
    private fun testWhen(proffessionOfPerson: ProffessionOfPerson) {
        val proffession = when (proffessionOfPerson) {
            ProffessionOfPerson.DOCTOR -> "достаем скальпель"
            ProffessionOfPerson.POLICE -> "виу виу"
            ProffessionOfPerson.TEACHER -> "протираем доску"
        }
       println(proffession);
    }




}