import animais.Cachorro
import animais.Cavalo
import animais.Preguica
import interfaceAnimais.IAnimais

fun main() {

    val listaDeAnimais = mutableListOf<IAnimais>()

    val cavalo = Cavalo("Pé de Pano", 15)
    val cachorro = Cachorro("Caramelo", 8)
    val preguica = Preguica("Sid", 32)

    listaDeAnimais.add(cavalo)
    listaDeAnimais.add(cachorro)
    listaDeAnimais.add(preguica)

    listaDeAnimais.forEach {
        println("\n$it")
        println(it.sons())
        println(it.acao())
    }

}