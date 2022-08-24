package animal

class cavalo(nome: String, idade: Int) : Animal(nome, idade) {
    override fun som() {
        println("Relinchando")
    }

    override fun move() {
        println("Correndo")
    }
}