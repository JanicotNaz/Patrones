package creational.singlenton

object 一カード {
    var カードの数: String
    var 数: Int = 0
    init {
        カードの数 = "0000 0000 0000 0000"
        println("Inicializando el objeto: $this")
        println("Clase singular")
    }

    fun 事(){
        数++
        println("Trabajando nuestra instancia singular $数")
    }

}