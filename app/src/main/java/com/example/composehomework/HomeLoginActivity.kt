package com.example.composehomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composehomework.ui.theme.ComposeHomeWorkTheme

class HomeLoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeHomeWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SetImage2()
                    SetText2()
                }
            }
        }
    }
}
@Composable
fun SetText2() {
    Text(
        text = stringResource(R.string.WELCOME_HOME),
        fontSize = 40.sp,
        textAlign = TextAlign.Center

    )
}

@Composable
fun SetImage2() {
    Image(
        painter = painterResource(id = R.drawable.im_1),
        contentDescription = null,
        modifier = Modifier.requiredSize(350.dp),

        )

}
