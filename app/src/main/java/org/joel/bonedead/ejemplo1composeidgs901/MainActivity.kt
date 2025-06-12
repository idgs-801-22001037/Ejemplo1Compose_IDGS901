package org.joel.bonedead.ejemplo1composeidgs901

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.clip
import androidx.compose.material3.Text

import androidx.compose.ui.unit.dp
private val tarjeta: List<PersonajeTarjeta> = listOf(
    PersonajeTarjeta(
        titulo = "Goku",
        body = "Saiyajin criado en la Tierra, protagonista de Dragon Ball y defensor incansable del planeta."
    ),
    PersonajeTarjeta(
        titulo = "Gohan",
        body = "Hijo de Goku, conocido por su enorme potencial y su participación clave en varias sagas."
    ),
    PersonajeTarjeta(
        titulo = "Vegeta",
        body = "Príncipe de los Saiyajin, rival eterno de Goku, con un fuerte deseo de superarlo."
    ),
    PersonajeTarjeta(
        titulo = "Krilin",
        body = "Humano más fuerte del grupo de Z Fighters y gran amigo de Goku desde la infancia."
    ),
    PersonajeTarjeta(
        titulo = "Piccolo",
        body = "Ex enemigo de Goku convertido en aliado. Mentor de Gohan y estratega confiable."
    ),
    PersonajeTarjeta(
        titulo = "Chi-Chi",
        body = "Esposa de Goku y madre de Gohan y Goten. Protectora y enfocada en la educación de sus hijos."
    ),
    PersonajeTarjeta(
        titulo = "Goten",
        body = "Hijo menor de Goku. Tiene un gran parecido con él y domina la fusión junto a Trunks."
    ),
    PersonajeTarjeta(
        titulo = "Trunks",
        body = "Hijo de Vegeta y Bulma, amigo cercano de Goten, con quien forma a Gotenks mediante la fusión."
    ),
    PersonajeTarjeta(
        titulo = "Bulma",
        body = "Genio científica y amiga de Goku desde su niñez. Fundamental para muchas invenciones del grupo."
    ),
    PersonajeTarjeta(
        titulo = "Maestro Roshi",
        body = "Maestro original de Goku. Anciano sabio y poderoso artista marcial, con una personalidad excéntrica."
    )
)


data class PersonajeTarjeta(val titulo: String, val body: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   enableEdgeToEdge()
        setContent {

        }
    }
    @Composable
    fun saludar(name: String) {
    Column {
        Text(text = "Hola $name")

    }
    }

    @Composable
    fun saludoCard(name: String){
        Box{
            Row{
                Image(
                    painter = painterResource(id=R.drawable.goku_normal),
                    contentDescription="Android Logo",
                    modifier = Modifier.padding(10.dp)
                        .size(100.dp)
                        .clip(MaterialTheme.shapes.small)
                        .background(MaterialTheme.colorScheme.primary)
                )
                Column{
                    Spacer(modifier = Modifier.padding(30.dp))
                    Text(text = " $name")

                }
            }
        }


    }
    @Preview
    @Composable
    fun previewSaludo() {
    saludoCard("Joel")
    }

}


