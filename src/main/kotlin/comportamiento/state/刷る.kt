package comportamiento.state

import java.io.OutputStreamWriter
import java.io.PrintStream

class 刷る {
    companion object {
        val 変数 = OutputStreamWriter(System.out, "UTF-8")
        fun 印刷(文字:Any?){
            変数.write(文字 as? String)
            println()
            変数.flush()
        }
    }
}