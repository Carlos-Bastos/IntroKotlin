package animal

class Preguiça(nome: String, idade: Int) : Animal(nome, idade) {
    override fun som() {
        println("Emitindo Sons de alta-frequência pelas narinas")
    }

    override fun move() {
        println("Está Subindo árvore")
    }
}