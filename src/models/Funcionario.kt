package models

class Funcionario: Pessoa {
    private var salario: Double? = null

    constructor(nome: String, altura: Double, salario: Double) : super(nome, altura) {
        this.salario = salario
    }
}