package com.mcnamara.lab1;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Kaila is the queen bee!");
        //give_me_a_number();
        //give_me_three_integers();
        //get_random_name(10);
        //get_random_name(give_me_an_integer());

        Species s = new Species();
        s.getRandomAnimal();

    }

    private static void give_me_a_number(){
        System.out.println(Math.random()*100);
    }

    private static void give_me_three_integers(){
        for(int i =1; i<4; i++){
            int randomInt = (int)(100.0 * Math.random());
            System.out.println("pseudo random int between 1 and 100 : " + randomInt );
        }
    }

    private static int give_me_an_integer(){
            int randomInt = (int)(10.0 * Math.random());
        return randomInt;
    }

    private static void get_random_name(int number){
        if(number==1){
            System.out.println("Kaila");
        }
        if(number==2){
            System.out.println("Kayla");
        }
        if(number==3){
            System.out.println("Keyla");
        }
        if(number==4){
            System.out.println("Ashley");
        }
        if(number==5){
            System.out.println("Theresa");
        }
        if(number==6){
            System.out.println("Ben");
        }
        if(number==7){
            System.out.println("Jack");
        }
        if(number==8){
            System.out.println("Kevin");
        }
        if(number==9){
            System.out.println("Bill");
        }
        if(number==10){
            System.out.println("Louise");
        }
    }
}
