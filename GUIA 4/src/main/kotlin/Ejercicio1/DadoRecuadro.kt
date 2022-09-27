package Ejercicio1

class DadoRecuadro {

    var x1 = Dado().x;

    fun tirar()
    {
        println("El numero generado random es: $x1")
        for (i in 1..x1 ) {

            print("* ")
        }
    }

}