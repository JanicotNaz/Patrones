package comportamiento.templatemethod

class ビザ: 支払方法() {
    override fun 始める() {
        刷る.印刷("ビザの支払を始める")
    }

    override fun 支払いを開始する() {
        刷る.印刷("ビザのサーバーによって支払を開始する")
    }

    override fun 支払いを終わる() {
        刷る.印刷("ビザのサーバーによって支払を終わる")
    }
}