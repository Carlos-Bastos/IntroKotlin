/* 2- Faça um programa que entre com três números e coloque em ordem crescente.
* */

fun main() {

    print("Digite um número: ")
    val A = readln().toInt()
    print("Digite outro número: ")
    val B = readln().toInt()
    print("Digite mais um número: ")
    val C = readln().toInt()

    if (A < B && A < C) {
        if (B < C)
            print("A ordem crescente dos números é: $A, $B e $C")
        else
            print("A ordem crescente dos números é: $A, $C e $B")
    }
    if (B < A && B < C) {
        if (A < C)
            print("A ordem crescente dos números é: $B, $A e $C")
        else
            print("A ordem crescente dos números é: $B, $C e $A")
    }
    if (C < A && C < B) {
        if (B < A)
            print("A ordem crescente dos números é: $C, $B e $A")
        else
            print("A ordem crescente dos números é: $C, $A e $B")
    }
}