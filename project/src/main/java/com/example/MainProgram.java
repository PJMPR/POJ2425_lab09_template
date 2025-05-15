package com.example;

import com.example.patterns.ThreadExample;

public class MainProgram {

    public static void main(String[] args){

        /**
         * Utwórz klasę "DictionaryValue"
         * która posiada pola:
         * - id
         * - intKey
         * - stringKey
         * - name
         * - value
         * Do wszystkich pola nalezy utworzyć gettery i settery, oraz odpowiednie zestawy konstruktorów
         */
//        DictionaryValue dictionaryValue = new DictionaryValue(1,2,"tst","nazwa slownika", "wartosc slownika");

        /**
         * Utwórz klasę "DictionaryFileReader"
         * której zadaniem będzie odczytanie danych z pliku
         * 'resources/dictionaries.csv'
         */
//        DictionaryFileReader reader = new DictionaryFileReader("src/main/resources/dictionaries.csv");

        /**
         * dodaj metodę getRawFileData() która
         * zwróci w postaci Stringa wartość pliku z danymi.
         * zapoznaj się z https://www.baeldung.com/reading-file-in-java
         * rozdział 3.2 (drugi przykład korzystając z klasy FileInputStream)
         * lub rozdziały kolejne (4,5,6)
         */

//        try {
//            System.out.println(reader.getRawFileData());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /**
         * Do klasy 'DictionaryFileReader' dodaj metodę
         * o nazwie 'getDictionaryValues()',
         * która zwróci w postaci listy
         * wszystkie dane słownikowe zapisane w pliku
         */

//        List<DictionaryValue> dictionaryValues = reader.getDictionaryValues();

        /**
         * Utwórz klasę 'DictionaryCache'
         * która będzie zaimplementowana według wzorca Singleton (przykład poniżej)
         * i będzie przechowywać dane z pliku w pamięci procesu
         */
//        DictionaryCache dictionaryCache = DictionaryCache.getInstance();
//        dictionaryCache.setItems(dictionaryValues);

        /**
         * Napisz klasę "DictionaryCacheRefresher",
         * która będzie dziedziczyć po klasie Thread,
         * któa w metodzie 'run' co jakiś odstęp czasu (np. 1 minutę)
         * odświeży dane w Cachu i wypisze na konsoli ilość danych załadowanych z pliku.
         * Spróbuj podczas działania programu zmienić dane w pliku (np usuwając/dodając jeden wiersz)
         */

//        DictionaryCacheRefresher refresher = new DictionaryCacheRefresher();
//        refresher.start();

    }

}

