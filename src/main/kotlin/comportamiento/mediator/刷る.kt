package comportamiento.mediator

import java.io.OutputStreamWriter

class 刷る {
    companion object {
        val 変数 = OutputStreamWriter(System.out, "UTF-8")
        fun 印刷(文字:String){
            変数.write(文字)
            println()
            変数.flush()
        }
    }
}