package com.lyc.epidemiccontrol.net.repository

import com.lyc.epidemiccontrol.net.network.SystemNetWork

object SystemRepository {

    suspend fun loginRequest(map: Map<String, String>) = SystemNetWork.login(map)

    suspend fun registerRequest(map: Map<String, String>) = SystemNetWork.register(map)

}