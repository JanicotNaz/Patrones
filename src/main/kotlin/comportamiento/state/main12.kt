package comportamiento.state

fun main(args: Array<String>){
    アラートの試し()
}

fun アラートの試し(){
    var 文脈 = コンテキストモバイルステータスアラート()
    文脈.アラート()
    Thread.sleep(3000)
    文脈.ステータスを受ける(振動())
    文脈.アラート()
    Thread.sleep(3000)
    文脈.ステータスを受ける(サイレント())
    文脈.アラート()
}