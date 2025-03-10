fun main(){
    println("Digite o numero de dias que você trabalha; ")
    var dias: Int = readLine()!!.toInt()
    var horasT = 25 * 8
    var sal = horasT * dias
    println("O seu salrio é de $sal")
}