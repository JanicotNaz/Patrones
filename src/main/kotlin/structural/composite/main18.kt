package structural.composite

fun main(args: Array<String>){
    コンポーネントの試し()
}

fun コンポーネントの試し(){
    var 保存 = アカウントが保存する()
    var アカウント = 当座預金()

    var コンポジット = アカウントコンポジット()
    コンポジット.加える(保存)
    コンポジット.加える(アカウント)

    コンポジット.アカウントの名前を表示する()
}