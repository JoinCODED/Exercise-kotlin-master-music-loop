package MusicMaster

val songs = mutableListOf(
    "Agora Hills",
    "Am I Dreaming",
    "Creepin'",
    "All The Stars",
    "Closer"
)

fun playAll(songs: MutableList<String>) {
    for (song in songs) {
        println("Now playing: $song")
    }
}

fun addSong(songTitle: String) {
    songs.add(songTitle)
}

fun shuffleSongs() {
    songs.shuffled()
}

fun removeSong(songTitle: String) {
    songs.remove(songTitle)
}

fun showPlaylist() {
    println("Playlist: $songs")
}

fun main() {
}