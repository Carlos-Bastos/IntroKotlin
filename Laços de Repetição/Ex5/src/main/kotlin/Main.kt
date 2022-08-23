/* 5- Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma
dos números digitados.(DO...WHILE)*/

fun main() {
    var cont = 0
    var num = 0

    do {
        println("Digite qualquer número: ")
         num = readln().toInt()
         cont+=num
    } while (num !== 0)
    println("A soma de todos os números digitados é: $cont")
}

