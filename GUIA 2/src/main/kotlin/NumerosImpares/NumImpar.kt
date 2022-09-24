package NumerosImpares

class NumImpar {
    fun numImpar(){
        println("En este codigo indicaremos numeros impares o pares")

        println("ingrese un numero:   ")
        var num1 = readLine()!!.toInt()
        println("ingrese el segundo numero")
        var num2 = readLine()!!.toInt()

        if (num1 %2 == 0){
            println("El numero $num1 es par")


        } else println("El numero $num1 es impar")

        if (num2 % 2 ==0) {
            println("El numero $num2 es par")

        } else println("El numero $num2 es impar")
    }
}