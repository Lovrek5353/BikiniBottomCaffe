package com.example.bikinibottomcaffe.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bikinibottomcaffe.data.Product
import com.example.bikinibottomcaffe.data.drinks

@Composable
fun drinksList(
    modifier: Modifier = Modifier,
    onItemClick: () -> Unit={},
    items: List<Product>
){
    LazyRow(modifier= Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(10.dp)
    ){
        items(items){
            drinkCard(item = it,
                modifier = Modifier
                    .padding(5.dp)
            )
        }
    }
}

@Preview
@Composable
fun drinksListPreview(){
    drinksList(items= drinks)
}