package com.example.bikinibottomcaffe.screens



import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bikinibottomcaffe.R
import com.example.bikinibottomcaffe.composables.cartItemsList
import com.example.bikinibottomcaffe.data.drinks
import com.example.bikinibottomcaffe.data.totalPrice


@Composable
fun CartScreen(
    //navController: NavController,
    //viewModel: CartViewModel -commented so it doesn't affect previewing
){
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                backgroundColor = Color.Green,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.List, contentDescription = stringResource(id = R.string.main_screen))
                }
                Text(
                    text = "Your cart",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 50.dp)
                )
            }
        }
    ) {
        LazyColumn(
            modifier= Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            item{
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = stringResource(id = R.string.yourOrder),
                    textAlign = TextAlign.Center,
                    fontWeight= FontWeight.Bold,
                    fontSize= 20.sp,
                    modifier= Modifier
                        .fillMaxWidth()
                )
            }
            item{
                cartItemsList(
                    items = drinks,
                    modifier = Modifier
                        .fillMaxWidth()
                        .scale(2f)
                )
            }
            item{
                Spacer(modifier = Modifier.height(10.dp))
                var total= totalPrice(drinks)
                Text(
                    text = stringResource(id = R.string.total)+": "+total.toString()+" €",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal,
                    fontSize = 30.sp
                )
            }
            item{
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                ) {
                    Text(text= stringResource(id = R.string.submit))
                }
            }
        }

    }
}

@Preview
@Composable
fun CartScreenPreview() {
    CartScreen()
}


