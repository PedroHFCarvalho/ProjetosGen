class Cliente(private var nome: String) {

    private var endereco = ""
    private var telefone = ""
    private var listaDeCompras = mutableListOf<String>()


    constructor(nome: String, endereco: String) : this(nome) {
        this.nome = nome
        this.endereco = endereco

    }

    constructor(nome: String, endereco: String, telefone: String) : this(nome) {
        this.nome = nome
        this.endereco = endereco
        this.telefone = telefone

    }

    init {
        if (nome.isEmpty()) {
            throw Exception("Classe nao iniciada corretamente")
        }
    }

    fun operacao(opera: Int) { // identifica operaçoes

        when (opera) {
            1 -> {
                addLista()
                println("Aperte ENTER para Continuar")
                readLine()
            } // Chama funçao de adicionar
            2 -> {
                listLista()
                println("Aperte ENTER para Continuar")
                readLine()
            } // Chama funçao de listar
            3 -> {
                removeLista()
                println("Aperte ENTER para Continuar")
                readLine()
            } // Chama funçao de remover
            4 -> {
                println(toString())
                println("Aperte ENTER para Continuar")
                readLine()
            }   // chama funçao de visualizar dados pessoais
            5 -> {
                println("O programa foi finalizado")
            } // msg de programa finalizado
            else -> { // msg de erro
                println("Nao foi possivel identificar a operaçao")
                println("Aperte ENTER para Continuar")
                readLine()
            }
        }
    }


    private fun addLista() {
        println("Digite o nome do itens que será adicionado")
        val nomeItem = readLine()!!.uppercase()
        listaDeCompras.add(nomeItem)
        println("O item de nome $nomeItem foi adicionado com sucesso")

    }

    private fun removeLista() {

        println("Digite o nome do itens que será Removido")
        val nomeItem = readLine()!!.uppercase()

        if (listaDeCompras.contains(nomeItem)) {

            println("deseja realmente remover $nomeItem? [S/s] ou [N/n]")
            val yesOrNot = readLine()!!

            if (yesOrNot.compareTo("s", true) == 0) { // Confirma a remoçao
                listaDeCompras.remove(nomeItem)
                println("O item foi removido com sucesso")
            } else {
                println("item não foi removido")
            }
        } else {
            println("item não identidicado")
        }

    }

    private fun listLista() {

        if (listaDeCompras.isNotEmpty()) {
            println("_________________________________")
            println("Todos os itens abaixo: ")
            listaDeCompras.forEach {
                println(it)
            }
            println("_________________________________")
        } else {
            println("Lista esta vazia")
        }

    }

    fun getNome(): String {
        return nome
    }

    fun getEndereco(): String {
        return endereco
    }

    fun getTelefone(): String {
        return telefone
    }

    fun setEndereco(endereco: String) {
        if (endereco.isNotEmpty()) {
            this.endereco = endereco
        } else {
            throw Exception("Endereço incorreto")
        }
    }

    fun setTelefone(telefone: String) {
        if (telefone.isNotEmpty()) {
            this.telefone = telefone
        } else {
            throw Exception("Telefone Incorreto")
        }

    }

    override fun toString(): String {
        return "\nNome: ${getNome()}\n" +
                "Endereco: ${getEndereco()}\n" +
                "Telefone: ${getTelefone()}\n"
    }
}