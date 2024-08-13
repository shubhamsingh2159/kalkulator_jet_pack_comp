package com.shubham.kalkulator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class kalviewmodel:ViewModel() {
    var state by mutableStateOf(kalstate())
        private set
    fun onAction(action:kalact)
    {
        when(action)
        {
            is kalact.Number->enterNumber(action.number)
            is kalact.Decimal->enterDecimal()
            is kalact.Clear->state=kalstate()
            is kalact.Operation->enterOperation(action.operation)
            is kalact.Calculate->performCalculation()
            is kalact.Delete->performDelete()
        }
    }

    private fun performDelete() {
        when{
            state.number2.isNotBlank()->state=state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operation!=null->state=state.copy(
                operation = null
            )
            state.number1.isNotBlank()->state=state.copy(
                number1 = state.number1.dropLast(1)
            )
        }

    }

    private fun performCalculation() {
        val number1=state.number1.toDoubleOrNull()
        val number2=state.number2.toDoubleOrNull()
        if(number1 !=null && number2 !=null){


        val result=when(state.operation)
        {
            is kalope.Add->number1+number2
            is kalope.Sub->number1-number2
            is kalope.Mul->number1*number2
            is kalope.Div->number1/number2
        null->return
        }
            state=state.copy(
                number1=result.toString().take(15),
                number2="",
                operation = null
            )
        }
    }

    private fun enterOperation(operation: kalope) {
        if(state.number1.isNotBlank())
        {
            state=state.copy(operation=operation)
        }

    }

    private fun enterDecimal() {
        if(state.operation==null&&!state.number1.contains(".")
            && state.number1.isNotBlank()
            )
        {
            state=state.copy(
                number1 = state.number1 + "."
            )
            return
        }
        if(!state.number2.contains(".")
            && state.number2.isNotBlank()
        )
        {
            state=state.copy(
                number2 = state.number2 + "."
            )
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operation==null)
        {
            if(state.number1.length>=MAX_NUM_LENGTH){
                return
            }
            state=state.copy(number1 = state.number1+number
            )
            return
        }
        if (state.number2.length>= MAX_NUM_LENGTH)
        {
            return
        }
        state=state.copy(
            number2 = state.number2+number
        )

    }
    companion object{
        private  const val MAX_NUM_LENGTH=8
    }


}


