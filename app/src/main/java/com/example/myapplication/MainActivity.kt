package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rolboton: Button = findViewById(R.id.button)
        rolboton.setOnClickListener {
            agregar()
        }
    }
    private fun agregar() {
        val Obtener=obtener(6)
        val Devolver1 = Obtener.devolver1()
        val Devolver2 = Obtener.devolver2()
        val resultado:ImageView = findViewById(R.id.imageView1)
        val resultado2:ImageView = findViewById(R.id.imageView3)
        val info : TextView = findViewById(R.id.textView2)
        val info2 : TextView = findViewById(R.id.textView5)
        val infor : TextView = findViewById(R.id.textView3)
        val infor2 : TextView = findViewById(R.id.textView4)
        if(Devolver1 == 1){
            resultado.setImageResource(R.drawable.dice_1)
            info.text = "Uno"
        }else if(Devolver1 == 2){
            resultado.setImageResource(R.drawable.dice_2)
            info.text = "Dos"
        }else if(Devolver1 == 3){
            resultado.setImageResource(R.drawable.dice_3)
            info.text = "Tres"
        }else if(Devolver1 == 4){
            resultado.setImageResource(R.drawable.dice_4)
            info.text = "Cuatro"
        }else if(Devolver1 == 5){
            resultado.setImageResource(R.drawable.dice_5)
            info.text = "Cinco"
        }else{
            resultado.setImageResource(R.drawable.dice_6)
            info.text = "Seis"
        }
        if(Devolver2 == 1){
            resultado2.setImageResource(R.drawable.dice_1)
            info2.text = "Uno"
        }else if(Devolver2 == 2){
            resultado2.setImageResource(R.drawable.dice_2)
            info2.text = "Dos"
        }else if(Devolver2 == 3){
            resultado2.setImageResource(R.drawable.dice_3)
            info2.text = "Tres"
        }else if(Devolver2 == 4){
            resultado2.setImageResource(R.drawable.dice_4)
            info2.text = "Cuatro"
        }else if(Devolver2 == 5){
            resultado2.setImageResource(R.drawable.dice_5)
            info2.text = "Cinco"
        }else{
            resultado2.setImageResource(R.drawable.dice_6)
            info2.text = "Seis"
        }
        /*
        when (Devolver1) {
            1-> resultado.setImageResource(R.drawable.dice_1)
            2-> resultado.setImageResource(R.drawable.dice_2)
            3-> resultado.setImageResource(R.drawable.dice_3)
            4-> resultado.setImageResource(R.drawable.dice_4)
            5-> resultado.setImageResource(R.drawable.dice_5)
            6-> resultado.setImageResource(R.drawable.dice_6)
        }*/
        when (Devolver1) {
            Devolver1->infor.text = Devolver1.toString()
        }
        when (Devolver2) {
            Devolver2->infor2.text = Devolver2.toString()
        }
        if(Devolver1==Devolver2){
            Toast.makeText(this,"Pares que suerte!",Toast.LENGTH_SHORT).show()
        }
    }
}
class obtener(val numero:Int){

    fun devolver1():Int{
        return (1..numero).random()
    }
    fun devolver2():Int{
        return (1..numero).random()
    }
}
