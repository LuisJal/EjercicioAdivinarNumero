package com.example.ejercicio1_adivinanumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import com.example.ejercicio1_adivinanumero.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var aleatorio = (1 .. 100).random()
        var cont = 0
        binding.introDatos.doAfterTextChanged {
            binding.introDatos.clearFocus()
        }



        binding.btn.setOnClickListener{
            cont += 1


            var numero = Integer.parseInt(binding.introDatos.text.toString())
            if (numero > aleatorio){
                Snackbar.make(view, "El numero que buscas es menor", Snackbar.LENGTH_SHORT).show()


            }else if(numero < aleatorio){
                Snackbar.make(view, "El numero que buscas es mayor", Snackbar.LENGTH_SHORT).show()


            }else{
                Snackbar.make(view, "Acertaste! numero de intentos: $cont", Snackbar.LENGTH_SHORT).show()

            }

        }
    }
}