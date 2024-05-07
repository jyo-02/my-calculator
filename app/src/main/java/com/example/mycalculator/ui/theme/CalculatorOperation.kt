package com.example.mycalculator.ui.theme

sealed class CalculatorOperation(val symbol:String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiple: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")


}