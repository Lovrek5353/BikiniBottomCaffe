package com.example.bikinibottomcaffe.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bikinibottomcaffe.composables.drinksList
import com.example.bikinibottomcaffe.data.drinks

@Composable
fun MainScreen(
    //navController: NavController,
    //viewModel: MainViewModel  -commented so it doesn't affect previewing
){
    val scaffoldState: ScaffoldState= rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                        ){
                    IconButton(onClick = { TODO()/*navController.navigate(Screen.CartScreen.route)*/ }) {  //back to login button
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back to login screen"
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                    ) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Go to Cart")
                    }
                }

            }
        },
        modifier = Modifier
            .fillMaxSize()
    ){
        LazyColumn {
            item{
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Caffe",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
            }
            item{
                drinksList(items = drinks)
            }
            item{
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Juice",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
            }
            item{
                drinksList(items = drinks)
            }
            item{
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Beer",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
            }
            item{
                drinksList(items = drinks)
            }
            item{
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Shots",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
            }
            item{
                drinksList(items = drinks)
            }
        }
    }
}


@Preview
@Composable
fun MainScreenPreview(){
    MainScreen()
}
