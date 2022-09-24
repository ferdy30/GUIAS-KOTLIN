package Multiplo

class Multiplos {
     fun multiplos(){
         println("En este codigo encontraremos si el primer numero es multiplo del segundo")

         println("ingrese un numero:   ")
         var num1 = readLine()!!.toInt()
         println("ingrese el segundo numero")
         var num2 = readLine()!!.toInt()

         if(num1 % num2 ==0){
             println("El numero $num1 es multiplo de $num2" )
         }else  println("El numero no es $num1 es multiplo de $num2" )
     }
}