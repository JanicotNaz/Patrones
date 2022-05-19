package comportamiento.memento

class 元の記念品(var 数: Int, var 見出し: String, var 文章: String ) {
    fun 記念品が作る():記事の記念品{
        var 記念品 = 記事の記念品(数,見出し,文章)
        return 記念品
    }
    fun 修復(記念品: 記事の記念品){
        this.数 = 記念品.数
        this.見出し = 記念品.見出し
        this.文章 = 記念品.文章
    }

    override fun toString(): String {
        return "元の記念品(数=$数, 見出し='$見出し', 文章='$文章')"
    }

}