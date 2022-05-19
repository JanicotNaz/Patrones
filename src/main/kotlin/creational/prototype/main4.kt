package creational.prototype

fun main (args: Array<String>){
    プロトタイプの試し()
}

fun プロトタイプの試し(){
    var 元の変数 = 亜米利加()
    var コピー = 元の変数.clone() as? 亜米利加
    var 複写 = 元の変数
    println(元の変数)
    println(コピー)
    println(複写)
    println(元の変数 == コピー)
    println(元の変数 == 複写)
}
