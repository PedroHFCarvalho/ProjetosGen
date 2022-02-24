fun main() {

    println("Digite o primeiro numero")
    var num1 = readLine()!!.toInt()
    println("Digite o segundo numero")
    var num2 = readLine()!!.toInt()
    println("Digite o terceiro numero")
    var num3 = readLine()!!.toInt()

    var maior = num1

    if (maior <= num2) {
        maior = num2
    }

    if (maior <= num3) {
        maior = num3
    }

    println(maior)
}