public class FanClubBook extends BookDecorator {
    private String memberName;
    
    public FanClubBook(Book book, String memberName) {
        super(book);
        this.memberName = memberName;
    }
    
    @Override
    public String getTitle() {
        String title = super.getTitle();
        if (memberName != null) {
            title += " (Fan Club member: " + memberName + ")";
        }
        return title;
    }

    public String getMemberName() {
        return memberName;
    }
}