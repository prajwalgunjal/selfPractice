package com.bridgelabz.practice;

import com.bridgelabz.Addition;

public class LocalStaticInstance {

//static varibale
    // class level variable
static int a;  // static varibale
static int b;  // static variable
static int c;  // ststic varibale

    int d;  // instance varibale
    int e;  // instance variable
    int f;  // instance variable
    public void add(){
        //loacal varibale = inside a method
        System.out.println("using local varibales in instance block ");
        int a=10;
        int b=20;
        int c = a+b;
    }
    public void multiply(){
    System.out.println("using static varibles in instance block");
    c=a+b;
}
public static void div(){
        LocalStaticInstance obj2 = new LocalStaticInstance();
        /// ststic block can directly access static varibale
        int ans2 = a+b;
        int ans = obj2.d+obj2.e;
}
    public static void main(String[] args) {
    LocalStaticInstance obj = new LocalStaticInstance();
        Addition addd = new Addition();
        addd.add();
        int ans= a+b; /// static block can acess static varibale direcctly
        // int ans2=d+e // this will show error cannot access here we have to create object of class then we can access this varibale
        int ans2=obj.d+obj.e;   /// ststic block cannot access instnce varibale
    }
}
