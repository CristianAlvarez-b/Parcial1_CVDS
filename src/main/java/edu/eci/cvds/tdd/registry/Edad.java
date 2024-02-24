package edu.eci.cvds.tdd.registry;

public class Edad {
    public static boolean edad(int p) throws Exception {
        if(p < 0){
            throw new Exception("Edad Invalida.");
        }
        if (p >= 0 && p < 18){
            return true;
        }else{
            return false;
        }
    }
}

