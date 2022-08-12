import java.util.*

fun main(){


    var leitor = Scanner(System.`in`)


    print("Digite o índice de poluição detectado: ")
    var num: Double = leitor.nextDouble()

    //else = senao se
    if(num in 0.05..0.4) {

        if (num in 0.05..0.25) {
            println("O índice de poluição é aceitável")
        } else if (num < 0.3) {
            println("Empresas do 1º grupo deve suspender as atividades")
        } else if (num < 0.4) {
            println("Empresas do 1º e 2º grupo devem suspender as atividades")
        } else {
            println("O índice de poluição está alto e todas as empresas devem suspender as atividades")
        }
    }else{
        println("Valor inválido")
    }

}
