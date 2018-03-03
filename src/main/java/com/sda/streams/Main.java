package com.sda.streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jacek", "Kowalski", 18, true);
        Person person2 = new Person("Jacek", "Górski", 15, true);
        Person person3 = new Person("Andżelika", "Dżoli", 25, false);
        Person person4 = new Person("Wanda", "Ibanda", 12, false);
        Person person5 = new Person("Marek", "Marecki", 17, true);
        Person person6 = new Person("Johny", "Brawo", 25, true);
        Person person7 = new Person("Stary", "Pan", 80, true);
        Person person8 = new Person("Newbie", "Noob", 12, true);
        Person person9 = new Person("Newbies", "Sister", 19, false);

        String linia = "abc;def;gha";
        String[] splits = linia.split(";");
        List<String> listSplits = Arrays.asList(splits);

        List<String> languages1 = Arrays.asList("Java;Cobol;Cpp;Lisp".split(";"));
        List<String> languages2 = Arrays.asList("Java;Lisp".split(";"));
        List<String> languages3 = Arrays.asList("Java;Cobol;Cpp;Lisp;C#".split(";"));
        List<String> languages4 = Arrays.asList("C#;C;Cpp".split(";"));
        List<String> languages5 = Arrays.asList("Java;Assembler;Scala;Cobol".split(";"));
        List<String> languages6 = Arrays.asList("Java;Scala".split(";"));
        List<String> languages7 = Arrays.asList("C#;C".split(";"));
        List<String> languages8 = Collections.emptyList();
        List<String> languages9 = Arrays.asList("Java");


        Programmer programmer1 = new Programmer(person1, languages1);
        Programmer programmer2 = new Programmer(person2, languages2);
        Programmer programmer3 = new Programmer(person3, languages3);
        Programmer programmer4 = new Programmer(person4, languages4);
        Programmer programmer5 = new Programmer(person5, languages5);
        Programmer programmer6 = new Programmer(person6, languages6);
        Programmer programmer7 = new Programmer(person7, languages7);
        Programmer programmer8 = new Programmer(person8, languages8);
        Programmer programmer9 = new Programmer(person9, languages9);

        List<Programmer> programmers = new ArrayList<>();
//        programmers.add(programmer1);
//        programmers.add(programmer2);
//        programmers.add(programmer3);
//        programmers.add(programmer4);
//        programmers.add(programmer5);
//        programmers.add(programmer6);
//        programmers.add(programmer7);
//        programmers.add(programmer8);
//        programmers.add(programmer9);

        // ^^ to samo co u góry, ale inaczej
        programmers = new ArrayList<>(Arrays.asList(
                programmer1,
                programmer2,
                programmer3,
                programmer4,
                programmer5,
                programmer6,
                programmer7,
                programmer8,
                programmer9));

        // Sposób 1 - przez wykluczanie/usuwanie:
        List<Programmer> kopia = new ArrayList<>(programmers);
        for (Programmer programmer : programmers) {
            if (!programmer.getPerson().isMezczyzna()) {
                // jeśli nie jest mężczyzną to usuwamy z kopii
                kopia.remove(programmer);
            }
        }

        // Sposób 2 - przez dodawanie
        List<Programmer> kopia2 = new ArrayList<>();
        for (Programmer programmer : programmers) {
            if (programmer.getPerson().isMezczyzna()) {
                // jeśli jest mężczyzną to dodaje go do kopii2
                kopia2.add(programmer);
            }
        }


        // stworzenie anonimowe
//        Predicate<Programmer> predicate = new Predicate<Programmer>() {
//            @Override
//            public boolean test(Programmer XXProgrammer) {
//                String imie = XXProgrammer.getPerson().getImie();
//                boolean isMezczyzna = XXProgrammer.getPerson().isMezczyzna();
//
//                System.out.println(imie + " jest " + isMezczyzna);
//
//                // jeśli true to zostanie zaliczony do kolekcji końcowej
//                return isMezczyzna;
//            }
//        };

        //
//        Predicate<Programmer> predicate = new MaleProgrammerPredicate();
//        Predicate<Programmer> predicate = XXProgrammer -> XXProgrammer.getPerson().isMezczyzna();
//        Predicate<Programmer> predicate = XXProgrammer -> {
//            String imie = XXProgrammer.getPerson().getImie();
//            boolean isMezczyzna = XXProgrammer.getPerson().isMezczyzna();
//
//            System.out.println(imie + " jest " + isMezczyzna);
//            return XXProgrammer.getPerson().isMezczyzna();
//        };


        List<Programmer> wynik = programmers.stream()
                .filter(XXProgrammer -> XXProgrammer.getPerson().isMezczyzna())
                .collect(Collectors.toList());

        System.out.println(wynik);
        wynik.add(new Programmer(null, null));

    }

}
