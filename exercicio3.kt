fun main(){
    println("Digite seu nome:")
    var nome = readLine()!!
    println("Digite seu salário:")
    var salario = readLine()!!.toDouble()
    var sal = String.format("%.2f",salario).toString()
    println("O Funcionário $nome tem um salário de R$ $sal em julho")
}