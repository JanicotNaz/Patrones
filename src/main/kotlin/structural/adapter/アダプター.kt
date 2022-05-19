package structural.adapter

class アダプター(var アダプターの変数:運用のアダプター): 運用目標 {
    override var 足し算が受ける: String
        get() = this.アダプターの変数.足し算().toString()
        set(value) {}
}