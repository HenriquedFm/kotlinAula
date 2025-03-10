fun main(){
    println("Digite a quantidade de cigarros que você fuma por dia: ")
    var cigdia: Int = readLine()!!.toInt()
    println("Digite a quantidade de anos deis que você começou a fumar: ")
    var anoF: Int = readLine()!!.toInt()
    var anoDia = anoF * 365
    var cigtotal = cigdia * anoDia
    var min = cigtotal * 10
    val totalDias = min / 1440

    println("Você perdeu essa quantidade de dias: $totalDias dias fumando")
}