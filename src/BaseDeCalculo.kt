fun main () {
    //altura da embalagem
    var altura: Double = 20.0

    //valor do produto, expecifique qual o produto na tabela
    var produto: Double = 23.80

    //largura da embalagem
    var largura: Double = 30.0

    //minimo de milheiros
    var minimo: Int = 100

    //espessura da embalagem
    var espessura: Double = 0.006

    //calcula o peso de cada milheiro
    var kgPorMilheiro: Double = altura * largura * espessura

    //valor do milheiro
    var milheiro = kgPorMilheiro * produto

    /**
     * Calcula a densidade do material, veja qual é o material da embalagem para saber a densidade
     */
    var densidade: Double = kgPorMilheiro * 0.905

    var totalpedido = produto * milheiro

    var minMilheiros = minimo / densidade

    println("Kilos por Milheiros:$kgPorMilheiro")
    println("Densidade: $densidade")
    println("Minimo de milheiros: $minMilheiros")
    println("Total do pedido final: $totalpedido")

}