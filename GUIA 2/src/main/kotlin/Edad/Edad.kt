package Edad

import java.text.SimpleDateFormat
import java.util.*

class Edad {
     fun edad(){


         println("Ingrese fecha de nacimiento, ejemplo: dd/mm/aaaa")
         var fechaNacimeinto = readln()
         var fechaDay : Date =SimpleDateFormat("dd/mm/yyyy").parse(fechaNacimeinto)
         var fechaActual =Date(System.currentTimeMillis())
         var diferencia = fechaActual.getTime()-fechaDay.getTime()
         var segundos = diferencia/1000
         var minutos = segundos/60
         var horas = minutos/60
         var dias = horas/24
         var años= dias/365

         if (años < 1 ) {
              println("usted es un bebe $años")
         } else{
             println("Su edad es de $años")
         }
     }
}