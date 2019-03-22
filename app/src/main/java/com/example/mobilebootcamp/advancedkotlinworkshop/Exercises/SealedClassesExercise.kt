package com.example.mobilebootcamp.advancedkotlinworkshop.Exercises

sealed class Response
// Data classes are classes whose main purpose is to hold data/state
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

    // TODO 2.1 Print content and error message when response is success or failure respectively


}
