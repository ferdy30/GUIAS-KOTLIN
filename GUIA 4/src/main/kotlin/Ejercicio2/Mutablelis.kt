package Ejercicio2
import kotlin.random.Random
class Mutablelis {

    val lista: MutableList<Int> = MutableList(100) {
        Random.nextInt(0, 20)
    }

    fun cargar(){
        println("Lista completa")
        println(lista)
        val cant1 = lista.count { it in 1..4 }
        val cant4 = lista.count(){ it in 5..8}
        val cant5 = lista.count(){ it in  10..13}
        val list = lista.count(){it == 20}

if(list == 0){
    println("Cantidad de elementos entre el valor 1 y 4 : $cant1")
    println("Cantidad de elementos entre el valor 5 y 8 : $cant4")
    println("Cantidad de elementos entre el valor 10 y 13 : $cant5")


   }
}}