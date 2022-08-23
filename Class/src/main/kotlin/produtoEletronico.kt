/*atributos - marca, os, core, sim,*/
class smartphone() {
    var marca = "Generation"
    var modelo1 = "Gen YE22"
    var modelo2 = "Gen YE22 Plus"
    var os = "Android 12 Gen UI 2.0"
    var core = "Octa core 64bit"
    var bateria = "6000mA/h"
    var cameraT = "12 Mp + 12 Mp + 8 Mp"
    var cameraF = "32Mp"
    var sim = "Dual SIM"

    /*var nome: String
    var cpf: String
    var modelo: String
    var cor: String

    constructor(nome, cpf, modelo, cor
    ): this(nome, cpf, modelo, cor) {
        this.nome = nome
        this.cpf = cpf
        this.modelo = modelo
        this.cor = cor
   }*/


fun modelo1() {
    println("Informações básicas")
    println("Modelo escolhido: $modelo1")
    println("Marca: $marca")
    println("Sistema Operacional: $os")
    println("Processador: $core")
    println("Bateria: $bateria")
    println("Câmera traseira: $cameraT")
    println("Câmera frontal: $cameraF")
    println("Rede: $sim")
}
}
