fun main(args: Array<String>) {
    var num1 = 0
    var soma = 0

    do {
        println("Digite um numero")
        num1 = readLine()!!.toInt()
        soma += num1
    } while (num1 != 0)

    println("a soma de todos os numero digitados é $soma")
}