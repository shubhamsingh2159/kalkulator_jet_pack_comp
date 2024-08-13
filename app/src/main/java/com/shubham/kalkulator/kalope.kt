package com.shubham.kalkulator

sealed class kalope(val symbol: String){
    object Add:kalope(symbol = "+")
    object Sub:kalope(symbol = "-")
    object Mul:kalope(symbol = "*")
    object Div:kalope(symbol = "/")
}
