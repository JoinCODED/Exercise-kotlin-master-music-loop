package MusicMaster

fun main() {
    val songs = mutableListOf<String>();
    songs.add("The Poet and the Mus");
    songs.add("Brave Shine");
    songs.add("SPECIALZ");
    songs.add("Anytime Anywhere");
    songs.add("The Peak");
    songs.add("Life is Like a Boat");
    addSong(songs, "Blaze Away");
    shuffleSongs(songs);
    playAll(songs);

}

fun playAll(songs: List<String>) {
    for (song in songs) {
        println("Now Playing: $song");
    }
}

fun addSong(songs: MutableList<String>, song: String) {
    songs.add(song);
    println("Added new song: $song");
}

fun shuffleSongs(songs: MutableList<String>) {
    songs.shuffle();
}

fun removeSong(songs: MutableList<String>, song: String) {
    songs.remove(song);
}

fun findByArtist(songs: List<String>, artist: String) {
    for (song in songs) {
        if (song.contains(artist)) {
            println("found $song");
        }
    }
}

fun showPlaylist(songs: List<String>) {
    println("your playlist:");
    for (song in songs) {
        println(song);
    }
}