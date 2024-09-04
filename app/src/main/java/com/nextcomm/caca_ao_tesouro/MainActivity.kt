package com.nextcomm.caca_ao_tesouro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    private val gameViewModel: GameViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                CacaTesouroGame(gameViewModel)
            }
        }
    }
}

@Composable
fun CacaTesouroGame(viewModel: GameViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = viewModel.currentImage),
            contentDescription = "Imagem do progresso da caça ao tesouro",
            modifier = Modifier
                .size(480.dp)
                .clickable {
                    viewModel.incrementClickCount()
                }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = viewModel.currentText)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Cliques dados: ${viewModel.clickCount}")
        Text(text = "Cliques restantes: ${viewModel.targetClicks - viewModel.clickCount}")

        Spacer(modifier = Modifier.height(16.dp))

        if (viewModel.gameEnded && !viewModel.gameAbandoned) {
            Button(onClick = {
                viewModel.resetGame()
            }) {
                Text("Jogar Novamente")
            }
        } else if (!viewModel.gameAbandoned) {
            Button(onClick = {
                viewModel.abandonGame()
            }) {
                Text("Desistir")
            }
        } else {
            Button(onClick = {
                viewModel.resetGame()
            }) {
                Text("Jogar Novamente")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val viewModel = GameViewModel()
    MaterialTheme {
        CacaTesouroGame(viewModel)
    }
}