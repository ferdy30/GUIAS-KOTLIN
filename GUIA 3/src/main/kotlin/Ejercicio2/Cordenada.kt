package Ejercicio2

class Cordenada {
    var x = 0
    var y = 0

     fun cargar(){

         println("Ingrese el valor de x")
          x = readln().toInt()

         println("Ingrese el valor de y")
         y = readln().toInt()

     }
    fun validar(){
        if (x >0 && y >0 ){
            println("Primer cuadrante")
        }else if(x <0 && y > 0){
            println("Segundo cuadrante")
        }else if(x <0 && y <0 )
        {
            println("Tercer cuadrante")
        }else if(x >0 && y<0){
            println("Cuarto cuadrante")
        }else{
           println(" Dato invalido, ingrese nuevamente")
            this.validar()

        }

            }fun operacion(){
                for (i in 1..5){
                    this.cargar()
                    this.validar()
        }
    }


}