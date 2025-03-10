fun main(){
    println("Digite um número real")
    var num:Double = readLine()!!.toDouble()

    var dobro = num * 2
    var terca: Double = num / 3

    var tercaF = String.format("%.2f", terca).toString()

    println("O dobro do $num é $dobro. " + "A terça parte parte do $num é $tercaF")
}