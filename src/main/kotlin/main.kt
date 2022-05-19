
fun main(args: Array<String>){
    var iva: (Float) -> Float = { amount: Float -> amount + (amount * 0.16F)}
  //  var iva2: (Float) -> Flotante<Float> = { trap2 { amount:Float -> amount + (amount * 0.16F) } }
    var discount:(Float) -> Float = {amout:Float -> amout - (amout * 0.1F)}
    println(discount(iva(100F)))
   // var mount = 100;
//    mount
}
/*
fun trap2(f: (Float) -> Float): Flotante<Float> {
    return Some2(f())
}

sealed class Flotante<out A>

data class Some2<out A>(val get: A): Flotante<A>()

sealed class Methods<out T>{
    object  `Nothing#` : Methods<Nothing>()
    object Pipe
}
sealed class Option<out A>

data class Some<out A>(val get: A): Option<A>()

object None: Option<Nothing>()

fun <A> trap(f: () -> A):Option<A> =
    try {
        Some(f())
    }catch (a: Throwable){
        None
    }*/