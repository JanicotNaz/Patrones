package comportamiento.templatemethod

abstract class 支払方法 {
    abstract fun 始める()
    abstract fun 支払いを開始する()
    abstract fun 支払いを終わる()

    fun 支払いを作る(){
        始める()
        支払いを開始する()
        支払いを終わる()
    }
}