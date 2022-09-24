package Conversion

import kotlin.math.sqrt
import kotlin.system.exitProcess

class Conversion {

    val colones = ColonesAD()
    val kms = CelsiusAF()
    val millas = MillasAK()
    val seMenu = Submenu()



          fun conversion(){

              println("-------------------------------------")
              println("              CONVERSIONES             ")
              println("--------------------------------------")
              println("Ingrese una de las siguientes opciones:")
              println("1-Conversion de colones a dolares")
              println("2-Conversion de millas a kms")
              println("3-Conversion de grados Celsius a grados Fahrenheit")
              println("4-segundo menu")
              println("5-fin de menu")
              val num = readln().toInt()

              when (num) {
                  1 -> {
                      println("Conversion de colones a dolares")
                       this.colones.conversionColones()
                  }
                  2 -> {
                      println("Conversion de millas a kms")
                      this.millas.millas()

                  }
                  3 -> {
                      println("Conversion de grados Celsius a grados Fahrenheit")
                      this.kms.celsius()

                  }
                  4 -> {
                      println("segundo menu")
                      this.seMenu.submenu()
                  }
                  5 -> {
                      println("Feliz dia")
                      exitProcess(0)
                  }

                  else -> {
                      println( "dato invalido!, favor ingresar nueva mente")
                      this.conversion()
                  }

              }

          }
}