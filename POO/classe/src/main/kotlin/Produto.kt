class Produto(var cod: String, var nome: String, var valor: Double) {

    fun aumentarvalor5() {
        println(toString())
        var desconto = valor
        desconto *= 0.005
        valor -= desconto
        println("O valor do produto foi alterado para $valor")
    }

    fun diminuirValor() {
        println(toString())
        var desconto = valor
        desconto *= 0.005
        valor += desconto
        println("O valor do produto foi alterado para $valor")
    }

    override fun toString(): String {
        return "\nCodigo do Produto: $cod\n" +
                "Nome do Produto: $nome\n"

    }
}