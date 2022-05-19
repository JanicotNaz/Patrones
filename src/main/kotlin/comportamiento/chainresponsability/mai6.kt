package comportamiento.chainresponsability

fun main(args:Array<String>){
    責任の連鎖の試し()
}

fun 責任の連鎖の試し(){
    val 銀行のハンドラの変数 = 銀行のハンドラ()
    println(銀行のハンドラの変数.クレジットのカード(1000000))
}