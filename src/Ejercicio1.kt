

fun salarioI(punt: Int, salario: Float): Unit{
    var nivel = ""
    var salario_final: Float = 0f
    when (punt){
        in 0..3 ->{
            nivel="Inaceptable"
            salario_final=salario * (punt/10f)
        }
        in 4..6 ->{
            nivel="Aceptable"
            salario_final=salario * (punt/10f)
        }
        in 7.. 10 ->{
            nivel= "Meritorio"
            salario_final=salario *(punt/10f)
        }
    }
    println("El nivel de rendimineto del usuario es: $nivel")
    println("El salario final del usuario es: $salario_final")
}


fun main(){


    print("Ingrese la puntuaciòn del usuario: ")
    var punt = readln().toInt()
    print("Ingrese el salario del usuario: ")
    var salario = readln().toFloat()


    salarioI(punt, salario)
}
