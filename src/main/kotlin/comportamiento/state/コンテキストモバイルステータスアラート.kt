package comportamiento.state

class コンテキストモバイルステータスアラート(var 実情: モバイルステータスアラート = 音()) {

    fun ステータスを受ける(ステータス: モバイルステータスアラート){
        実情 = ステータス
    }

    fun アラート(){
        実情.アラート(this)
    }

}