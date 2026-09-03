fun main() {


    val titulo = "As Tartarugas Ninjas"

    val nome1 = "Leonardo"
    val arma1 = "Katanas"
    val cor1 = "Azul"
    var peso1 = 94.0
    val altura1 = 168

    val nome2 = "Raphael"
    val arma2 = "Adagas"
    val cor2 = "Vermelho"
    var peso2 = 92.0
    val altura2 = 167

    val nome3 = "Donatello"
    val arma3 = "Bo"
    val cor3 = "Roxo"
    var peso3 = 91.0
    val altura3 = 164

    val nome4 = "Michelangelo"
    val arma4 = "Tchaco"
    val cor4 = "Laranja"
    var peso4 = 96.0
    val altura4 = 166


    val pesoTotal1 = peso1 + peso2
    val pesoTotal2 = peso1 + peso3
    val pesoTotal3 = peso1 + peso4
    val pesoTotal4 = peso2 + peso3
    val pesoTotal5 = peso2 + peso4
    val pesoTotal6 = peso3 + peso4

    println()
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

    println("Nome: $nome3")
    println("Arma: $arma3")
    println("Cor: $cor3")
    println("Peso: ${peso3}kg")
    println("Altura: ${altura3}cm")
    println()

    println("Nome: $nome4")
    println("Arma: $arma4")
    println("Cor: $cor4")
    println("Peso: ${peso4}kg")
    println("Altura: ${altura4}cm")
    println()

    println("Escolha um personagem: Leonardo, Raphael, Donatello ou Michelangelo?")
    val escolhaPersonagem = readln()
    println("Você escolheu o $escolhaPersonagem!")
    println()

    println("Escolha uma arma: Katanas, Adagas, Bo ou Tchaco?")
    val escolhaArma = readln()
    println("Você escolheu $escolhaArma!")
    println()

    println("Escolha uma cor: Azul, Vermelho, Roxo ou Laranja?")
    val escolhaCor = readln()
    println("Você escolheu a cor $escolhaCor!")
    println()


    println("---Estatísticas do Grupo---")
    println()
    println("O peso combinado de Leonardo e Raphael é: ${pesoTotal1}kg")
    println("O peso combinado de Leonardo e Donatello é: ${pesoTotal2}kg")
    println("O peso combinado de Leonardo e Michelangelo é: ${pesoTotal3}kg")
    println("O peso combinado de Raphael e Donatello é: ${pesoTotal4}kg")
    println("O peso combinado de Raphael e Michelangelo é: ${pesoTotal5}kg")
    println("O peso combinado de Donatello e Michelangelo é: ${pesoTotal6}kg")


}