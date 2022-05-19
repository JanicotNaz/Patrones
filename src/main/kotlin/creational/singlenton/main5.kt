package creational.singlenton

fun main (args: Array<String>){
    一試し()
}

fun 一試し(){
    var インスタンスが一あるんです = 一カード
    var インスタンスが二あるんです = 一カード

    println(インスタンスが一あるんです == インスタンスが二あるんです)
    インスタンスが一あるんです.事()
    インスタンスが二あるんです.事()

}