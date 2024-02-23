import java.util.zip.Adler32

fun main(){
    name("Janet")
    modulous(7,5)
    sum(5,8,6,9)
    fact("I love travelling")
}


fun name(word:String) {
    var name="Hello $word"
    println(name)

}
fun modulous(num1:Int,num2:Int) :Int{
    var modulous= num1%num2
    println(modulous)
    return modulous

}
fun sum(num1: Int,num2: Int,num3: Int,num4: Int):Int{
    var sum = num1+num2+num3+num4
    println(sum)
    return sum

}
fun fact(word: String){
    println(word)
}





