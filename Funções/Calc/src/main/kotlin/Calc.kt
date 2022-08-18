fun main() {
    println("Qual o tipo de operação?\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Ao Quadrado\n6-Raiz Quadrada")
    val op: Int = readln().toInt()
    menu(op = op)
}