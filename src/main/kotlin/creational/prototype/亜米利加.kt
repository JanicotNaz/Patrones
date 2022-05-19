package creational.prototype

class 亜米利加: カードプロトタイプ() {
    init {
        種類 = "AMEX"
        数 = "1111 2222 3333 4444"
    }

    override fun toString(): String {
        return "Tipo: $種類 Numero: $数"
    }

    public override fun clone(): Any {
        println("CLoado Correctamente Amex")
        return super.clone() as 亜米利加
    }
}