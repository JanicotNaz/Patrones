package structural.flyweight

class 兵: 敵{

    val 命 = 200
    private var 武器 = ""

    override fun 武器が受ける(武器: String) {
        this.武器 = 武器
        刷る.印刷("${武器}を作成する")
    }

    override fun ライプポイント() {
        刷る.印刷("兵の生活は${命}です")
    }
}