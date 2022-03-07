fun main(args: Array<String>) {
    /*
    Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos mais
    duas opções de construtores conforme sua percepção, com os atributos: nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
     Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
    */

    var cliente: Cliente
    var menu = 0

    while (true) {
        println("Digite seu nome: ")
        try {
            var nome = readLine()!!
            cliente = Cliente(nome)
            break
        } catch (e: Exception) {
            println(e.message)
        }
    }

    println("Deseja digitar seu endereço e telefone? [S/N]")
    var EnreAndTele = readLine()!!

    if (EnreAndTele.compareTo("s", true) == 0) {

        while (true) {
            println("digite o seu endereço: ")
            try {
                var endereco = readLine()!!
                cliente.setEndereco(endereco)
                break
            } catch (e: Exception) {
                println("Erro ao ler o endereço digite novamente ")
            }

        }
        while (true) {
            println("digite o seu telefone: ")
            try {
                var telefone = readLine()!!
                cliente.setTelefone(telefone)
                break
            } catch (e: Exception) {
                println("Erro ao ler o telefone digite novamente")
            }

        }
        println("Dados inseridos com sucesso")

    } else if (EnreAndTele.compareTo("n", true) == 0) {
        println("Apenas o nome foi inserido")
    } else {
        println("Identificador nao encontrado")
        println("Apenas o nome foi inserido")
    }

    do {

        println("______________________________")
        println("Bem-Vindo ${cliente.getNome()}")
        println("______________________________")
        println("Digite 1 - Adicionar um novo item")
        println("Digite 2 - Listar todos os itens")
        println("Digite 3 - Remover um item")
        println("Digite 4 - Visualizar Dados Pessoais")
        println("Digite 5 - Sair")
        println("______________________________")
        println("Digite o numero da operação")

        try {
            menu = readLine()!!.toInt()
            cliente.operacao(menu)
        } catch (e: Exception) {
            println("Identificador não reconhecido digite novamente aperte ENTER para digitar novamente")
            readLine()!!
        }

    } while (menu != 5) // repetiçao do programa

}
