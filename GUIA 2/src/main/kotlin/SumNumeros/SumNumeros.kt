package SumNumeros

class SumNumeros {
    fun sumNumeros(){
        println("En este codigo indicaremos si el tercero es igual a la suma del primero y con el segundo.")

        println("ingrese un numero:   ")
        var num1 = readLine()!!.toInt()
        println("ingrese el segundo numero")
        var num2 = readLine()!!.toInt()
        println("ingrese el tercer numero")
        var num3 = readLine()!!.toInt()

        if(num1+num2 == num3){
            println("el tercer numero es igual a la suma del primero y el segundo")
        }else   println("el tercer numero no es igual a la suma del primero y el segundo")

    }
}