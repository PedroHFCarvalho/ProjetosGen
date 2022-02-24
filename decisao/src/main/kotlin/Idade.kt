fun main() {

    println("digite sua idade")
    var numes = readLine()!!.toInt()

    when (numes) {

        in 10..14 -> println("Infantil")
        in 15..17 -> println("Juvenil")
        in 18..25 -> println("Adulto")
        else -> println("Desculpe mais nao foio possivel identificar sua categoria")
    }
}
