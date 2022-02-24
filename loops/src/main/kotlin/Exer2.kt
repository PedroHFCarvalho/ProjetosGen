fun main(args: Array<String>) {
    var num = IntArray(10)
    var impar = 0
    var par = 0

    for (i in 0..9) {

        println("Digite o ${i + 1}° numero")
        num[i] = readLine()!!.toInt()
        if (num[i] % 2 == 0) {
            par++
        } else {
            impar++
        }

    }
    println("foram digitados $par numero pares e $impar numeros impares")

}