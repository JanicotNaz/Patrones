package comportamiento.iterator

class カードのイテレータ(カードの配列: Array<カード?>):イテレータ {
    private var カードの配列:Array<カード?> = カードの配列
    private var 位置 = 0

    override fun 次があります(): Boolean {
        return 位置 < カードの配列.size
    }

    override fun 次(): Any? {
        return カードの配列[位置++]
    }

    override fun 項目(): Any? {
        return カードの配列[位置]
    }
}