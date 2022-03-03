fun main() {
    val num = mutableListOf<String>()
    println("Bem-Vindo")
    do {
        menu()
        println("Digite o numero da operação")
        val valMenu = readLine()!!.toInt()
        operacao(valMenu, num)


    } while (valMenu != 5) // repetiçao do programa
}