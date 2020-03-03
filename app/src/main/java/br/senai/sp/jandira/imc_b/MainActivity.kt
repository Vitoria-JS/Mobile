package br.senai.sp.jandira.imc_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // *** Instanciando as classes referentes aos
        // *** componentes(View) da activity
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val editTextPeso = findViewById<EditText>(R.id.edit_text_peso)
        val editTextAltura = findViewById<EditText>(R.id.edit_text_altura)

        // *** declarar variáveis que receberão os valores dos editTexts
        var peso: Double
        var altura: Double
        var imc: Double
        var mensagem: String

        buttonCalcular.setOnClickListener {
            val abrirActivityResultado = Intent(this, ResultadoActivity::class.java)
            abrirActivityResultado.putExtra("peso", editTextPeso.text.toString())
            abrirActivityResultado.putExtra("altura", editTextAltura.text.toString())
            startActivity(abrirActivityResultado)
        }

       /* buttonCalcular.setOnClickListener {
            // *** recupera os valores digitados
            // *** e atribui as variáveis
            peso = editTextPeso.text.toString().toDouble()
            altura = editTextAltura.text.toString().toDouble()

            // *** calcular o valor do IMC
            imc = peso / (altura * altura)
        }*/
    }
}
