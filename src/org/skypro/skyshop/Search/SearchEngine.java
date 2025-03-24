package org.skypro.skyshop.Search;

import org.skypro.skyshop.myException.BestResultNotFound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchEngine {
    private final List<Searchable> searchables;

    public SearchEngine(){
        this.searchables = new ArrayList<>();
    }

    public String search (String text){
        List<Searchable> result = new ArrayList<>();
        int i = 0;
        for (Searchable s: searchables){
            if (s == null){
                break;
            }

            String term = s.searchTerm();
            if (term.contains(text)) {
                result.add(s);
                i++;
            }
        }
        return printResult(result);
    }

    public void add (Searchable searchable){
        searchables.add(searchable);
    }

    public String printResult(List<Searchable> searchable){
        StringBuilder s = new StringBuilder();
        for (Searchable search: searchable){
            if (search != null){
                s.append(search).append('\n');
            }
        }
        return s.toString();

    }

    public Searchable bestSearchByTerm (String substr) throws BestResultNotFound {
        int match = 0;
        Searchable searchable = null;
        for (Searchable search: searchables) {
            if(search == null){
                continue;
            }
            int countMatch = search.getSearchTerm(search.searchTerm(), substr);
            if (match < countMatch) {
                match = countMatch;
                searchable = search;
            }
        }
        if (searchable == null){
            throw new BestResultNotFound("Для запроса " + substr + " совпадений не найдено.");
        }
        return searchable;
    }
}
