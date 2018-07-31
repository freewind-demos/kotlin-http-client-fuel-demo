package example

import com.github.kittinunf.fuel.Fuel

fun main(args: Array<String>) {
    val result = Fuel.get("http://httpbin.org/get").responseString()
    println(result)
}
