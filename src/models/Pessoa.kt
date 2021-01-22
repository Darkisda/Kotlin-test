package models

import java.time.LocalDate
import java.time.temporal.ChronoUnit

open class Pessoa(nome: String = "", altura: Double = 0.0 ) {
    private var nome: String? = null
    private var dataNascimento: LocalDate? = null
    private var idade: Long? = null
    private var altura: Double? = null

    init {
        this.nome = nome
        this.altura = altura
    }

    constructor(nome: String, altura: Double, dataNascimento: LocalDate): this(nome, altura) {
        this.nome = nome
        this.altura = altura
        this.dataNascimento = dataNascimento
        this.setIdade()
    }

    private fun setIdade() {
        this.idade = ChronoUnit.YEARS.between(
            this.dataNascimento,
            LocalDate.now()
        )
    }

    public fun getNome(): String? {
        return this.nome
    }

    override fun toString(): String {
        return "$nome e tenho $idade? anos e ${altura} cm"
    }
}