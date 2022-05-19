package comportamiento.mediator

class 仲間が二人あります (override var 仲介の変数: 仲介):仲間(仲介の変数) {
    override fun メッセージを送信する(メッセージ: String) {
        仲介の変数.受ける(メッセージ,this)
    }

    override fun メッセージを受信する(メッセージ: String) {
        刷る.印刷("二番使用者はメッセージ「${メッセージ}」を受信しているんです")
    }
}