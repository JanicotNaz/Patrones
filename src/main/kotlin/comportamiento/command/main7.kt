package comportamiento.command

fun main(args: Array<String>){
    命令の試し()
}

fun 命令の試し(){
    val クレジットカードの受信者の変数 = クレジットカードの受信者()
    val 起動 = クレジットカードを起動する()
    起動.命令を受ける(クレジットカードは命令を承認する(クレジットカードの受信者の変数))
    起動.行動する()
    起動.命令を受ける(クレジットカードは命令を非アクティブ化する(クレジットカードの受信者の変数))
    起動.行動する()
}