package animal

/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos
e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as características
de forma que tudo o que for comum a todos os animais fique na classe Animal: */

abstract class Animal (
    val nome: String,
    val idade: Int
) {
    abstract fun som()

    abstract fun move()

}