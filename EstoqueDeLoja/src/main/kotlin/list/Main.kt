/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

fun main() {

    while (true) {
        print("Escolha uma opção para continuar")
        println()
        println("1 - Adicionar Produtos")
        println("2 - Remover Produtos")
        println("3 - Atualizar Produtos")
        println("4 - Exibir Produtos")
        println("5 - Sair")
        println()
        println("Opção: ")
        when (readln()) {
            "1" -> {
                println("Digite um produto: ")
                val product = readln()
                addproduct(product)
            }

            "2" -> removeproduct()
            "3" -> updateproduct()
            "4" -> getproduct()
            "5" -> break
            else -> println("Opção Inválida")
        }
    }
}