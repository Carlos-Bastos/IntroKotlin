class Cliente(
    var nome: String,
    var idade: Int,
    var sexo: String
) {
    var email = ""

    constructor (
        nome: String,
        idade: Int,
        sexo: String,
        email: String
    ) : this(nome, idade, sexo) {
        this.email = email
    }
}
