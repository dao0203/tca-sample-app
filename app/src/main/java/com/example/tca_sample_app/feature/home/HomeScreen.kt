package com.example.tca_sample_app.feature.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold {
        LazyColumn(
            modifier = modifier.padding(it),
            content = {
                item {
                    //TODO: 現状はtext
                    Text(text = "HomeScreen")
                }
                item {
                    //TODO: 現状はtext
                    Text(text = "HomeScreen")
                }
            },
        )
    }
}

