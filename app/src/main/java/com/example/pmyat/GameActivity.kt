package com.example.pmyat
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game) // Aqui Establezco el diseño de la actividad

        // Se Muestra un mensaje Toast para confirmar que la actividad se inició correctamente.
        Toast.makeText(this, "GameActivity iniciada", Toast.LENGTH_SHORT).show()
    }
}
