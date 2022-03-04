class Cliente(var nome: String, var carro: String, var tipoDoPlano: String) {

    fun entrada() {
        println(toString())
        println("Cliente entrou no Estacionamento")
    }

    fun saida() {
        println(toString())
        println("Cliente Saiu no Estacionamento")
    }

    override fun toString(): String {
        return "\nNome do Cliente: $nome\n" +
                "Carro: $carro\n" +
                "Tipo do plano: $tipoDoPlano"

    }


}