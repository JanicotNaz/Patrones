package structural.flyweight

import java.util.*


fun main(args: Array<String>){
    フライ級の試し()
}

fun フライ級の試し(){
    for (i in 0..15){
        val 敵の変数: 敵? = 敵の工場.敵を受ける(種類の敵はランダムを取る())
        敵の変数?.武器が受ける(種類の武器はランダムを取る()!!)
        敵の変数?.ライプポイント()
    }
}

private val 種類の敵の配列 = arrayOf(種類の敵.種類の兵, 種類の敵.種類の探偵)

private val 武器の配列 = arrayOf("鉄砲","短銃","刀")

fun 種類の敵はランダムを取る():種類の敵{
    val ランダム = Random()
    val ランダムの位置: Int = ランダム.nextInt(種類の敵の配列.size)
    return 種類の敵の配列[ランダムの位置]
}

fun 種類の武器はランダムを取る():String?{
    val ランダム = Random()
    val ランダムの位置: Int = ランダム.nextInt(武器の配列.size)
    return 武器の配列[ランダムの位置]
}