package com.cardosomarcos.origininhos.web.service

import org.springframework.stereotype.Service
import com.cardosomarcos.origininhos.web.model.User
import java.util.*

@Service
class UserService() {
    suspend fun getUser(userId: UUID): User {
        return User(userId, "marcos", "r@b.com")
    }
}