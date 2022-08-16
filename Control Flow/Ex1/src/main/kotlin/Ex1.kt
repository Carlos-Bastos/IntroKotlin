/* 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

fun main() {

    print("Digite um número: ")
    val a = readln().toInt()
    println("Digite um número: ")
    val b = readln().toInt()
    println("Digite um número: ")
    val c = readln().toInt()

        if (a > b && a > c){
            print("O maior número digitado foi: $a")
        }else if (b > a && b > c){
            print("O maior número digitado foi: $b")
        }else if (c > a && c > b){
            print("O maior número digitado foi: $c")
        }else
            print("Valor inválido")
}