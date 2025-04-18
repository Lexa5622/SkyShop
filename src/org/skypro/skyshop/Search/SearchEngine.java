package org.skypro.skyshop.Search;

import org.skypro.skyshop.myException.BestResultNotFound;

import java.util.*;

public class SearchEngine {
    private final List<Searchable> searchables;

    public SearchEngine(){
        this.searchables = new ArrayList<>();
    }

    public String search (String text){
        Map<String, Searchable> result = new TreeMap<>();
        int i = 0;
        for (Searchable s: searchables){
            if (s == null){
                break;
            }

            String term = s.searchTerm();
            if (term.contains(text)) {
                result.put(term, s);
                i++;
            }
        }
        return printResult(result);
    }

    public void add (Searchable searchable){
        searchables.add(searchable);
    }

    public String printResult(Map<String, Searchable> result){
        return result.toString();
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
