# mcsrvstat-java
 Kotlin/Java API for mcsrvstat


Online players:
```kotlin
    val api = API.getStatus("server_ip:server_port")
    
    val onlinePlayers = api.players?.online
```




# Documentation

## Response Object

```kotlin

    response.online
    response.ip
    response.port

    response.debug.animatedmotd
    response.debug.apiversion
    response.debug.cachetime
    response.debug.cnameinsrv
    response.debug.ipinsrv
    response.debug.ping
    response.debug.query
    response.debug.querymismatch
    response.debug.srv
    response.hostname
    
    
    
    /*     NULL IF SERVER IS OFFLINE     */
    response.motd?.raw
    response.motd?.clean
    response.motd?.html
    response.players?.list
    response.players?.max
    response.players?.online
    response.version
    response.protocol
    response.icon
    response.software
    response.plugins?.names
    response.plugins?.raw
    response.mods?.names
    response.mods?.raw
    response.info

```

For more info visit: https://api.mcsrvstat.us/
