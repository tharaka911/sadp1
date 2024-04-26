/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nawwa
 */
public class B {

    public static void main(String[] args) {
        A.hello();
        
        //onetime usage 
        new A().hi();
        
        //manytime usage
        A x = new A();
        x.hi();

    }

}
