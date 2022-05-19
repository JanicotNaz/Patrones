package comportamiento.chainresponsability

class 銀行のハンドラ:ローンハンドラーを承認する  {
    private lateinit var 次: ローンハンドラーを承認する

    override fun 次に受けるんです(ハンドラ: ローンハンドラーを承認する) {
        次 = ハンドラ
    }

    override fun 次に取るんです(): ローンハンドラーを承認する {
        return 次
    }

    override fun クレジットのカード(合計: Int):Int {
        var 全額 = 合計
        val 金のハンドラの変数: 金のハンドラ = 金のハンドラ()
        this.次に受けるんです(金のハンドラの変数)

        val 白金のハンドラの変数 = 白金のハンドラ()
        金のハンドラの変数.次に受けるんです(白金のハンドラの変数)

        val 黒いハンドラの変数 = 黒いハンドラ()
        白金のハンドラの変数.次に受けるんです(黒いハンドラの変数)

        全額 = 次.クレジットのカード(合計)
        return 全額
    }
}