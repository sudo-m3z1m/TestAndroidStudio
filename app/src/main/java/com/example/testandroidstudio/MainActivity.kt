package com.example.testandroidstudio

import android.graphics.Picture
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testandroidstudio.ui.theme.TestAndroidStudioTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestAndroidStudioTheme {
                ready()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable()
fun ready()
{
    paste_page(
        Modifier
            .fillMaxSize()
            .wrapContentSize())
}

@Composable
fun paste_page(modifier: Modifier)
{
    var counter by remember { mutableIntStateOf(1) }
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "Femboy")
        Text(text = stringResource(R.string.app_name), color = colorResource(R.color.purple_500))
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = {counter = on_button_clicked(counter)}) {
            Text(text = "Push me")
        }
        Text(text = counter.toString())
    }
}

fun on_button_clicked(counter: Int): Int
{
    return counter + 1
}
