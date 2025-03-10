fun main(){
    println("Digite a Distancia em metros:")
    var dis :Double = readLine()!!.toDouble()
    var cm = dis * 10
    var km = dis / 100

    println("A distancia de $dis metros em centímetros é $cm. E em kilometros é $km")
}