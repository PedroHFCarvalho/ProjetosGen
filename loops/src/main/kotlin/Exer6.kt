fun main(args: Array<String>) {
    var num1 = 0
    var soma = 0
    var cont = 0

    do {
        println("Digite um numero")
        num1 = readLine()!!.toInt()

        if (num1 % 3 == 0) {
            soma += num1
            cont++
        }

    } while (num1 != 0)

    var media = soma / cont

    println("a media de todos os numero multiplos de 3 digitados é $media")
}