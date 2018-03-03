package com.sda.streams;

import java.util.function.Predicate;

public class MaleProgrammerPredicate implements Predicate<Programmer> {
    @Override
    public boolean test(Programmer XXProgrammer) {
        String imie = XXProgrammer.getPerson().getImie();
        boolean isMezczyzna = XXProgrammer.getPerson().isMezczyzna();

        System.out.println(imie + " jest " + isMezczyzna);

        // jeśli true to zostanie zaliczony do kolekcji końcowej
        return isMezczyzna;
    }
}
