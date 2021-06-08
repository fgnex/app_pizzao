package com.cardosomarcos.origininhos.web.controller;

import com.cardosomarcos.origininhos.web.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import com.cardosomarcos.origininhos.web.model.User
import java.util.*

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/user/{userId}")
    suspend fun getUser(@PathVariable("userId") userId: UUID): User {
        return userService.getUser(userId)
    }
}