package Fechas

class Fechas {
    fun fechas(){
        println("Ingrese los datos de manera que no se permiten mayusculas")
        println("Ingrese el dia")
        val dia = readln().toString()
        println("Ingrese el mes")
        val mes = readln().toString()
        println("Ingrese el año")
        val año = readln().toString()


        when (mes){
            "enero" ->{
                  print("$dia,01,$año")
            }
            "febrero" ->{
                print("$dia,02,$año")
            }
            "marzo" ->{
                print("$dia,03,$año")
            }
            "abril" ->{
                print("$dia,04,$año")
            }
            "mayo" ->{
                print("$dia,05,$año")
            }
            "junio" ->{
                print("$dia,06,$año")
            }
            "julio" ->{
                print("$dia,07,$año")
            }
            "agosto" ->{
                print("$dia,08,$año")
            }
            "septiembre" ->{
                print("$dia,09,$año")
            }
            "octubre" ->{
                print("$dia,10,$año")
            }
            "noviembre" ->{
                print("$dia,11,$año")
            }
            "diciembre" ->{
                print("$dia,12,$año")
            }else ->{
                print("dato invalido, revise si todo esta en minusula y bien escrito")
            this.fechas()
            }
        }

    }
}