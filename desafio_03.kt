fun main(){
    println("Digite o comprimento do primeiro segmento de reta")
    val linha1 = readln().toInt()
    println("Digite o comprimento do segundo segmento de reta")
    val linha2 = readln().toInt()
    println("Digite o comprimento do terceiro segmento de reta")
    val linha3 = readln().toInt()

    if((linha1 < linha2 + linha3) and (linha2 < linha1 + linha3) and (linha3 < linha1 + linha2)){
        println("É possivel formar um triangulo com esses segmentos de reta")
    }else{
        println("Não é possivel formar um triangulo")
    }
    if((linha1 == linha2) and (linha2 == linha3)){
        println("O triangulo sera um equilatero")
    }
    if ((linha1 == linha2) or (linha1 == linha3) or (linha2 == linha3)){
        println("O triangulo sera um isoceles")
    }
    if ((linha1 != linha2) and (linha1 != linha3) and (linha2 != linha3)){
        println("O triangulo sera um escaleno")
    }
}