public class BasicBook implements Book {
    private String title;
    private String genre; 
    
    public BasicBook(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public String getGenre() {
        return genre;
    }
}
