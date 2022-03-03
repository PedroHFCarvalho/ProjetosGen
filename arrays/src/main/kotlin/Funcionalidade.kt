fun menu() { // menu inicial
    println("______________________________")
    println("Esse é o controle de Estoque")
    println("______________________________")
    println("Digite 1 - Para Adicionar um novo item")
    println("Digite 2 - Para Atualizar um item")
    println("Digite 3 - Para Listar todos os itens")
    println("Digite 4 - Para Remover um item")
    println("Digite 5 - Para Sair")
    println("______________________________")
}

fun operacao(opera: Int, itens: MutableList<String>) { // identifica operaçoes

    when (opera) {
        1 -> adicionar(itens) // Chama funçao de adicionar
        2 -> atualizar(itens) // Chama funçao de atualiozar
        3 -> listar(itens) // Chama funçao de listar
        4 -> remover(itens) // chama funçao ded remover
        5 -> println("O programa foi finalizado") // msg de programa finalizado
        else -> { // msg de erro
            println("Nao foi possivel identificar a operaçao")
            println("Aperte Enter para Continuar")
            readLine()
        }
    }
}

fun remover(itens: MutableList<String>) { // funçaode remover
    println("Digite o nome do itens que será Removido")
    var nomeItem = readLine()!!.uppercase()

    if (itens.contains(nomeItem)) {

        println("deseja realmente remover esse item? [S/s] ou [N/n]")
        var yesOrNot = readLine()!!

        if (yesOrNot.compareTo("s", true) == 0) { // Confirma a remoçao
            itens.remove(nomeItem)
            println("O item foi removido com sucesso")
            println("Aperte Enter para Continuar")
            readLine()
        }
    } else {
        println("item não identidicado")
        println("Aperte Enter para Continuar")
        readLine()
    }
}

fun listar(itens: MutableList<String>) { // funçao de listar
    println("_________________________________")
    println("Todos os itens abaixo: ")
    itens.forEach {
        println(it)
    }
    println("_________________________________")
    println("Aperte Enter para Continuar")
    readLine()
}

fun atualizar(itens: MutableList<String>) { // funçao de atualizar
    println("Digite o nome do itens que será atualizazdo")
    var nomeItem = readLine()!!.uppercase()
    println("Digite o nome novo item")
    var novoItem = readLine()!!.uppercase()

    if (itens.contains(nomeItem) && novoItem != null) { // valida o item dentro da lista
        var index = itens.indexOf(nomeItem)
        itens[index] = novoItem
        println("O item foi atualizado com sucesso")
        println("Aperte Enter para Continuar")
        readLine()

    } else {
        println("item não identidicado")
        println("Aperte Enter para Continuar")
        readLine()
    }
}

fun adicionar(itens: MutableList<String>) { // funçaode adicionar
    println("Digite o nome do itens que será adicionado")
    var nomeItem = readLine()!!.uppercase()
    itens.add(nomeItem)
    println("O item foi adicionado com sucesso")
    println("Aperte Enter para Continuar")
    readLine()

}
