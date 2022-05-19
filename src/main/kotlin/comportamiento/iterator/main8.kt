package comportamiento.iterator

fun main(args: Array<String>){
    イテレータの試し()
}
fun イテレータの試し(){
    val カードの配列の変数: Array<カード?> = arrayOfNulls<カード?>(5)
    カードの配列の変数[0] = カード("VISA")
    カードの配列の変数[1] = カード("AMEX")
    カードの配列の変数[2] = カード("MATER CARD")
    カードの配列の変数[3] = カード("APPLE CARD")
    カードの配列の変数[4] = カード("GOOGLE CARD")
    val 配列の変数 = カードの配列(カードの配列の変数)
    val イテレータの変数 = 配列の変数.イテレータの役割()
    while (イテレータの変数.次があります()){
        刷る.印刷("Valor item ${(イテレータの変数.項目() as カード).種類}  valor siguente ${(イテレータの変数.次() as カード).種類}" )
    }
}