/* 6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

fun main() {
    var cont = 0
    var num: Int
    var soma = 0

    do {
        println("Digite qualquer número: ")
        num = readln().toInt()

        if (num % 3 == 0 && num != 0) {
            cont++
            soma += num
        }
    }while (num !== 0)
    println("A média de todos os números digitados, múltiplos de 3 é: ${soma / cont}")
}
