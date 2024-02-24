package edu.eci.cvds.tdd.registry;

import java.util.HashMap;

public class Registry {
    private HashMap<Integer, Person> registrados = new HashMap<>();
    public RegisterResult registerVoter(Person p) {
        return RegisterResult.VALID;
    }
}