package com.nextcomm.caca_ao_tesouro

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class GameViewModel : ViewModel() {
    var clickCount by mutableStateOf(0)
    var targetClicks by mutableStateOf(Random.nextInt(1, 51))
    var currentImage by mutableStateOf(R.drawable.inicial)
    var currentText by mutableStateOf("Início da jornada")
    var gameEnded by mutableStateOf(false)
    var gameAbandoned by mutableStateOf(false)

    fun updateImage() {
        val progress = clickCount.toFloat() / targetClicks
        when {
            progress < 0.33f -> {
                currentImage = R.drawable.inicial
                currentText = "Você encontrou o mapa do tesouro"
            }
            progress < 0.66f -> {
                currentImage = R.drawable.nivel_2
                currentText = "Jornada até o tesouro, continue em frente!"
            }
            progress < 1.0f -> {
                currentImage = R.drawable.nivel_3
                currentText = "Visualização do tesouro, continue!"
            }
            else -> {
                gameEnded = true
                currentImage = R.drawable.nivel_4
                currentText = "Você encontrou o tesouro! Parabéns!"
            }
        }
    }

    fun resetGame() {
        clickCount = 0
        targetClicks = Random.nextInt(1, 51)
        currentImage = R.drawable.inicial
        currentText = "Início da jornada"
        gameEnded = false
        gameAbandoned = false
    }

    fun incrementClickCount() {
        if (!gameEnded && !gameAbandoned) {
            clickCount++
            updateImage()
        }
    }

    fun abandonGame() {
        currentImage = R.drawable.nivel_5
        currentText = "Que pena, você desistiu"
        gameEnded = true
        gameAbandoned = true
    }
}