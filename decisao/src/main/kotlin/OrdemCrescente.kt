fun main() {

    println("Digite o primeiro numero")
    var num1 = readLine()!!.toInt()
    println("Digite o segundo numero")
    var num2 = readLine()!!.toInt()
    println("Digite o terceiro numero")
    var num3 = readLine()!!.toInt()

    var maior = num1
    var meio = num1
    var menor = num1

    /////////////// Identificando Numero do Maior
    if (maior <= num2 ) {
        maior = num2
    }
    if (maior <= num3) {
        maior = num3
    }
    /////////////// Identificando Numero do Menor
    if (menor >= num2) {
        menor = num2
    }
    if (menor >= num3) {
        menor = num3
    }
    /////////////// Identificando Numero do Meio
    if (maior > num1) {
        if (menor < num1) {
            meio = num1
        }
    }
    if (maior > num2) {
        if (menor < num2) {
            meio = num2
        }
    }
    if (maior > num3) {
        if (menor < num3) {
            meio = num3
        }
    }

    //////////// Imprimindo
    println("$maior, $meio, $menor")


}