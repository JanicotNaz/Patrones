package structural.composite

class アカウントコンポジット: アカウントコンポーネント {

    var アカウントの子: MutableList<アカウントコンポーネント> = ArrayList()

    fun 加える(アカウント: アカウントコンポーネント){
        アカウントの子.add(アカウント)
    }

    fun 取り除く(アカウント: アカウントコンポーネント){
        アカウントの子.remove(アカウント)
    }

    override fun アカウントの名前を表示する() {
        アカウントの子.forEach {
            it.アカウントの名前を表示する()
        }
    }
}