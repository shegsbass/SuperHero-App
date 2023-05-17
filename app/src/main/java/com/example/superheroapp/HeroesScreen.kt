package com.example.superheroapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroapp.model.Hero
import com.example.superheroapp.ui.theme.SuperHeroAppTheme


@Composable
fun HeroList(
    heroList: List<Hero>,
    modifier: Modifier
){
        LazyColumn(){
            items(heroList){
                    hero -> Hero(hero, modifier.padding(horizontal = 16.dp, vertical = 8.dp))
            }
    }

}

@Composable
fun Hero(
    hero: Hero,
    modifier: Modifier = Modifier
){
        Card (
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            modifier = modifier

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Column(
                    modifier = Modifier
                        .weight(1f)

                ) {

                    HeroInformation(
                        heroName = hero.heroName,
                        heroDesc = hero.heroDesc,
                    )
                }

                HeroImage(
                    heroImage = hero.heroImageResource,
                modifier = Modifier
                )
            }
    }
}

@Composable
fun HeroInformation(
    @StringRes heroName: Int,
    @StringRes heroDesc: Int,
    modifier: Modifier = Modifier
){
        Text(
            text = stringResource(heroName),
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier
                .padding(end = 16.dp)
        )
        Text(
            text = stringResource(heroDesc),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .padding(end = 16.dp)
        )
}

@Composable
fun HeroImage(
    @DrawableRes heroImage: Int,
    modifier: Modifier = Modifier
){
    Image(
        painter = painterResource(id = heroImage),
        contentDescription = null,
        alignment = Alignment.Center,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .size(72.dp)
            .clip(MaterialTheme.shapes.small)
    )
}

@Preview(showBackground = true)
@Composable
fun SuperHeroPreview() {
    SuperHeroAppTheme {
        SuperHeroApp()
    }
}