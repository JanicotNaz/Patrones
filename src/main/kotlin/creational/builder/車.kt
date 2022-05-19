package creational.builder

class 車 private constructor(建築士:自動車) {
    val 種類の車: String
    val 数: String
    val 名前: String?
    val 終期: Int?
    val クレジット: Boolean?

    init {
        this.種類の車 = 建築士.種類の車
        this.数 = 建築士.数
        this.名前 = 建築士.名前
        this.終期 = 建築士.終期
        this.クレジット = 建築士.クレジット
    }

    override fun toString(): String {
        return "Card: $種類の車 - $数 - $終期 - $名前 - $クレジット"
    }

    class 自動車(val 種類の車: String, val  数: String){
        var 名前: String? = null
        var 終期: Int = 0
        var クレジット: Boolean = false

        fun 名前(名前: String): 自動車{
            this.名前 = 名前
            return this
        }

        fun 終期(終期: Int): 自動車{
            this.終期 = 終期
            return this
        }

        fun クレジット(クレジット: Boolean): 自動車{
            this.クレジット = クレジット
            return this
        }
        fun 建築士():車{
            return 車(this)
        }

    }
}