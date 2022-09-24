package Perimetro

import kotlin.math.sqrt
import kotlin.system.exitProcess

class Menu {



    fun menu(){
        println("-------------------------------------")
        println("Encontrar el perimetro de un triangulo")
        println("--------------------------------------")
        println("Ingrese una de las siguientes opciones:")
        println("1-Equilatero")
        println("2-Isoceles")
        println("3-Escaleno")
        println("4-salir")
        val num = readln().toInt()

        when (num) {
            1 -> {
                println("Ingreso a la opcion Equilatero")
                println("ingrese lado 1")
                val lado1 = readln().toInt()

                var multiplicacion = 3 *lado1
                println("El perimetro del equilatero es: $multiplicacion")

            }
            2 -> {
                println("Ingreso a la opcion de Isoceles")
                println("ingrese lado 1")
                val lado1 = readln().toInt()
                println("Ingrese la base")
                val base = readln().toInt()
                var perimetro = (2*lado1)+base
                println("El perimetro del Isoceles es: $perimetro")

            }
            3 -> {
                println("Ingreso a la opcion de Escaleno")
                println("ingrese lado 1")
                val lado1 = readln().toDouble()
                println("Ingrese lado 2")
                val lado2 = readln().toDouble()

                println("Ingrese la raiz cuadrada")
                val raiz = readln().toInt()

               val Perimetro = lado1+lado2+(sqrt((lado1*lado1)+(lado2*lado2)))
               println("El perimetro de un escaleno es $Perimetro")

             }
            4 -> {
                println("Feliz dia")
                exitProcess(0)
            }

            else -> {
               println( "dato invalido!, favor ingresar nueva mente")
                this.menu()
            }

        }

    }
}


