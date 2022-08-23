/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
        esta classe, em seguida crie um objeto cliente, defina as instancias deste
        objeto e apresente as informações deste objeto no console.*/

fun main() {

    println("Digite o nome do cliente: ")
    var nome = readln()

    println("Digite a idade do cliente: ")
    var idade = readln().toInt()

    println("Digite o sexo do cliente: ")
    var sexo = readln()

    println("Digite o email do cliente: ")
    var email = readln()

    var cliente = Cliente(
        nome, idade, sexo, email
    )
    while (true) {
        print("\nEscolha uma opção para continuar")
        println()
        println("1 - Adicionar Nome")
        println("2 - Adicionar Idade")
        println("3 - Adicionar Sexo")
        println("4 - Adicionar Email")
        println("5 - Mostrar Os Dados Atualizados")
        println()
        println("Opção: ")
        when (readln()) {
            "1" -> trocarNome()
            "2" -> trocarIdade()
            "3" -> trocarSexo()
            "4" -> trocarEmail()
            "5" -> show()
            "6" -> break
            else -> println("Opção Inválida")
        }
    }
}

