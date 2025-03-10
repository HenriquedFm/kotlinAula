fun main(){
    println("Digite o preço do produto: ")
    var preco: Double = readLine()!!.toDouble()
    var promocao=  preco * 0.05
    var vl=  preco - promocao
     println("O valor do produto é: $preco , e o valor com um desconto de 5% é de $vl")
}