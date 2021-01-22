package models

class Agenda {
    val pessoas = ArrayList<Pessoa>()

    fun armazenaPessoa(pessoa: Pessoa) {
        if (pessoas.size <= 10) {
            pessoas.add(pessoa)
        } else {
            print("Encheu")
        }
    }

    fun removePessoa(nome: String) {
        pessoas.removeIf { it.getNome() === nome }
    }

    fun mostraAgenda(): String {
        var pess = "== Pessoas na Agenda: ==\n"
        pessoas.forEach { pess += "== ${it.getNome()} == \n" }
        return pess
    }

    fun buscaPessoa(nome: String): Pessoa? {
        return pessoas.find { it.getNome() == nome }
    }

    fun printPessoa(index: Int) {
        if (index > pessoas.size) {
            println("Impossível printar fora dos limites")
        } else {
            println(pessoas[index])
        }
    }
}