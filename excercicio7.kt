fun main(){
    println("Digite um número Intero:")
    var num :Int = readLine()!!.toInt()

    var ant = num - 1
    var suc = num + 1

    println("O Antcessor do número $num é: $ant. E o sucessor do número $num é $suc")
}