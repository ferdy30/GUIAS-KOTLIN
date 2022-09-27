package Ejercicio3

class Empleado2 (var Empleado: String, var sueldo: Double) {


    fun imprimir() {
        println("Empleado: $Empleado y tiene un sueldo de $sueldo")
    }

}
fun main() {
    val personas: MutableList<Empleado2>
    personas = mutableListOf(
        Empleado2("Juan", 900.99),
        Empleado2("Ana", 800.21),
        Empleado2("Marcos", 1200.00)


    )
   val cant = 900.99+800.21+1200.00

    println("Listado de todas personas")
    personas.forEach { it.imprimir() }
    println("La suma del sueldo es de $cant")
    println("                                          ")
    personas.add(Empleado2("Alex", 700.00),)
    println("                                          ")
    println("Listado despues de haber agregado la tercera persona")
    println("Listado de todas personas")
    personas.forEach { it.imprimir() }
    val cant1 = 900.99+800.21+1200.00+700.00
    println("La suma del sueldo es de $cant1")
}