// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario (val id: Int, var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        if (!inscritos.contains(usuario)){
            inscritos.add(usuario)
            println("Usuário $usuario incluído com sucesso!")
        } else {
            println("Usuário $usuario já consta na lista de matriculados")
        }
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val cursoAndroid01 = ConteudoEducacional("Conhecendo o Kotlin e Sua Documentação Oficial")
    val cursoAndroid02 = ConteudoEducacional("Introdução Prática à Linguagem de Programação Kotlin", 120)
    val formacaoAndroid = Formacao("Formação Android Developer", Nivel.BASICO, listOf(cursoAndroid01, cursoAndroid02))
    
    val us1 = Usuario(1, "Fulano")
    val us2 = Usuario(2, "Ciclano")

    formacaoAndroid.matricular(us1)
    formacaoAndroid.matricular(us2)
    formacaoAndroid.matricular(us1)
}
