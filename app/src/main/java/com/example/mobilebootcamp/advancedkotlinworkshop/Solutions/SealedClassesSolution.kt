package com.example.mobilebootcamp.advancedkotlinworkshop.Solutions

sealed class Response
data class Success(val content: String) : Response()
data class Failure(val code: Int, val errorMessage: String) : Response()

fun getUrl(url: String): Response {
    if (url.contains("realestate.com.au")) {
        return Success("Load Url")
    } else {
        return Failure(404, "Page not found")
    }
}

fun main() {
    val response: Response = getUrl("something.realestate.com.au")

    when (response) {
        is Success -> println(response.content)
        is Failure -> println(response.errorMessage)
    }
}
