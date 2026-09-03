fun main() {


    val titulo = "As Tartarugas Ninjas"


    val nome1 = "Leonardo"
    val arma1 = "Katanas"
    val cor1 = "Azul"
    var peso1 = 94.2
    val altura1 = 168


    val nome2 = "Raphael"
    val arma2 = "Adagas"
    val cor2 = "Vermelho"
    var peso2 = 90.8
    val altura2 = 166

    val pesoTotal = peso1 + peso2


    println(titulo)
    println()

    println("Nome: $nome1")
    println("Arma: $arma1")
    println("Cor: $cor1")
    println("Peso: ${peso1}kg")
    println("Altura: ${altura1}cm")
    println()

    println("Nome: $nome2")
    println("Arma: $arma2")
    println("Cor: $cor2")
    println("Peso: ${peso2}kg")
    println("Altura: ${altura2}cm")
    println()

    println("---Estatísticas das Tartarugas---")
    println()
    println("O peso combinado de Leonardo e Rafael é: ${pesoTotal}kg")


}