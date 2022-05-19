package structural.flyweight


class 敵の工場 {
    companion object {
        private val 敵の配列: HashMap<種類の敵, 敵?> = HashMap()
        fun 敵を受ける(種類: 種類の敵?):敵?{
            return if (敵の配列.containsKey(種類)){敵の配列[種類]}
            else{when(種類){
                種類の敵.種類の探偵-> 印{刷る.印刷("探偵は作成する"); 敵の配列.put(種類!!,探偵()) ;探偵() }
                種類の敵.種類の兵 ->印{刷る.印刷("兵は作成する"); 敵の配列.put(種類!!,兵()) ; 兵() }
                else -> {null}
            }}
        }
        fun 印(矢印: () -> 敵): 敵{return 矢印()}
    }
}