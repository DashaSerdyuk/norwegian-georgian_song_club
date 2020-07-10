package com.justai.jaicf.template

import com.justai.jaicf.channel.http.httpBotRouting
import com.justai.jaicf.channel.yandexalice.AliceChannel
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    embeddedServer(Netty,  8080) {
        routing {
            httpBotRouting("/" to AliceChannel(templateBot, useDataStorage = true))
        }
    }.start(wait = true)
}