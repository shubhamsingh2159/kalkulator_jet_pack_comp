package com.shubham.kalkulator

sealed class kalact{
    data class Number(val number: Int):kalact()
    object Clear:kalact()
    object Delete:kalact()
    object Decimal:kalact()
    object Calculate:kalact()
    data class Operation(val operation:kalope): kalact()

}
