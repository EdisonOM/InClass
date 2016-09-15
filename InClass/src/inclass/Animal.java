/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass;

/**
 *
 * @author student
 */
public class Animal {
    private final String mySound;//immutable: cannot be changed
    public Animal(String mySound){
        this.mySound=mySound;
    }
public void speak(){
 System.out.println(this.mySound);
}
}
