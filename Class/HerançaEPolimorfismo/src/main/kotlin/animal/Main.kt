package animal

/*Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o método que emite
o som de cada um de forma polimórfica, isto é, independente do tipo de animal.*/

fun main() {
    val dog = Cachorro("Jemeremias", 11)
    println("Cachorro")
    println("Nome: ${dog.nome}")
    println("Idade: ${dog.idade} anos")
    dog.som()
    dog.move()
    println()

    println("Cavalo")
    val horse = Cavalo("Pé de Pano", 3)
    println("Nome: ${horse.nome}")
    println("Idade: ${horse.idade} anos")
    horse.som()
    horse.move()
    println()

    println("Preguiça")
    val sloth = Preguiça("Varoline", 46)
    println("Nome: ${sloth.nome}")
    println("Idade: ${sloth.idade} anos")
    sloth.som()
    sloth.move()
}