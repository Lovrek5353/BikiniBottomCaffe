package com.example.bikinibottomcaffe.composables

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TableNumberTextField(
    //navController + viewModel
){
    val coroutineScope= rememberCoroutineScope()
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text ,
        onValueChange = {
            text=it
        },
        label = {
            Text(text = "Table number")
        },
        placeholder = {
            Text(text = "Enter table number ")
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = false,
            keyboardType = KeyboardType.Number
        ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.LocationOn ,
                contentDescription = "TableNumberLeadingIcon")
        }

    )
}

@Preview
@Composable
fun TableNumberTextFiledPreview(){
    TableNumberTextField()
}