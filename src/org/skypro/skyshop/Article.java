package org.skypro.skyshop;

import org.skypro.skyshop.Search.Searchable;

public class Article implements Searchable {
    private final String TYPE = "ARTICLE";
    private String title;
    private String text;

    public Article(String title, String text){
        this.title = title;
        this.text = text;
    }
    public String searchContent(){
        return TYPE;
    }
    public String searchTerm(){
        return this.toString();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Article otherArticle = (Article) obj;
        return title.equals(otherArticle.title);
    }

    @Override
    public String toString() {
        return title + '\n' + text;
    }

}
