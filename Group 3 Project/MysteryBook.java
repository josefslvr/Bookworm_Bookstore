public class MysteryBook implements Book {
    @Override
    public String getGenre() {
        return "Mystery";
    }
    
    @Override
    public String getTitle() {
        return "Mysterious Book";
    }
}