package org.example.kinterface;

import org.jetbrains.annotations.NotNull;

public class JavaImplForKotlinInterface implements KotlinServiceInterface {
    @NotNull
    @Override
    public String doSomething() {
        // return null;
        return "Do something from java impl with kotlin interface";
    }
}
