fun menu() { // menu inicial
    println("______________________________")
    println("Esse é o controle de Estoque")
    println("______________________________")
    println("Digite 1 - Adicionar um novo item")
    println("Digite 2 - Atualizar um item")
    println("Digite 3 - Listar todos os itens")
    println("Digite 4 - Remover um item")
    println("Digite 5 - Sair")
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
    val nomeItem = readLine()!!.uppercase()

    if (itens.contains(nomeItem)) {

        println("deseja realmente remover $nomeItem? [S/s] ou [N/n]")
        val yesOrNot = readLine()!!

        if (yesOrNot.compareTo("s", true) == 0) { // Confirma a remoçao
            itens.remove(nomeItem)
            println("O item foi removido com sucesso")
            println("Aperte Enter para Continuar")
            readLine()
        } else {
            println("item não foi removido")
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
    if (itens.isNotEmpty()) {
        println("_________________________________")
        println("Todos os itens abaixo: ")
        itens.forEach {
            println(it)
        }
        println("_________________________________")
        println("Aperte Enter para Continuar")
        readLine()
    } else {
        println("Lista esta vazia")
        println("Aperte Enter para Continuar")
        readLine()
    }
}

fun atualizar(itens: MutableList<String>) { // funçao de atualizar
    println("Digite o nome do itens que será atualizazdo")
    val nomeItem = readLine()!!.uppercase()
    println("Digite o nome novo item")
    val novoItem = readLine()!!.uppercase()

    if (itens.contains(nomeItem) && novoItem.isNotEmpty()) { // valida o item dentro da lista

        println("deseja realmente atualizar $nomeItem para $novoItem? [S/s] ou [N/n]")
        val yesOrNot = readLine()!!

        if (yesOrNot.compareTo("s", true) == 0) { // Confirma a atualizaçao
            val index = itens.indexOf(nomeItem)
            itens[index] = novoItem
            println("O item foi atualizado com sucesso")
            println("Aperte Enter para Continuar")
            readLine()
        } else {
            println("item não foi atualizado")
            println("Aperte Enter para Continuar")
            readLine()
        }
    } else {
        println("item não identidicado")
        println("Aperte Enter para Continuar")
        readLine()
    }
}

fun adicionar(itens: MutableList<String>) { // funçaode adicionar
    println("Digite o nome do itens que será adicionado")
    val nomeItem = readLine()!!.uppercase()
    itens.add(nomeItem)
    println("O item de nome $nomeItem foi adicionado com sucesso")
    println("Aperte Enter para Continuar")
    readLine()
}
