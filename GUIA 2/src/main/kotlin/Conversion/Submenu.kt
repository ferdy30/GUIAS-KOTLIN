package Conversion

import kotlin.system.exitProcess

class Submenu {


    fun submenu(){
        println("-----------------------------")
        println("          SUBMENU             ")
        println("Ingrese una de las siguientes opciones")
        println("1-Positivo o negativo")
        println("2-area de un triangulo")
        println("3-fin submenu")
        val dato = readln().toInt()

        when(dato){
            1->{
                println("Ingreso la opcion de positivo o negativo")
                println("Ingrese un numero")
                val num = readln().toFloat()
                if (num >0){
                    println("el numero es positivo")
                }else{
                    println("el numero es negativo")
                }
            }
            2->{
                println("Ingreso en la opcion de area de un triangulo")
                println("ingrese la altura")
                var a = readln().toInt()
                println("ingrese lado base")
                var b = readln().toInt()

                var respuesta = (a*b)/2
                println("el area de un triangulo es igual a $respuesta")
            }3->{
            exitProcess(0)
            }else ->{
              println("opcion no valida, ingrese de nuevo")
              this.submenu()
        }
        }
    }
}