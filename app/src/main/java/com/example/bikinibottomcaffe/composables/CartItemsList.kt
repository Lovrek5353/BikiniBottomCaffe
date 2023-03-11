package com.example.bikinibottomcaffe.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bikinibottomcaffe.data.Product
import com.example.bikinibottomcaffe.data.drinks

@Composable
fun cartItemsList(
    modifier: Modifier = Modifier,
    onItemClick: () -> Unit = {},
    items: List<Product>
){
    Column {
        for(item in items){
            CartItem(item = item,
                modifier = Modifier.padding(top = 5.dp, start = 5.dp, end = 5.dp))
        }
    }
/*    LazyColumn(
    ){
        items(items){
            CartItem(item = it,
                modifier = Modifier.padding(top = 5.dp, start = 5.dp, end = 5.dp))
        }
    }*/
}

@Preview
@Composable
fun cartItemsListPreview(){
    cartItemsList(items = drinks)
}