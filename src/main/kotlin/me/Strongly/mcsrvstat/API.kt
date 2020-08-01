package me.Strongly.mcsrvstat

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.net.HttpURLConnection
import java.net.URL

object API {

    val link = "https://api.mcsrvstat.us/2/<address>"

    fun getStatus(ip: String): Response {
        val url = URL(link.replace("<address>", ip))
        var response = ""
        with(url.openConnection() as HttpURLConnection) {
            requestMethod = "GET"

            inputStream.bufferedReader().use {
                it.lines().forEach { line ->
                    response += line
                }
            }
            inputStream.close()
        }
        return jacksonObjectMapper().readValue(response)
    }
}