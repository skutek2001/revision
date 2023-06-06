public class Piece {
    private String title;
    private String artist;
    private int length;

    Piece(String title, String artist, int length){
        titleChecker(title);
        this.artist = artist;
        this.length = length;
    }

    public void titleChecker(String title) {
        if(title.matches("^\\w+$") && !title.equals(null)){
            this.title = title;
        }
        else throw new IllegalArgumentException("Podano nie właściwy tytuł");
    }

    @Override
    public String toString(){
        return "Title: " + title + "\nArtist: " + artist + "\nLength: " + length + "\n";
    }

    public String getTitle(){
        return title;
    }
}
