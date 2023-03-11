package com.example.bikinibottomcaffe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bikinibottomcaffe.composables.OrderCard
import com.example.bikinibottomcaffe.data.orders


@Composable
fun OrderScreen(
    //navController: NavController,
    //viewModel: OrdersViewModel -commented so it doesn't affect previewing
){
    val orders= orders
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize(),
        topBar = {
                 TopAppBar(
                     modifier = Modifier.fillMaxWidth()
                 ) {
                     Text(
                         text = "Order Screen",
                         textAlign = TextAlign.Center,
                         modifier = Modifier.fillMaxWidth(),
                     )
                 }
        },
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Box(
                        modifier = Modifier
                            .alignByBaseline()
                            .padding(start = 75.dp)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(
                                onClick = { TODO() },
                                modifier = Modifier.size(25.dp)
                            )
                            {
                                Icon(
                                    imageVector = Icons.Default.Home,
                                    contentDescription = "Home button"
                                )
                            }
                            Text(text = "All Orders", textAlign = TextAlign.Center)
                        }
                    }
                    Box(
                        modifier = Modifier
                            .wrapContentWidth(align = Alignment.CenterHorizontally)
                            .padding(start = 100.dp)
                            .fillMaxWidth()
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            IconButton(
                                onClick = { TODO() },
                                modifier = Modifier
                                       .size(25.dp)
                            )
                            {
                                Icon(
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = "Favorites",
                                    modifier = Modifier.wrapContentWidth(align = Alignment.CenterHorizontally)
                                )
                            }
                            Text(text = "My Orders", textAlign = TextAlign.Center)
                        }
                    }
                }
            }
        }
    ) {
        Column(
            modifier= Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            for(order in orders){
                    Spacer(modifier = Modifier.height(30.dp))
                    OrderCard(order = order)
            }
        }
    }
}

@Preview
@Composable
fun OrderScreenPreview(){
    OrderScreen()
}


