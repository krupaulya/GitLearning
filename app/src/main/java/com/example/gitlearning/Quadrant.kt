package com.example.gitlearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.gitlearning.ui.theme.Quadrant1
import com.example.gitlearning.ui.theme.Quadrant2
import com.example.gitlearning.ui.theme.Quadrant3
import com.example.gitlearning.ui.theme.Quadrant4

@Composable
fun Quadrant() {
    Column(
        Modifier.fillMaxWidth()
    ) {
        Row(Modifier.weight(1f)) {
            Card(
                title = stringResource(R.string.text_composable),
                description = stringResource(R.string.displays_text_and_follows_the_recommended_material_design_guidelines),
                backgroundColor = Quadrant1,
                modifier = Modifier.weight(1f)
            )
            Card(
                title = stringResource(R.string.image_composable),
                description = stringResource(R.string.creates_a_composable),
                backgroundColor = Quadrant2,
                modifier = Modifier.weight(1f)
            )
        }

        Row(Modifier.weight(1f)) {
            Card(
                title = stringResource(R.string.row_composable),
                description = stringResource(R.string.a_layout_composable),
                backgroundColor = Quadrant3,
                modifier = Modifier.weight(1f)
            )
            Card(
                title = stringResource(R.string.column_composable),
                description = stringResource(R.string.a_layout_composable_that),
                backgroundColor = Quadrant4,
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Composable
private fun Card(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            fontSize = TextUnit.Unspecified,
            textAlign = TextAlign.Justify
        )
    }
}
