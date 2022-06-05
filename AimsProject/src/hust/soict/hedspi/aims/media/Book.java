package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(String title,String category,float cost, List<String> authors) {
        super(title, category,cost);
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName))
            System.out.println("Author's name is exist");
        else
            authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        if (!authors.contains(authorName))
            System.out.println("Author is not exist!");
        else
            authors.remove(authorName);
    }

	@Override
	public String toString() {
		return "Book:" + super.toString() + "[authors=" + authors + "]";
	}

    
}

