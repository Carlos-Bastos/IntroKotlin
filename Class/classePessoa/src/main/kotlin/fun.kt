var pessoa = Cliente("", idade = 0,"", "")
fun trocarNome() {
    println("Digite o novo nome: ")
    pessoa.nome = readln()
    println("O novo nome é ${pessoa.nome}!")
}

fun trocarIdade() {
    println("Digite a nova idade: ")
    pessoa.idade = readln().toInt()
    println("A nova idade é: ${pessoa.idade}")
}

fun trocarSexo() {
    println("Digite o sexo: ")
    pessoa.sexo = readln()
    println("Trocado com sucesso para: ${pessoa.sexo}")
}

fun trocarEmail() {
    println("Digite o novo email do cliente: ")
    pessoa.email = readln()
    println("Email ${pessoa.email} trocado com sucesso")
}

fun show(){
    println("Nome: ${pessoa.nome}")
    println("Idade: ${pessoa.idade} anos")
    println("Sexo: ${pessoa.sexo}")
    println("Email: ${pessoa.email}")
}