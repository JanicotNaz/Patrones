package comportamiento.observer

class 歩行者: 観察者 {
    override fun 更新(信号の変数: 信号) {
        when(信号の変数.格){
            光.赤色 ->{刷る.印刷("歩行者を走ると信号は赤色に成る")}
            光.緑色 ->{刷る.印刷("歩行者を止めると信号は緑色に成る")}
            光.黄色 ->{刷る.印刷("歩行者をゆっくり止めると黄色に成る")}
        }
    }
}