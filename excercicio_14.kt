fun main(){
    println("Digite o salario do funcionario: ")
    var sal: Double = readLine()!!.toDouble()
    var aumento=  sal * 0.15
    var vl=  sal + aumento
    println("O salario do funcionario é: $sal , e o salario com mais 15% de aumento é: $vl")
}
