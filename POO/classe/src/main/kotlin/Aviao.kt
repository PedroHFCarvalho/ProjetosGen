class Aviao (var cod: String, var porte: String, var empresaDona: String){

    fun decolar() {
        println(toString())
        println("O Aviao esta decolando")
    }

    fun pousar() {
        println(toString())
        println("O Aviao esta pousando")
    }

    override fun toString(): String {
        return "\nCodigo do Aviao: $cod\n" +
                "Porte do Aviao: $porte\n" +
                "Empresa Dona: $empresaDona"

    }



}