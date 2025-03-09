package org.skypro.skyshop.Search;

public interface Searchable {
    String searchTerm();
    String searchContent();

    default String getStringRepresentation(Searchable searchable){
        return searchable.searchTerm() + searchable.searchContent();
    }

}
