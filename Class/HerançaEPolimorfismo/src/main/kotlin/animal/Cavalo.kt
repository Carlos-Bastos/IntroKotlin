package animal

class Cavalo(nome: String, idade: Int) : Animal(nome, idade) {
    override fun som() {
        println("Relinchando")
    }

    override fun move() {
        println(" Está Correndo")
    }
}