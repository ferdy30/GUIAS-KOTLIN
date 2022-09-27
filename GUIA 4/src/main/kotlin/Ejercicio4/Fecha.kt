package Ejercicio4

class Fecha {
    val inventario: MutableMap<Int, Fecha1> = mutableMapOf()

    fun cargar() {

        inventario[0] = Fecha1(19, 2, 2002)
        inventario[1] = Fecha1(1, 8, 2006)
        inventario[2] = Fecha1(19, 2, 2007)
        inventario[3] = Fecha1(20, 4, 2008)
        inventario[4] = Fecha1(26, 6, 2009)
        inventario[5] = Fecha1(23, 12, 2010)
        inventario[6] = Fecha1(14, 1, 2011)
        inventario[7] = Fecha1(26, 6, 2032)
        inventario[8] = Fecha1(11, 8, 2045)
    }
    fun listado() {
        println("listado de nuestros productos")
        for ((codigo, inventario) in inventario) {
            println("Codigo: $codigo  DIA: ${inventario.dia}  MES: ${inventario.mes}  AÑO: ${inventario.año}")
        }

    }
    fun venta() {

        print("Ingrese el codigo de la fecha a solicitar")
        val codigo = readLine()!!.toInt()

        if (codigo in inventario) {

            println("                                            ")
            println("dia: ${inventario[codigo]?.dia}  mes: ${inventario[codigo]?.mes}  año:${inventario[codigo]?.año}")
            println("       ")
}}}