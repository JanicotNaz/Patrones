package creational.abstractfactory

interface 工場の抽象 {
    fun 支払いを作る(種類の払いの変数: 種類の払い = 種類の払い.グーグル): 支払い
    fun 演繹法を作る(種類の演繹法の変数: 種類の演繹法 = 種類の演繹法.前 ): 演繹法
}