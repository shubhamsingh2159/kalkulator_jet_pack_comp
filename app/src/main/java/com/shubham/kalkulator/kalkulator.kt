package com.shubham.kalkulator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




@Composable
fun kalkulator(
    state:kalstate,
    modifier:Modifier=Modifier,
    buttonSpacing:Dp=8.dp,
    onAction:(kalact)-> Unit
){
    Box(modifier = modifier){
        Column (
            modifier= Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement=Arrangement.spacedBy(buttonSpacing)

        ){
            Text(
                text = state.number1 + (state.operation ?:"")+state.number2,
                textAlign = TextAlign.End,
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                    fontSize = 80.sp,
                color= Color.White,
                maxLines = 2
            )
            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement=Arrangement.spacedBy(buttonSpacing)
            ){
                kalbutton(
                    symbol = "AC",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(kalact.Delete)
                    }
                )
                kalbutton(
                    symbol = "Del",
                    mofifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Clear)
                    }
                )
                kalbutton(
                    symbol = "/",
                    mofifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Operation(kalope.Div))

                    }
                )
            }
            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement=Arrangement.spacedBy(buttonSpacing)
            ){
                kalbutton(
                    symbol = "7",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(7))
                    }
                )
                kalbutton(
                    symbol = "8",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(8))
                    }
                )
                kalbutton(
                    symbol = "9",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(9))
                    }
                )
                kalbutton(
                    symbol = "*",
                    mofifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Operation(kalope.Mul))
                    }


                )
            }
            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement=Arrangement.spacedBy(buttonSpacing)
            ){
                kalbutton(
                    symbol = "4",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(4))
                    }
                )
                kalbutton(
                    symbol = "5",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(5))
                    }
                )
                kalbutton(
                    symbol = "6",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(6))
                    }
                )
                kalbutton(
                    symbol = "-",
                    mofifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Operation(kalope.Sub))
                    }
                )
            }
            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement=Arrangement.spacedBy(buttonSpacing)
            ){
                kalbutton(
                    symbol = "1",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(1))
                    }
                )
                kalbutton(
                    symbol = "2",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(2))
                    }
                )
                kalbutton(
                    symbol = "3",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(3))
                    }
                )
                kalbutton(
                    symbol = "+",
                    mofifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Operation(kalope.Add))
                    }
                )
            }
            Row (
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement=Arrangement.spacedBy(buttonSpacing)
            ){
                kalbutton(
                    symbol = "0",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Number(0))
                    }
                )
                kalbutton(
                    symbol = ".",
                    mofifier = Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Decimal)
                    }
                )
                kalbutton(
                    symbol = "=",
                    mofifier = Modifier
                        .background(Color.Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(kalact.Calculate)
                    }


                )
            }

        }

    }
}