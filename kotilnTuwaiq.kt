package com.example.kotlintuw

fun main() {
    var number= arrayListOf<Double>(1.2 , 3.9 , 10.12 , 4.8 , 5.1)
    var sum=0.0
    for(index in 0 until number.size ) {
        sum += number[index]
    }
    var average=sum/number.size
    print("the Average is : $average")
}
