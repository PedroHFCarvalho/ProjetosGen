import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    println("digite um numero")
    var numes = readLine()!!.toInt()
    var result = 0.0

    if (numes % 2 == 0) {

        result = sqrt(numes.toDouble())
        // Coverte de forma explicita um numero int para Double (TOMAR CUIDADO COM CONVERSOES)
        // e faz raiz quadrada

        println("$numes é um par é sua raiz quadrada é ${"%.1f".format(result)}")

    } else {
        result = numes.toDouble().pow(2)
        // Coverte de forma explicita um numero int para Double (TOMAR CUIDADO COM CONVERSOES)
        // e eleva ele ao quadrado

        println("$numes é um impar seu resultado elevado ao quadrado é ${"%.1f".format(result)}")

    }
}