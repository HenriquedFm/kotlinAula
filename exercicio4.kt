fun main(){
    println("Digite os numeros")
    var n1 = readLine()!!.toDouble()
    var n2 = readLine()!!.toDouble()

    var soma = (n1 + n2)/2.toDouble()
    println("A soma dos números $n1 + $n2 é $soma")
}