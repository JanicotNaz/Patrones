package structural.proxy

class プロキシインターネット: インターネット {

    var インターネットの変数 = インターネットに接続する()
    var 禁止されたURL: MutableList<String> = ArrayList()

    init {
        禁止されたURL.add("twitter.com")
        禁止されたURL.add("google.com")
        禁止されたURL.add("facebook.com")
    }

    fun メッセージ(url: String){
        刷る.印刷("URLに接続中しようとしています")
        刷る.印刷("URLがブロックされた。アクセスが拒否された。管理者に確認して下さい")
    }

    override fun 接続する(url: String) {
        if (禁止されたURL.contains(url)){
            メッセージ(url)
        }else{
            インターネットの変数.接続する(url)
        }
    }
}