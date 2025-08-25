import kotlin.random.Random


fun main(){
    var opcion: Int
    var intentos = 5
    val op_pc = Random.nextInt(0,31)

    do{
        print("INGRESE EL NUMERO CON EL QUE INTENTARÁ: ")
        opcion = readln().toInt()


        if(opcion > op_pc){
            println("El número a adivinar es menor... Sigue intentando")
            intentos--
            println("Le quedan: $intentos intentos..")
        }
        else if(opcion < op_pc){
            println("El numero a adivinar es mayor... Sigue intentando")
            intentos--
            println("Le quedan: $intentos intentos..")
        }
        else{
            println("FELICITACIONES GANÓ EL JUEGO")
            break
        }
        if (intentos==0){
            println("SE QUEDO SIN INTENTOS.... GAME OVER")
            println("El número era ${op_pc}")
        }
    } while (intentos > 0)


}
