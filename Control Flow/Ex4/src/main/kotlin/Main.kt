import kotlin.math.pow
import kotlin.math.sqrt

/*
4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

fun main(){

    print("Digite um número: ")
    var num = readln().toInt()

        if(num %2 == 0){
            println("Este número é par e sua raiz quadrada é: ${sqrt(num.toDouble())}")
        }else
            println("Este número é ímpar e seu resultado elevado ao quadrado é: ${num.toDouble().pow(2.0)}")
}