/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de "150"
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

fun main() {
    var cont = 0
    var idade: Int
    var sex: Int
    var mood: Int
    var calm = 0
    var mnerv = 0
    var hagres = 0
    var ocalm = 0
    var nerv40 = 0
    var calm18 = 0

    while (cont < 150){
        cont++

        println("Digite sua idade: ")
        idade = readln().toInt()
        println("Qual seu sexo? 1) Feminino 2) Masculino 3) Outros")
        sex = readln().toInt()
        println("Você se sente: 1) Calmo 2) Nervoso 3) Agressivo")
        mood = readln().toInt()

        if (mood == 1){
            calm++
        }
        if (sex == 1 && mood == 2){
            mnerv++
        }
        if (sex == 2 && mood == 3){
            hagres++
        }
        if (sex == 3 && mood == 1){
            ocalm++
        }
        if (mood == 2 && idade > 40){
            nerv40++
        }
        if (mood == 1 && idade < 18){
            calm18++
        }
    }
    println("Número de pessoas calmas: $calm")
    println("Número de mulheres nervosas: $mnerv")
    println("Número de homens agressivos: $hagres")
    println("Número de 'Outros' calmos: $ocalm")
    println("Número de pessoas nervosas com mais de 40 anos: $nerv40")
    println("Número de pessoas calmas com menos de 18 anos: $calm18")
}