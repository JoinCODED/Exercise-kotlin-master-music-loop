import MusicMaster.songs;

fun main() {
    addSong("disillusioned - a perfect circle", songs);
    addSong("stranger - a perfect circle", songs);
    addSong("blackbird song - Lee DeWyze", songs);
    shuffleSong(songs)
    playAll(songs);

}

val playAll = { songs: MutableList<String> -> songs.forEach { println(it) }};
val addSong = { song: String, playlist: MutableList<String> -> playlist.add(song) }
val shuffleSong = { playList: MutableList<String> ->  playList.shuffle() }