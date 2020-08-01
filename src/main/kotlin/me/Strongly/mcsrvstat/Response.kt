package me.Strongly.mcsrvstat

data class Response(
    val online: Boolean,
    val ip: String,
    val port: Int,
    val debug: Debug,
    val motd: MOTD?,
    val players: Players?,
    val version: String?,
    val protocol: Int?,
    val hostname: String?,
    val icon: String?,
    val software: String?,
    val map: String?,
    val plugins: Plugins?,
    val mods: Mods?,
    val info: Info?
)

