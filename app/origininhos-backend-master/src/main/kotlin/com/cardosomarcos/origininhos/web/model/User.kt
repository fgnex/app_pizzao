package com.cardosomarcos.origininhos.web.model

import java.util.*

data class User(
        val id: UUID,
        val name: String,
        val email: String
)