package com.example.counter_app

import CounterViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterApp(
    modifier: Modifier = Modifier,
    counterViewModel: CounterViewModel = viewModel()
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "You have pushed the button this many times:")
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "${counterViewModel.counter}",
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { counterViewModel.incrementCounter() }
        ) {
            Text(text = "Increment")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { counterViewModel.decrementCounter() }
        ) {
            Text(text = "Decrement")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CounterAppPreview() {
    CounterApp()
}
