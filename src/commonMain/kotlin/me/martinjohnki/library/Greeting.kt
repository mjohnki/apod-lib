package me.martinjohnki.library


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
