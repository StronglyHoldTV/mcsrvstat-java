package me.Strongly.mcsrvstat

import netscape.javascript.JSObject

fun main() {
    val m = API.getStatus("mc.grapexon.eu:21543")
    println(m.toString())
}