package creational.factorymethod

class 支払いの工場 {
    companion object{
        fun 支払いを構築する(種類の支払いの変数: 種類の支払い):支払い?{
            when(種類の支払いの変数){
                種類の支払い.カード -> return カードの支払い()
                種類の支払い.グーグル -> return グーグルの支払い()
                else -> return null
            }
        }
    }
}