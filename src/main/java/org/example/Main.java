package org.example;

import org.example.accessor.CalenderDemoKt;
import org.example.accessor.Customer;
import org.example.jinterface.JavaServiceInterface;
import org.example.jinterface.KotlinImplForJavaInterface;
import org.example.kinterface.JavaImplForKotlinInterface;
import org.example.kinterface.KotlinServiceInterface;
import org.example.sealed.UiState;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println("### KOTLIN SEALED CLASS ###");

        var loading = UiState.Loading.INSTANCE;
        var success = new UiState.Success("Success message", 1);
        var error = new UiState.Error("Error message");

        System.out.println(loading);
        System.out.println(success);
        System.out.println(success.getData());
        System.out.println(error);

        System.out.println("### JAVA INTERFACE ###");

        JavaServiceInterface javaInterface = new KotlinImplForJavaInterface();

        var resFromDoSomething = javaInterface.doSomething("Hello");
        System.out.println(resFromDoSomething);

        System.out.println("### KOTLIN INTERFACE ###");

        KotlinServiceInterface kotlinInterface = new JavaImplForKotlinInterface();

        var resFromDoSomethingElse = kotlinInterface.doSomething();
        System.out.println(resFromDoSomethingElse);

        System.out.println("### GETTER/SETTER ###");

        var customer = new Customer("John Doe");

        System.out.println(customer.getName());
        customer.setName("Jane Doe");
        System.out.println(customer.getName());
        customer.placeOrder();

        System.out.println("### Top-level function ###");

        CalenderDemoKt.calendarDemo();


    }
}
