package Ejercicio4


class Club(val nombre: String , antiguedad: Int) {
    var x = Socio()
    fun imprimir(){
        println(x.socio())
        println(x.respuesta())
    }
}