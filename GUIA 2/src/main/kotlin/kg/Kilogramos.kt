package kg

import kotlin.system.exitProcess

class Kilogramos {
    fun kilogramos(){
        println("------------------------------------------------")
        println("Convertir kilogramos a otras unidades de medida")
        println("                                                  ")
        println("Ingrese una de las siguientes opciones")
        println("1-Kg a libras")
        println("2-Kg a onzas")
        println("3-Kg a toneladas")
        println("4-salir")
        var datos = readln().toInt()

        when (datos){
            1->{
                println("Ingrese los kilogramos")
                var kg = readln().toInt()
                var libras = 2.2046
                var resultado = (kg*libras)/1
                println("El resultado en libras es de: $resultado")
            }
            2->{
                println("Ingrese los kilogramos")
                var kg = readln().toInt()
                var onzas = 35.274
                var resultado = (kg*onzas)/1
                println("El resultado en onzas es de: $resultado")
            }
            3->{
                println("Ingrese los kilogramos")
                var kg = readln().toInt()
                var tonelada = 0.001
                var resultado = (kg*tonelada)/1
                println("El resultado en tonelada es de: $resultado")
            }
            4->{
                  exitProcess(0)
            }
        }

    }
}