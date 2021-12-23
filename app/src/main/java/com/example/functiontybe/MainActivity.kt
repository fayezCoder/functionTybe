package com.example.functiontybe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.util.function.*

class MainActivity : AppCompatActivity() {

   private val name ="fayez"
    private val number = 100.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //  countNum()
     //  printChar()
      // compareNum()
      //  sum()
      //  numbers(10,5)
      //  multiSum(1,2,3,4,5)
        name.printThird()
        number.plusTen()
    }
private fun countNum(){

    val num1 = 10
    val num2 = 8
    val result = num1 + num2
   Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
    }
    private fun printChar(){

        val name = "fayez"
        Toast.makeText(this, name[0].toString(), Toast.LENGTH_SHORT).show()
    }
    private fun compareNum(){

        val num1 =15
        val num2 = 10
        if (num1 > num2){
            Toast.makeText(this,"num1 is bigger than num2",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"num2 is bigger than num 1",Toast.LENGTH_SHORT).show()
        }
    }
    private fun sum(){
        val num1 =5
        val num2=5
        val result=num1+num2
        Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
    }
    private fun numbers(nun1:Int,num2:Int){
        var result = nun1 * num2
        Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
    }
    private fun multiSum(vararg number:Int){
        var sum = 0
        for (num in number){

            sum = sum +num
        }
        Toast.makeText(this,sum.toString(),Toast.LENGTH_SHORT).show()

    }



    //extension fun example
    //          class      fun names
    private fun String.printThird(){

        val thirdChar = this[3]
        Toast.makeText(this@MainActivity,thirdChar.toString(),Toast.LENGTH_SHORT).show()
    }

    private fun Double.plusTen(){
         // result = 110.0
        val result = this +10.0
        Toast.makeText(this@MainActivity,result.toString(),Toast.LENGTH_SHORT).show()
    }
}
