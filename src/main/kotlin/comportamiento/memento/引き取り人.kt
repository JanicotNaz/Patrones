package comportamiento.memento

class 引き取り人 {
    private val 調子: MutableList<記事の記念品> = ArrayList()

    fun 記念品が加える(記念品: 記事の記念品){
        調子.add(記念品)
    }

    fun 記念品を取る(索引: Int): 記事の記念品{
        return 調子[索引]
    }

}