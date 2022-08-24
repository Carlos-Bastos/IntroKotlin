import java.util.Scanner

fun main() {
        val limite: Double = 50.0
        val multa: Double = 4.0
        var sub: Double
        var valor: Double
        var leitor = Scanner(System.`in`)

        print("Digite o peso total dos tomates: ")
        var peso: Int = leitor.nextInt()


        println("Peso total: $peso" + "Kg")

                if(peso>50){
                sub = (peso-limite)
                valor = (multa*sub)
                println("Peso excedente: $sub" + "Kg")
                println("Valor da multa: R$$valor")

                }
                        if(peso<0) {
                        print("Valor inválido")
                                }else{
                                        print("Dentro do peso limite estabelecido")
                }

}



