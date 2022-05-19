package structural.decorator

open class クレジットを飾る(var 飾り: クレジットカードのコンポーネント): クレジットカードのコンポーネント {
    override fun クレジットカードを表示する() {
        飾り.クレジットカードを表示する()
    }
}