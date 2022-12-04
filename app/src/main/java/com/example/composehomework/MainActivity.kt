package com.example.composehomework

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composehomework.ui.theme.ComposeHomeWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeHomeWorkTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SetText()
                    SetImage()
                    SetColum()

                }
            }
        }
    }


    @Composable
    fun SetText() {
        Text(
            text = stringResource(R.string.login_app),
            fontSize = 40.sp,
            textAlign = TextAlign.Center

        )
    }

    @Composable
    fun SetImage() {
        Image(
            painter = painterResource(id = R.drawable.hello_1),
            contentDescription = null,
            modifier = Modifier.requiredSize(250.dp),

            )

    }

    @Composable

    fun SetColum() {
        var remembered by remember {
            mutableStateOf("")
        }
        var remembered2 by remember { mutableStateOf("") }
        val minStr = 8
        val context = LocalContext.current
        Column(
            modifier = Modifier.padding(PaddingValues(top = 100.dp)),
            horizontalAlignment = Alignment.CenterHorizontally


        ) {
            TextField(
                value = remembered,
                onValueChange = {
                    if (minStr >= it.length) remembered = it
                },
                label = {
                    Text(text = stringResource(R.string.enter_your_name))
                },
                visualTransformation = PasswordVisualTransformation(),


                )
            TextField(
                value = remembered2,
                onValueChange = {
                    if (minStr >= it.length) remembered2 = it
                },
                label = {
                    Text(text = stringResource(R.string.enter_your_password))
                },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Button(
                onClick = {

                    Toast.makeText(context, "$remembered $remembered2", Toast.LENGTH_LONG).show()
                    context.startActivity(Intent(context, HomeLoginActivity::class.java))

                },
                modifier = Modifier
                    .wrapContentHeight()
                    .wrapContentWidth()
                    .padding(PaddingValues(top = 250.dp))


            ) {
                Text(
                    text = stringResource(R.string.SING_UP),
                    color = colorResource(id = R.color.teal_200),
                )

            }

        }
    }
}





