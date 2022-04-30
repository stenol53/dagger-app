package com.abdrakhmanovartem.daggerpapp.utils

import retrofit2.Response
import java.io.IOException

open class ApiException(
    val error: String? = null,
    val errorCode: Int = 0,
    cause: Throwable? = null
) : IOException(error, cause)

class EmptyResultException : ApiException()

fun <T> Response<T>.check(): T {
    val result = this.body()
    if (this.isSuccessful && result != null) {
        return result
    } else if (!this.isSuccessful) {
        throw ApiException()
    } else {
        throw EmptyResultException()
    }
}