import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    println("Digite o valor de A: ")
    var a: Double = readLine()!!.toDouble()
    println("Digite o valor de B: ")
    var b: Double = readLine()!!.toDouble()
    println("Digite o valor de C: ")
    var c: Double = readLine()!!.toDouble()

    var delta = (b.pow(2)) - (4 * a * c)

    if (delta < 0) {
        println("A equação não possui raízes reais.")
    } else {
        var x1 = (-b + sqrt(delta)) / (2 * a)
        var x2 = (-b - sqrt(delta)) / (2 * a)
        println("O resultado da equação de segundo grau é: X1: $x1 , e o X2: $x2")
    }
}
