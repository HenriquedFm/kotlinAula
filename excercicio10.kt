fun main(){
    println("Diga quanto tem em sua carteira em reais R$: ")
    var real :Double = readLine()!!.toDouble()
    var dolar = real * 5.79

    var dolarF = String.format("%.2f", dolar).toString()
    println("Você terá na sua carteira esta quantidade em dolares: $dolarF")
}