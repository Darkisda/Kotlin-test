import models.Agenda
import models.Funcionario
import models.Pessoa
import java.time.LocalDate

fun main() {
    var nascimento = LocalDate.of(2000,10,24)

    var pessoa1 = Pessoa("Luan", 1.70, nascimento)
    var pessoa2 = Pessoa("Luan1", 1.70, nascimento)
    var pessoa3 = Pessoa("Luan2", 1.70, )
    var pessoa4 = Pessoa("Luan3", 1.70, nascimento)
    var pessoa5 = Pessoa("Luan4", 1.70, )
    var pessoa6 = Pessoa("Luan5", 1.70, nascimento)
    var pessoa7 = Pessoa("Luan6", 1.70, )
    var pessoa8 = Pessoa("Luan7", 1.70, )
    var pessoa9 = Pessoa("Luan9", 1.70, )
    var pessoa10 = Pessoa("Lua0n", 1.70, nascimento)

    var agenda = Agenda()

    agenda.armazenaPessoa(pessoa1)
    agenda.armazenaPessoa(pessoa2)
    agenda.armazenaPessoa(pessoa3)
    agenda.armazenaPessoa(pessoa4)
    agenda.armazenaPessoa(pessoa5)
    agenda.armazenaPessoa(pessoa6)
    agenda.armazenaPessoa(pessoa7)
    agenda.armazenaPessoa(pessoa8)
    agenda.armazenaPessoa(pessoa9)
    agenda.armazenaPessoa(pessoa10)

    println(agenda.mostraAgenda())

    agenda.removePessoa("Luan3")
    agenda.removePessoa("Lua0n")
    agenda.removePessoa("Luan9")


    println(agenda.mostraAgenda())

    println(agenda.buscaPessoa("Luan"))

    agenda.printPessoa(5)

    var funcionario1 = Funcionario("Taniro", 1.79, 10.500)

    agenda.armazenaPessoa(funcionario1)

    println(agenda.mostraAgenda())
}