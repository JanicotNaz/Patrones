package structural.adapter

fun main(args:Array<String>){
    アダプターの試し()

}

fun アダプターの試し(){
    var アダプターの変数 = 運用のアダプター(3,4)
    刷る.印刷(if(アダプターの変数.足し算() == 7){"これは数です"}else{""})
    var 目標 = アダプター(アダプターの変数)
    刷る.印刷(if(目標.足し算が受ける == "7"){"これは文字"}else{""})
    刷る.印刷(目標.足し算が受ける)
}