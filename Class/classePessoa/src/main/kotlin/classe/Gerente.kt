package classe

class Gerente(
    var nome: String,
    var endereco: String,
    var telefone: String
) {
    val ListaDeCompras = mutableListOf<String>()


    fun addproduct(product: String) {
        if (product != "") {
            ListaDeCompras.add(product)
            println("$product adicionado com sucesso!")
            println()
        } else {
            println("Produto Inválido")
            println()
        }
    }


    fun removeproduct(product: String) {
        while (true) {
            /*println("Agora digite o produto a ser excluído da lista ou digite 1 para retornar ao menu principal: ")
            val product = readln()*/

            if (ListaDeCompras.contains(product)) {
                ListaDeCompras.remove(product)
                println("Produto $product excluído com sucesso")
                println()
                break
            } else if (product == "1") {
                return main()
            } else {
                println("O produto $product não existe na lista")
            }
        }
    }


    fun updateproduct() {
        println("Digite o nome do produto que deseja atualizar ou digite 1 para retornar ao menu principal:  ")
        val product = readln()

        if (ListaDeCompras.contains(product)) {
            val posicao = ListaDeCompras.indexOf(product)
            println("Digite o novo nome do produto: ")
            ListaDeCompras[posicao] = readln()
            println("Produto atualizado com sucesso!")
            println()
        } else if (product == "1") {
            return main()
        } else {
            println("O produto $product não existe na lista")
        }
    }


    fun getproduct() {
        println()
        println(ListaDeCompras)
        println()
    }
}
