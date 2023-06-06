public class Main {
    public static void main(String[] args) {
        Piece piece1 = new Piece("taktak", "krystian", 200);
        Piece piece2 = new Piece("nienie", "marcin", 220);
        Piece piece3 = new Piece("yyyyyy", "kamil", 210);

        Playlist songList = new Playlist();
        songList.addPiece(piece1);
        songList.addPiece(piece2);
        songList.addPiece(piece3);

        songList.list();
        songList.playlistSize();

        System.out.println("================================");

        songList.removeSong("nienie");
        songList.list();

        System.out.println("================================");

        songList.clearList();
        songList.list();
    }
}