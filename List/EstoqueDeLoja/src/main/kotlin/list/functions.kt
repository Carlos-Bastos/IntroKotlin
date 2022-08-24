val stock = mutableListOf<String>()

fun addproduct(product: String) {
    if (product != "") {
        stock.add(product)
        println("$product adicionado com sucesso!")
        println()
    } else {
        println("Valor Inválido")
        println()
    }
}


fun removeproduct() {
    while (true) {
        println("Agora digite o produto a ser excluído da lista ou digite 1 para retornar ao menu principal: ")
        val product = readln()

        if (stock.contains(product)) {
            stock.remove(product)
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

    if (stock.contains(product)) {
        val posicao = stock.indexOf(product)
        println("Digite o novo nome do produto: ")
        stock[posicao] = readln()
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
    println(stock)
    println()
}