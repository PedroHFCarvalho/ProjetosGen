fun main(args: Array<String>) {
    var sexo = 0
    var idade = 0
    var comport = 0

    var cont40Nrvo = 0
    var cont18Calm = 0
    var contOutCalm = 0
    var contHomAgres = 0
    var contMulNervo = 0
    var contCalm = 0
    var cont = 0

    while (cont <= 150) {

        println("Digite sua idade")
        idade = readLine()!!.toInt()

        println("Digite seu sexo")
        println("1 - Feminino")
        println("2 - Masculino")
        println("3 - Outro")
        sexo = readLine()!!.toInt()

        println("Digite seu comportamento")
        println("1 - Calmo")
        println("2 - Nervoso")
        println("3 - Agressivo")
        comport = readLine()!!.toInt()

        if (comport == 1){
            contCalm++
        }
        if (sexo == 1 && comport == 2){
            contMulNervo++
        }
        if (sexo == 2 && comport == 3){
            contHomAgres++
        }
        if (sexo == 3 && comport == 1){
            contOutCalm++
        }
        if (idade >= 40 && comport == 2){
            cont40Nrvo++
        }
        if (idade <= 18 && comport == 2){
            cont18Calm++
        }
        println("__________________________________")
        cont++
    }


    println("o número de pessoas calmas é $contCalm")
    println("o número de mulheres nervosas é $contMulNervo")
    println("o número de homens agressivos é $contHomAgres")
    println("o número de outros calmos é $contOutCalm")
    println("o número de pessoas nervosas com mais de 40 anos é $cont40Nrvo")
    println("o número de pessoas calmas com menos de 18 anos é $cont18Calm")



}