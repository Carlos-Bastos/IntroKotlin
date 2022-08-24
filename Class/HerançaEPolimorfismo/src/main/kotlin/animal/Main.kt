package animal

/*Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o método que emite
o som de cada um de forma polimórfica, isto é, independente do tipo de animal.*/

fun main() {
    val dog = cachorro("Jemeremias", 11)
    println("Cachorro")
    val dognome = dog.nome
    println("Nome: ${dog.nome}")
    val dogidade = dog.idade
    println("Idade: ${dog.idade} anos")
    dog.som()
    dog.move()
    println()

    println("Cavalo")
    val horse = cavalo("Pé de Pano", 3)
        val horsenome = horse.nome
        println("Nome: ${horse.nome}")
        val horseidade = horse.idade
        println("Idade: ${horse.idade} anos")
        horse.som()
        horse.move()
        println()

println("Preguiça")
        val sloth = preguiça("Varoline", 46)
        val slothnome = sloth.nome
        println("Nome: ${sloth.nome}")
        val slothidade = sloth.idade
        println("Idade: ${sloth.idade} anos")
        sloth.som()
        sloth.move()
        println()
}