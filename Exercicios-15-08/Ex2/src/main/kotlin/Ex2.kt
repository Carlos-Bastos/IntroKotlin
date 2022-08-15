/* 2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele
 */

fun main() {
    print("Digite o diâmetro do circulo em cm: ")
    val d = readln().toDouble()
    val r = d / 2 //raio
    val pi = 3.14
    val area = pi * (r * r) //r.pow()
    println("A área do círculo é: ${area}cm²") // ${"%.2f".format(area)}
    println("o perímetro do círculo é: ${pi*d}cm") // ${"%.2f".format(pi*d)}

}