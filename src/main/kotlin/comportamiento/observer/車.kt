package comportamiento.observer

class 車: 観察者{
    override fun 更新(信号の変数: 信号) {
        when(信号の変数.格){
            光.赤色 ->{刷る.印刷("車を止めると信号は赤色に成る")}
            光.緑色 ->{刷る.印刷("車を走ると信号は緑色に成る")}
            光.黄色 ->{刷る.印刷("車をゆっくり止めると信号は黄色に成る")}
        }
    }
}