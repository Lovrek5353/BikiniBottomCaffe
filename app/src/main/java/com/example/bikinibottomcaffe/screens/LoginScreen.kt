package com.example.bikinibottomcaffe.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bikinibottomcaffe.composables.TableNumberTextField


@Composable
fun LoginScreen(
    //viewModel: LoginViewModel  -commented so it doesn't affect previewing
){
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.fillMaxSize()
    ){
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            item {
                TableNumberTextField()
                TODO("Add a text field for entering table number")
            }
            item{
                Spacer(modifier = Modifier.height(10.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Enter")
                }
            }
            item{
                Spacer(modifier = Modifier.height(10.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Proceed without ordering")
                }
            }
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}
