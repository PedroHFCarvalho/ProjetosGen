package animais

import interfaceAnimais.IAnimais

class Preguica(override var nome: String, override var idade: Int) : IAnimais {

    override fun sons(): String {
        return "A Preguiça não está fazendo sons"
    }

    override fun acao(): String {
        return "A Preguiça está subindo uma arvore"
    }

    override fun toString(): String {
        return "Nome da Preguiça: $nome\n" +
                "Idade da Preguiça: $idade"
    }
}