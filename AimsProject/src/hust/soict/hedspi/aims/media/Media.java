package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Media>,Cloneable{
    private String title;
    private String category;
    private float cost;
    private int id;
    

    Media(String title) {
        this.title = title;
    }

    Media(String title, String category) {
        this(title);
        this.category = category;
    }
    
    Media(String title,String category,float cost){
    	this(title,category);
    	this.cost = cost;
    }


	public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return " [title=" + title + ", category=" + category + ", cost=" + cost + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Media o) {
		
		return this.title.compareTo(o.getTitle());
	}
	
	
}