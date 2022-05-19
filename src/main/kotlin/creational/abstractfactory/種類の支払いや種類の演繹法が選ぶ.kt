package creational.abstractfactory

class 種類の支払いや種類の演繹法が選ぶ: 工場の抽象 {
    override fun 支払いを作る(種類の払いの変数: 種類の払い): 支払い {
        return when(種類の払いの変数){
            種類の払い.カード -> カードの支払い()
            種類の払い.グーグル -> グーグルの支払い()
        }
    }

    override fun 演繹法を作る(種類の演繹法の変数: 種類の演繹法): 演繹法 {
        return when (種類の演繹法の変数){
            種類の演繹法.月 -> 毎月の支払額()
            種類の演繹法.前 -> 前払い()
        }
    }
}