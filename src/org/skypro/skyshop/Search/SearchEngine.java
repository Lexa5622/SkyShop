package org.skypro.skyshop.Search;

import java.util.Arrays;

public class SearchEngine {
    private Searchable[] searchables;
    private int count;

    public SearchEngine(int size){
        this.searchables = new Searchable[size];
        count = 0;
    }

    public String search (String text){
        Searchable[] result = new Searchable[5];
        int i = 0;
        for (Searchable s: searchables){
            if (s == null){
                break;
            }
            if (i == result.length){
                return "Мест нет";
            }
            String term = s.searchTerm();
            if (term.contains(text)) {
                result[i] = s;
                i++;
            }
        }
        return printResult(result);
    }

    public void add (Searchable searchable){
        if (count == searchables.length) {
            System.out.println("Нет места");
            return;
        }
        searchables[count] = searchable;
        count++;
    }

    public String printResult(Searchable[] searchable){
        StringBuilder s = new StringBuilder();
        for (Searchable search: searchable){
            if (search != null){
                s.append(search).append('\n');
            }
        }
        return s.toString();

    }
}
