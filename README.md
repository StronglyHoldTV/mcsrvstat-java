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

    response.online //boolean
    response.ip //string
    response.port //int
    response.debug.animatedmotd //boolean
    response.debug.apiversion //int
    response.debug.cachetime //long
    response.debug.cnameinsrv //boolean
    response.debug.ipinsrv //boolean
    response.debug.ping //boolean
    response.debug.query //boolean
    response.debug.querymismatch
    response.debug.srv //boolean
    response.hostname //string
    
    
    
    /*     NULL IF SERVER IS OFFLINE     */
    response.motd?.raw //string
    response.motd?.clean //string
    response.motd?.html //string
    response.players?.list //List<String>
    response.players?.max //int
    response.players?.online //int
    response.version //string
    response.protocol //int
    response.icon //string
    response.software //string
    response.plugins?.names //string
    response.plugins?.raw //string
    response.mods?.names //string
    response.mods?.raw //string
    response.map //string
    response.info?.raw //List<String>
    response.info?.clean //List<String>
    response.info?.html //List<String>

```

### For more info visit: https://api.mcsrvstat.us/
