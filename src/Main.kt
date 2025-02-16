import MusicMaster.*

fun main() {
    val songs = mutableListOf(
        Song(title="Disillusioned", artist =  "a perfect circle"),
        Song(title="Stranger",  artist="a perfect circle"),
        Song(title="Blackbird song", artist="Lee DeWyze")
    );
    val playList = PlayList(songs);
    playList.addSong("one", "metallica");
    playList.shuffleSong();
    playList.removeSong("Blackbird song");
    playList.showPlayList();
    playList.playAll();

    val aPerfectCirclePlayList = playList.filterByArtist("perfect circle");
    aPerfectCirclePlayList.showPlayList();
    aPerfectCirclePlayList.removeSong(1)
    aPerfectCirclePlayList.showPlayList();
    aPerfectCirclePlayList.playAll();
}

