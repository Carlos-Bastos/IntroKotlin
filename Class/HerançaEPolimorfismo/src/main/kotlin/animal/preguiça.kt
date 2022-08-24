package animal

class preguiça(nome: String, idade: Int) : Animal(nome, idade) {
    override fun som() {
        println("Sons de alta-frequência pelas narinas")
    }

    override fun move() {
        println("Subindo árvore")
    }
}