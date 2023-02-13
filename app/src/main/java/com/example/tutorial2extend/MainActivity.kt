package com.example.tutorial2extend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val myRandomValues = List(6) { Random.nextInt(1, 49) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1 = findViewById(R.id.textView1) as TextView
        var num2 = findViewById(R.id.textView2) as TextView
        var num3 = findViewById(R.id.textView3) as TextView
        var num4 = findViewById(R.id.textView4) as TextView
        var num5 = findViewById(R.id.textView5) as TextView
        var num6 = findViewById(R.id.textView6) as TextView

        num1.setVisibility(View.INVISIBLE)
        num2.setVisibility(View.INVISIBLE)
        num3.setVisibility(View.INVISIBLE)
        num4.setVisibility(View.INVISIBLE)
        num5.setVisibility(View.INVISIBLE)
        num6.setVisibility(View.INVISIBLE)

        var generate = findViewById(R.id.genbut) as Button

        var counter = 0


        println(myRandomValues)


        generate.setOnClickListener(){

            counter = counter+1

            if (counter==1){
                num1.text = myRandomValues[0].toString()
                num1.setVisibility(View.VISIBLE)
            }
            else if (counter==2){
                num2.text = myRandomValues[1].toString()
                num2.setVisibility(View.VISIBLE)
            }
            else if (counter==3){
                num3.text = myRandomValues[2].toString()
                num3.setVisibility(View.VISIBLE)
            }
            else if (counter==4){
                num4.text = myRandomValues[3].toString()
                num4.setVisibility(View.VISIBLE)
            }
            else if (counter==5){
                num5.text = myRandomValues[4].toString()
                num5.setVisibility(View.VISIBLE)
            }
            else if (counter==6){
                num6.text = myRandomValues[5].toString()
                num6.setVisibility(View.VISIBLE)
            }
            else{
                Toast.makeText(applicationContext,"All numbers are generated", Toast.LENGTH_SHORT).show()
            }

        }

        var but1 = findViewById(R.id.buttons1) as Button
        var but2 = findViewById(R.id.buttons2) as Button
        var but3 = findViewById(R.id.buttons3) as Button
        var but4 = findViewById(R.id.buttons4) as Button
        var but5 = findViewById(R.id.buttons5) as Button
        var but6 = findViewById(R.id.buttons6) as Button


        but1.setOnClickListener(){
            num1.text = generateRandomNumber().toString()
        }
        but2.setOnClickListener(){
            num2.text = generateRandomNumber().toString()
        }
        but3.setOnClickListener(){
            num3.text = generateRandomNumber().toString()
        }
        but4.setOnClickListener(){
            num4.text = generateRandomNumber().toString()
        }
        but5.setOnClickListener(){
            num5.text = generateRandomNumber().toString()
        }
        but6.setOnClickListener(){
            num6.text = generateRandomNumber().toString()
        }



        var changebtn= findViewById(R.id.changebtn) as Button
        changebtn.setOnClickListener(){
            var ankaya = findViewById(R.id.editTextNumber) as EditText
            var temp = ankaya.text.toString().toInt()
            var indexoftemp = myRandomValues.indexOf(temp)

            if (indexoftemp != -1) {
                indexoftemp=indexoftemp+1
                //testing
                println("The number is present in the list at place: $indexoftemp")
//                var magic = StringBuilder()
//                magic.append("num").append(indexoftemp)
//                println(magic)
                if (indexoftemp.equals(1)){
                    num1.setVisibility(View.INVISIBLE)
                }
                else if (indexoftemp.equals(2)){
                    num2.setVisibility(View.INVISIBLE)
                }
                else if (indexoftemp.equals(3)){
                    num3.setVisibility(View.INVISIBLE)
                }
                else if (indexoftemp.equals(4)){
                    num4.setVisibility(View.INVISIBLE)
                }
                else if (indexoftemp.equals(5)){
                    num5.setVisibility(View.INVISIBLE)
                }
                else if (indexoftemp.equals(6)){
                    num6.setVisibility(View.INVISIBLE)
                }


            } else {
                println("Number not present in the list")
            }
        }
    }

    fun generateRandomNumber(): Int {
        while (true) {
            val randomNum = (1..49).random()
            if (randomNum !in listOf(myRandomValues[0], myRandomValues[1], myRandomValues[2],myRandomValues[5],myRandomValues[4],myRandomValues[3])) {
                return randomNum
            }
        }
    }






}