/*1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.
* */

fun main() {
    print("Digite a idade: ")
    val idade = readln().toInt()
    val ano = 2022
    if (idade <= 0)
        println("Idade inválida")
    else
        println("Ano de nascimento: ${ano - idade}")
}