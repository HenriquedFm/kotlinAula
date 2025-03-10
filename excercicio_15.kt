fun main(){
    println("Digite a quantidade de dias que você passou com o carro: ")
    var dias: Double = readLine()!!.toDouble()
    println("Digite a quantidade de Km que você rodou com o carro: ")
    var km: Double = readLine()!!.toDouble()
    var caldia = dias * 90
    var calkm = km * 0.2
    var total = caldia + calkm
    println("O valor total que você precisa pagar é de: $caldia + $calkm = $total")
}