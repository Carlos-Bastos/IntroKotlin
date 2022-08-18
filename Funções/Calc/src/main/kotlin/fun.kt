import kotlin.math.pow
import kotlin.math.sqrt

fun menu(op: Int) {
    return when (op) {
        1 -> {
            print("Digite um número: ")
            val n1 = readln().toDouble()
            print("Digite outro número: ")
            val n2 = readln().toDouble()
            println("A soma dos números digitados é: ${n1 + n2}")
        }
        2 -> {
            print("Digite um número: ")
            val n1 = readln().toDouble()
            print("Digite outro número: ")
            val n2 = readln().toDouble()
            println("A subtração dos números digitados é: ${n1 - n2}")
        }
        3 -> {
            print("Digite um número: ")
            val n1 = readln().toDouble()
            print("Digite outro número: ")
            val n2 = readln().toDouble()
            println("A multiplicação dos números digitados é: ${n1 * n2}")
        }
        4 -> {
            print("Digite um número: ")
            val n1 = readln().toDouble()
            print("Digite outro número: ")
            val n2 = readln().toDouble()
            println("A divisão dos números digitados é: ${n1 / n2}")
        }
        5 -> {
            print("Digite um número: ")
            val n1 = readln().toDouble()
            println("O quadrado de $n1 é: ${n1.pow(2)}")
        }
        6 -> {
            print("Digite um número: ")
            val n1 = readln().toDouble()
            println("A raiz quadrada de $n1 é: ${sqrt(n1)}")
        }
        else -> {
            println("Valor inválido")
        }
    }
}