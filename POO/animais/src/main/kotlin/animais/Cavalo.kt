package animais

import interfaceAnimais.IAnimais

class Cavalo(override var nome: String, override var idade: Int) : IAnimais {

    override fun sons(): String {
        return "O Cavalo está Relinchando"
    }

    override fun acao(): String {
        return "O Cavalo está correndo"
    }

    override fun toString(): String {
        return "Nome do Cavalo: $nome\n" +
                "Idade do Cavalo: $idade"
    }

}