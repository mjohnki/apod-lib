package de.johnki.apod


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
