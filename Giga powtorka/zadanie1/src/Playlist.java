import java.util.ArrayList;

public class Playlist {
    ArrayList<Piece> piecesList = new ArrayList();
    static int playlistCapacity = 5;
    void addPiece(Piece piece){
        if(piecesList.size() != playlistCapacity){
            piecesList.add(piece);
        }
        else throw new IllegalArgumentException("Lista jest już pełna");
    }

    public void list(){
        for(Piece song : piecesList){
            System.out.println(song);
        }
    }
    public void removeSong(String title){
        for(int i = 0; i < piecesList.size(); i++){
            if(piecesList.get(i).getTitle().equals(title)){
                piecesList.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("nie znaleziono takiej piosenki");
    }
    public void clearList(){
        piecesList.clear();
    }

    public void playlistSize(){
        System.out.println("Playlista ma: "+piecesList.size()+" piosenek");
    }
}
