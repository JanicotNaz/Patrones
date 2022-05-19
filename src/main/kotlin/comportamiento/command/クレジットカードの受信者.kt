package comportamiento.command

class クレジットカードの受信者 {

    fun 御客様にカードの数を送るんです(){
        刷る.印刷("El numero ha sido envidao")

    }
    fun 御客様に承認のメッセージを送るんです(){
        刷る.印刷("Envio de mensaje de infromación de activación cliente")

    }
    fun 承認する(){
        刷る.印刷("La tarjeta ha sido activada")

    }
    fun 非アクティブ化する(){
        刷る.印刷("La tarjeta ha sido desactivada")

    }
    fun カードは非アクティブ化のメッセージを送るんです(){
        刷る.印刷("Envio de SMS al cliente informando de la desactivación")
    }

}