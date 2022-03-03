fun main() {
    val listItems = mutableListOf<String>()
    println("Bem-Vindo")
    do {
        menu()
        println("Digite o numero da operação")

        val menu = readLine()!!.toInt()
        operacao(menu, listItems)

    } while (menu != 5) // repetiçao do programa
}