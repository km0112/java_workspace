package com.mcnamara.lab1;

import com.mcnamara.lab1.Fish;

public class Species {
    public void getRandomAnimal(){
        int num=give_me_an_integer();

        switch(num){
            case 1: getFish();
                break;
            case 2: getBird();
                break;
            case 3: getMammals();
                break;
            default: catchThis();
                break;

        }

    }

    public void getFish(){
        Fish f = new Fish();
        String Describe= f.mantis_shrimp();
        System.out.println("This is a mantis shrimp: "+ Describe);
    }

    public void getBird(){
        Birds f = new Birds();
        String Describe= f.oreal();
        System.out.println("This is a mantis shrimp: "+ Describe);
    }

    public void getMammals(){
        Mammals f = new Mammals();
        String Describe= f.wolf();
        System.out.println("This is a wolf: "+ Describe);
    }

    // utility section
    private static int give_me_an_integer(){
        int randomInt = (int)(4.0 * Math.random());
        System.out.println("guess number-------->"+randomInt);
        return randomInt;
    }

    private void catchThis(){
        System.out.println("end of the line");

    }

}
