package com.nkee.composenavigation.content.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nkee.composenavigation.R

@Composable
fun ProfileScreen (name: String?) {
    Column (

        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(text = "Profile",
            style = TextStyle(color = Color.Black, fontSize = 24.sp),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        )
        Text(text = stringResource(R.string.hello, name ?: "username"),)
    }


}