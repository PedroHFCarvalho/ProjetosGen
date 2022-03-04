fun main(args: Array<String>) {

    val car1 = Carro()

    car1.cor = "Azul"
    car1.ano = 2016
    car1.marca = "Honda"
    car1.categoria = "SUV"
    car1.motor = 2.0
    car1.rodas = 4
    car1.modelo = "HR-V"


    println("Cor - ${car1.cor}")
    println("Ano - ${car1.ano}")
    println("Marca - ${car1.marca}")
    println("Categoria - ${car1.categoria}")
    println("Motor - ${car1.motor}")
    println("Rodas - ${car1.rodas}")
    println("Modelo - ${car1.modelo}")

}