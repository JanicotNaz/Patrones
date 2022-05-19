package comportamiento.observer

class メッセージの編集者:物 {
    private val 観察者の配列: MutableList<観察者> = ArrayList()
    override fun 加える(観察者の変数: 観察者) {
        観察者の配列.add(観察者の変数)
    }

    override fun 離れる(観察者の変数: 観察者) {
        観察者の配列.remove(観察者の変数)
    }

    override fun 更新の情報(信号の変数: 信号) {
        観察者の配列.forEach{ it.更新(信号の変数)}
    }
}