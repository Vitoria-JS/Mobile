package br.senai.sp.jandira.imc_b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var peso = intent.getStringExtra("peso")
        Toast.makeText(this,"Eu sou um Toast!" + peso,Toast.LENGTH_SHORT).show()
        var altura = intent.getStringExtra("altura")
    }
}


/* *** determinar a situação do usuário
if (imc < 18.5){
    mensagem = "Seu IMC é " + imc + ". Você está abaixo do peso. CUIDADO!"
} else if (imc >= 18.6 && imc < 25){
    mensagem = "Seu IMC é " + imc + ". Seu peso é o ideal. PARABÉNS!"
} else if (imc >= 25 && imc < 30){
    mensagem = "Seu IMC é " + imc + ". Você está levemente acima do peso. ATENÇÃO!"
} else if (imc >= 30 && imc < 35){
    mensagem = "Seu IMC é " + imc + ". Você está com obesidade GRAU I. CUIDADO!"
} else if (imc >= 35 && imc < 40){
    mensagem = "Seu IMC é " + imc + ". Você está com obesidade GRAU II. CUIDADO!"
} else {
    mensagem = "Seu IMC é " + imc + ". Você está com obesidade GRAU III. RISCO DE MORTE!"
}*/