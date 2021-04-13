package com.skynamo.myfirstkmm.sharedKMM


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
