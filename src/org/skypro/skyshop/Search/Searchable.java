package org.skypro.skyshop.Search;

public interface Searchable {
    String searchTerm();
    String searchContent();

    default String getStringRepresentation(Searchable searchable){
        return searchable.searchTerm() + searchable.searchContent();
    }

    default int getSearchTerm(String str, String substr){
        int count = 0;
        int index = 0;
        int indexSubstr = str.indexOf(substr, index);
        while (indexSubstr != -1) {
            count++;
            index = indexSubstr + substr.length();
            indexSubstr = str.indexOf(substr, index);
        }
        return count;
    }

}
