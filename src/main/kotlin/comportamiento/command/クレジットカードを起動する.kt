package comportamiento.command

class クレジットカードを起動する {

    private var 命令の変数: 命令? = null

    fun 命令を受ける(命令の変数: 命令){
        this.命令の変数 = 命令の変数
    }

    fun 行動する(){
        命令の変数!!.果たす()
    }



}