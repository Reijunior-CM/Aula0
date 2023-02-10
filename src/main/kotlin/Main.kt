class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado com sucesso!")
    }
}

fun main() {
    val conteudos = listOf(
        ConteudoEducacional("Introdução à programação"),
        ConteudoEducacional("Programação orientada a objetos"),
        ConteudoEducacional("Estruturas de dados e algoritmos")
    )

    val formacao = Formacao("Programação Avançada", conteudos)

    val usuario1 = Usuario("João Silva", "joao.silva@email.com")
    val usuario2 = Usuario("Maria Souza", "maria.souza@email.com")
    val usuario3 = Usuario("Pedro Oliveira", "pedro.oliveira@email.com")

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

    println("Inscritos na formação ${formacao.nome}:")
    formacao.inscritos.forEach {
        println("- ${it.nome} (${it.email})")
    }
}
