/*1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.*/
package Class

fun main() {

    try {
            println("Digite o nome do cliente: ")
            val nome = readln()

            println("Digite o endereço do cliente: ")
            val endereco = readln()


            println("Digite o telefone do cliente: ")
            val telefone = readln()

            val cliente = Cliente(nome, endereco, telefone)

            while (true) {
                println()
                print("Escolha uma opção para continuar")
                println()
                println("1 - Adicionar Produto")
                println("2 - Remover Produto")
                println("3 - Atualizar Produto")
                println("4 - Exibir Produtos")
                println("5 - Sair")
                println()
                println("Opção: ")
                when (readln()) {
                    "1" -> {
                        println("Digite um produto: ")
                        val product = readln()
                        cliente.addproduct(product)
                    }

                    "2" -> cliente.removeproduct()
                    "3" -> cliente.updateproduct()
                    "4" -> cliente.getproduct()
                    "5" -> break
                    else -> println("Opção Inválida")
                }
            }
    } catch (e: Exception) {
        println(e.message)
    }
}