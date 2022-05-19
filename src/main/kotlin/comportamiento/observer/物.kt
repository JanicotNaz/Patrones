package comportamiento.observer

interface 物 {
    fun 加える(観察者の変数: 観察者)
    fun 離れる(観察者の変数: 観察者)
    fun 更新の情報(信号の変数: 信号)
}