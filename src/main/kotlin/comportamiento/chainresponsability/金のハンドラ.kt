package comportamiento.chainresponsability

class 金のハンドラ:ローンハンドラーを承認する  {
    private lateinit var 次: ローンハンドラーを承認する

    override fun 次に受けるんです(ハンドラ: ローンハンドラーを承認する) {
        次 = ハンドラ
    }

    override fun 次に取るんです(): ローンハンドラーを承認する {
        return 次
    }

    override fun クレジットのカード(合計: Int):Int {
        var 全額 = 合計 + 1
        if (合計 <= 10000){
            println("Esta solicitud de tarjeta  las maneja las tipo gold")
        }else{
            全額 =  次.クレジットのカード(合計)
        }
        return 全額
    }

}