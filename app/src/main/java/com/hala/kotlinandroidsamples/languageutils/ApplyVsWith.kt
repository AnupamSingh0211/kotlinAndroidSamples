package com.hala.kotlinandroidsamples.languageutils

/**
 * @author  anupamsingh
 * @version 1.0
 * @since 26/06/18
 */

fun getUser(): UserInfo {
    return UserInfo().apply {
        name = "Anupam Singh"
        age = 26
    }
}

fun getPersonFromUser(user: UserInfo): UserInfo {
    return with(user) {
        val userInfo = UserInfo()
        userInfo
    }
}


//There are mainly two differences:
//
//apply accepts an instance as the receiver while with requires an instance to be passed as an argument. In both cases the instance will become this within a block.
//apply returns the receiver and with returns a result of the last expression within its block.
//Usually you use apply when you need to do something with an object and return it. And when you need to perform some operations on an object and return some other object you can use with.