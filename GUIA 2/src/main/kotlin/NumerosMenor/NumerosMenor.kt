package NumerosMenor

class NumerosMenor {

    fun numerosmenor(){
    println("En este codigo encontraremos el numero menor")

    println("ingrese un numero:   ")
    var num1 = readLine()!!.toInt()
    println("ingrese el segundo numero")
    var num2 = readLine()!!.toInt()
    println("ingrese el tercer numero")
    var num3 = readLine()!!.toInt()



    if (num1 < num2 && num1 < num3) {
        println("El numero menor es: $num1")
    } else if (num2 < num1 && num2 < num3) {
        println("El numero menor es: $num2")

    } else
    {
        println("El numero menor es: $num3")
    }
}
}