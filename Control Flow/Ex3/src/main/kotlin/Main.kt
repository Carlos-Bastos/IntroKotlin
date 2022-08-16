/* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */

fun main() {

    print("Digite sua idade: ")
    var idade = readln().toInt()

    when (idade) {
        in 0..14 -> println("Faixa etária: Infantil")
        in 15..17 -> println("Faixa etária: Juvenil")
        in 18..120 -> println("Faixa etária: Adulto")
        else -> println("Idade inválida")
    }
}