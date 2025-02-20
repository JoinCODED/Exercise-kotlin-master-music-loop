package MusicMaster

fun main() {
    val songs: MutableList<String> = mutableListOf("Euphoria", "Snooze", "Luther")

    addSong(songs, "In my room")
    shuffleSongs(songs)
    removeSong(songs, "Euphoria")
    playAll(songs)
    val artistSongs = findByArtist(songs, "Luther")
    val playlist = showPlaylist(songs)
}

fun playAll(songs: List<String>) {
    for (song in songs) {
        println("Now playing: $song")
    }
}
fun addSong(songs: MutableList<String>, songTitle: String) {
    songs.add(songTitle)
}

fun shuffleSongs(songs: MutableList<String>) {
    songs.shuffle()
}

fun removeSong(songs: MutableList<String>, songTitle: String) {
    songs.remove(songTitle)
}

fun findByArtist(songs: List<String>, artistName: String): List<String> {
    return songs.filter { it.contains(artistName, ignoreCase = true) }
}

fun showPlaylist(songs: List<String>) {
    println ("Playlist:")
    songs.forEach { println("- $it") }
}