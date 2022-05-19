package creational.prototype

abstract class カードプロトタイプ: Cloneable {
    var 数: String
    var 種類: String

    init {
        数 = "0000 0000 0000 0000"
        種類 = ""
    }

    @Throws(CloneNotSupportedException::class)
    override fun clone(): Any {
        println("Prototipo de clonado")
        return super.clone() as カードプロトタイプ
    }


}