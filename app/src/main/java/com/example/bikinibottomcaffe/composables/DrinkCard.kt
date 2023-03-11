package com.example.bikinibottomcaffe.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bikinibottomcaffe.R
import com.example.bikinibottomcaffe.data.Product
import com.example.bikinibottomcaffe.data.drink5

@Composable
fun drinkCard(
    modifier: Modifier = Modifier,
    onDrinkItemClick: () -> Unit = {},
    item: Product
){
    Box(modifier = modifier
        .clickable { onDrinkItemClick() }
        .clip(RoundedCornerShape(dimensionResource(id = R.dimen.drinkCardRound)))
        .size(
            width = dimensionResource(id = R.dimen.drinkCardWidth),
            height = dimensionResource(id = R.dimen.drinkCardHeight)
        )
    ){
        Image(painter = painterResource(id = R.drawable.coca_cola),
            contentDescription = stringResource(id = R.string.drinkImage),
            modifier= Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        addToCartButton(drink = item)
        Column(modifier = Modifier
            .padding(top=100.dp, start=3.dp)
        ) {
            Text(text = item.name,
                fontWeight = FontWeight.Bold,
                color= Color.Magenta
            )
            Text(text = item.price.toString()+ " €",
                fontWeight = FontWeight.Bold,
                color= Color.Magenta
            )
        }
/*        Text(text = item.name,
            modifier= Modifier.padding(top = 130.dp),
            fontWeight = FontWeight.Bold,
            color= Color.Magenta
        )
        Text(text = item.price.toString()+" €",
            modifier= Modifier.padding(top = 150.dp),
            fontWeight = FontWeight.Bold,
            color= Color.Magenta
        )*/
    }
}

@Preview
@Composable
fun drinkCardPreview(){
    drinkCard(item= drink5)
}