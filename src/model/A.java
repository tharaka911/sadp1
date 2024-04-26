/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nawwa
 */
public class A {

    public static void main(String[] args) {

        System.out.println("Main Method invoked");

        new A().hi();
        A.hello();

    }

    public static void hello() {
        System.out.println("hello form static method");

    }

    public void hi() {
        System.out.println("hi form instance method");

    }

}
