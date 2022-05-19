package comportamiento.interpreter

class 表情(一番表現: 表現, 二番表現: 表現): 表現 {

    private var 一番表現: 表現
    private var 二番表現: 表現

    init {
        this.一番表現 = 一番表現
        this.二番表現 = 二番表現
    }

    override fun 演技者(文脈: String): Boolean {
        return 一番表現.演技者(文脈) && 二番表現.演技者(文脈)
    }
}