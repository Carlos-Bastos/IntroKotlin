/* 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

fun main() {
    var contP = 0
    var contI = 0

    for (i in 1..10) {

        if (i %2 == 0) {
            contP++
        } else {
            contI++
        }
    }
    println("Quantidade de números pares: $contP")
    println("Quantidade de números ímpares: $contI")
}