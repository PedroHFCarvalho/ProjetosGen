fun main(args: Array<String>) {
    var idade = 0
    var maiorIdade = 0
    var menorIdade = 0

    while (idade != -99) {

        println("Digite uma idade")
        idade = readLine()!!.toInt()

        if (idade in 0..21) {
            menorIdade++
        } else if(idade >= 50){
            maiorIdade++
        }

    }

    println("Tiveram $menorIdade com menos de 21 anos é $maiorIdade com mais de 50 anos")

}