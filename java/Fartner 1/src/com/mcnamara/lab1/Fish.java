package com.mcnamara.lab1;
// from max: you can make a higher class called "animal" or something and have each of these species of animals
// extend itself off of it. I think the syntax is like "public class Fish extends animal" or something idr
public class Fish {
    public String barracuda(){
        boolean salt = true;
        boolean predatory = true;
        String color = "blue-gray";
        boolean exoskeleton = false;
        String tell_me_about= "Color="+color+" Exists in Saltwater="+salt+" Is it a predator="+predatory+ " Does it have and exoskeleton="+exoskeleton;
        return tell_me_about;
    }

    public String mantis_shrimp(){
        boolean salt = true;
        boolean predatory = true;
        String color = "blue-?";
        boolean exoskeleton = true;
        String tell_me_about= "color="+color+" Exists in Saltwater="+salt+" Is it a predator="+predatory+ "Does it have an exoskeleton"+exoskeleton;
        return tell_me_about;
    }
}
