package animal

class cachorro(nome: String, idade: Int) : Animal(nome, idade) {
    override fun som() {
        println("Está Latindo")
    }

    override fun move() {
        println("Está Correndo")
    }
}