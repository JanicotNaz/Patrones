package creational.builder

fun main(args: Array<String>){
    建築士の試し()

}
fun 建築士の試し(){
    var 車の変数: 車 = 車.自動車("VISA", "1111 2222 3333 4444").クレジット(false).終期(2030).名前("Janicot").建築士()

    print(車の変数)
}