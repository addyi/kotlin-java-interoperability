package org.example.jinterface


class KotlinImplForJavaInterface : JavaServiceInterface {
    override fun doSomething(input: String?): String? {
        return "$input from KotlinImplForJavaInterface"
    }
}
