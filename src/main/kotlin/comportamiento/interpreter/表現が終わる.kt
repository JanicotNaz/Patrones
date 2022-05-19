package comportamiento.interpreter

class 表現が終わる(文章: String): 表現 {

    private var 文章: String

    init {
        this.文章 = 文章
    }

    override fun 演技者(文脈: String): Boolean {
        return 文脈.contains(文章)
    }
}