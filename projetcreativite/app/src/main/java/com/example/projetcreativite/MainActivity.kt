package com.example.projetcreativite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var nom:EditText
    private lateinit var prenom:EditText
    private lateinit var email:EditText
    private lateinit var numero:EditText
    private lateinit var affiche:Button
    private lateinit var view:TextView
    private lateinit var boutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nom=findViewById(R.id.editTextText)
        prenom=findViewById(R.id.editTextText2)
        email=findViewById(R.id.editTextText3)
        numero=findViewById(R.id.editTextText4)
        affiche=findViewById(R.id.button)
        boutton=findViewById(R.id.button2)
        view=findViewById(R.id.textView)

        affiche.setOnClickListener(){
            afichage();
        }
        boutton.setOnClickListener(){
            list();
        }



    }
    private fun afichage(){
        val anarana=nom.text.toString()
        val prenome=prenom.text.toString()
        val emaile=email.text.toString()
        val numeroe=numero.text.toString()


        if(anarana.isEmpty() && prenome.isEmpty()&& emaile.isEmpty() && numeroe.isEmpty()){
            Toast.makeText(this,"fenoy ny banga", Toast.LENGTH_SHORT).show()
        }else{

            val mess="nom:$anarana"
            val a="prenom:$prenome"
            val b="email:$emaile"
            val d="numero:$numeroe"
            Toast.makeText(this,mess,Toast.LENGTH_LONG).show()
           Toast.makeText(this,a,Toast.LENGTH_LONG).show()
            Toast.makeText(this,b,Toast.LENGTH_LONG).show()
           Toast.makeText(this,d,Toast.LENGTH_LONG).show()

        }
    }
    private fun list(){
        val anarana=nom.text.toString()
        val prenome=prenom.text.toString()
        val emaile=email.text.toString()
        val numeroe=numero.text.toString()
        if(anarana.isEmpty() && prenome.isEmpty()&& emaile.isEmpty() && numeroe.isEmpty()){
            Toast.makeText(this,"fenoy ny banga", Toast.LENGTH_SHORT).show()
        }else{
            val message="nom:$anarana\nprenom:$prenome\nemail:$emaile\nnumero:$numeroe"
            view.text=message;
        }

    }

}