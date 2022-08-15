fun main(){

        var num = IntArray(5) //Criando uma lista com nome num de 5 espaços
        //val leitor = Scanner(System.in) //Inicando o Scanner
        var maior: Int = 0 //Iniciando o maior número

        //for (i in 0 until 5) {//i = faz uma contagem de 0 ate 4 (until <5)
        for (i in 0..4) {//i = faz uma contagem de 0 ate 4 (.. <=4)
            print("Insira um número: ")
            num[i] = readln()!!.toInt()

            //num[i] = leitor.nextInt() //num que é a lista com i que é a contagem lista[posição]
            if (num[i] > maior) { //comparação se o valor de num é maior que o antigo
                maior = num[i]
            }
        }
        for (i in 0 until 5) {
            println(num[i]) //imprimindo todos os valores dos vetores
        }
        println()
        println("O maior número digitado foi: $maior") //imprimindo o maior número
    }



/*programa
{
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
	 Encontre após a maior pontuação e a apresente.*/

	funcao inicio()
	{
		real pontos[5],x=0 //maior pontuação

		para(inteiro i = 0; i < 5; i++){

		escreva("Escreva suas pontuações: ")
		leia(pontos[i])

			se(pontos[i]>x){

			x=pontos[i]
							}
									}

				escreva("Sua maior pontuação é: ", x)

	 }
}*/
