package com.nkee.composenavigation.content.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextLayoutInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nkee.composenavigation.R
import com.nkee.composenavigation.content.Screen

@Composable
fun HomeScreen(navController: NavController) {
    var name by remember { mutableStateOf("") }
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(
            text = stringResource(R.string.home),
            style = TextStyle(color = Color.Black, fontSize = 24.sp),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        )
        TextField(
            value = name,
            label = { Text(stringResource(R.string.your_name)) },
            onValueChange = { name = it },
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = { navController.navigate(Screen.Profile.withArgs(name)) },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(stringResource(R.string.login))
        }
    }
}