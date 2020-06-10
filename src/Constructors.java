/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dram-
 */
public class Constructors {
    String fname,Sname ;
    Constructors(){
        System.out.println("Constructors!!!!!!");
    }
    Constructors(String fname,String Sname){
        this.fname = fname;
        this.Sname = Sname;
        System.out.println(this.show());
    }
    String show(){
        return "Your name : "+this.fname+" "+this.Sname;
    }
}
