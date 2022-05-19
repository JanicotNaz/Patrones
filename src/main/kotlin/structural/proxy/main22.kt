package structural.proxy

fun main(args: Array<String>){
    プロキシの試し()
}

fun プロキシの試し(){
    var インターネットの変数 = プロキシインターネット()
    インターネットの変数.接続する("udemy.com")
    インターネットの変数.接続する("facebook.com")
}