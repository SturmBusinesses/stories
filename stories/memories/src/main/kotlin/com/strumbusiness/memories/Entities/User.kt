package com.strumbusiness.memories.entities

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

data class User(
    val name : String,
    val age : Int,
    val type : UserType
    val
) {

}

enum class UserType{
    MemoryKeeper,
    User,
    AllowedViewer,
}