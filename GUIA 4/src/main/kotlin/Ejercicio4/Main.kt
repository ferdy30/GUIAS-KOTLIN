package Ejercicio4

import kotlin.system.exitProcess

fun main(){
    val x = Fecha()
    println("--------------------------------")
    println("           BIENVENIDO           ")
    println("--------------------------------")
    println("           INGRESE LA OPCION QUE DESEA           ")
    println("1-Carga de datos en la agenda")
    println("2-Listado de la agenda")
    println("3-Consulte fecha")
    println("4-salir")
    var dato = readln().toInt()
    when(dato){
        1->{
            println("Seleccionado opcion, cargar")
            x.cargar()
            x.listado()
            x.venta()
        }
        2->{
            println("Seleccionado opcion, listado")
            x.cargar()
            x.listado()
        }
        3->{
            println("Seleccionado opcion, Consulta")
            x.cargar()
            x.venta()
        }
        4->{
            println("feliz dia")
            exitProcess(0)
        }else->{
            println("opcion no valida")
           main()
        }
    }


}