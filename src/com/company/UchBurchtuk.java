package com.company;

public class UchBurchtuk {
    int a;
    int b;
    int c;


    void area(){
        // kee bir uchurda berilgen san menen uch burchtuk tuzso bolboit
        // misaly 5 4 12 degen sandar menen 3 burchtu tuzulboit. oshonuchun if tekchergich koiuldu

        if (a+b<c || a+c<b || b+c<a){
            System.out.println("Myndai uch burchtuk bolushu munkun emes!");
        }else{
            double s = (a+b+c)/2d;
            double are = Math.sqrt(s*(s-a)*(s-b)*(s-c) );

            System.out.println("Area of triangle with side "+a+", "+ b+", "+c+ " is " + are+"!");

        }


    }

}
