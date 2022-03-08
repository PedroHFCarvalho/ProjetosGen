package animais

import interfaceAnimais.IAnimais

class Cachorro(override var nome: String, override var idade: Int) : IAnimais {

    override fun sons(): String {
        return "O Cachorro está Latindo"
    }

    override fun acao(): String {
        return "O Cachorro está Correndo"
    }

    override fun toString(): String {
        return "Nome do Cachorro: $nome\n" +
                "Idade do Cachorro: $idade"
    }

}