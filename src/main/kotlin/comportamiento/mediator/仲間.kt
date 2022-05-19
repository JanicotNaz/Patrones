package comportamiento.mediator

abstract class 仲間(open var 仲介の変数: 仲介) {
    abstract fun メッセージを送信する(メッセージ: String)
    abstract fun メッセージを受信する(メッセージ: String)
}