package com.example.bikinibottomcaffe.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bikinibottomcaffe.R
import com.example.bikinibottomcaffe.data.Product
import com.example.bikinibottomcaffe.data.drink1

@Composable
fun addToCartButton(
    modifier: Modifier = Modifier,
    drink: Product
){
    IconButton(onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Filled.Add,
            tint = Color.Yellow,
            contentDescription = stringResource(id = R.string.addToCart),
            modifier= modifier
                .background(color = Color.Blue,
                shape = CircleShape)

        )
    }
}

@Preview
@Composable
fun addToCartButtonPreview(){
    addToCartButton(drink = drink1)
}