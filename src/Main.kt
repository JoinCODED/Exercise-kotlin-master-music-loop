fun main() {
    var songs: MutableList<String>
    songs = mutableListOf("song 1","song 2","song 3","song 4")

    playAll(songs)
    addSong("test", songs)
    showPlaylist(songs)
    shuffleSongs(songs)
    showPlaylist(songs)
    removeSong("test", songs)
    showPlaylist(songs)
}

fun playAll(songs: MutableList<String>) {
    for (song in songs) {
        println("Now playing: $song")
    }
}

fun addSong(songTitle: String, songs: MutableList<String>) {
    songs.add(songTitle)
}

fun shuffleSongs(songs: MutableList<String>) {
    songs.shuffle()
}

fun removeSong(songTitle: String, songs: MutableList<String>) {
    songs.remove(songTitle)
}

 /*
  * The function findByArtist isn't clear,
  * because our songs variable was set to a list and now it asks us to "Searches for songs by the artist's name."
  * so do we have to redoe the whole thing again as a map (key - value pair) or am i missing something?
  */

fun showPlaylist(songs: MutableList<String>) {
    println(songs)
}