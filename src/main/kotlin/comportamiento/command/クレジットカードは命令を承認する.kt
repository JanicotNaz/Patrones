package comportamiento.command

class クレジットカードは命令を承認する(クレジットカードの受信者の変数: クレジットカードの受信者): 命令 {
    var クレジットカードの受信者の変数: クレジットカードの受信者

    init {
        this.クレジットカードの受信者の変数 = クレジットカードの受信者の変数
    }

    override fun 果たす() {
        クレジットカードの受信者の変数.御客様にカードの数を送るんです()
        クレジットカードの受信者の変数.承認する()
        クレジットカードの受信者の変数.御客様に承認のメッセージを送るんです()
    }
}