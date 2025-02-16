import kotlin.random.Random

fun main() {
    addSong("Bohemian Rhapsody - Queen")
    addSong("Shape of You - Ed Sheeran")
    addSong("Blinding Lights - The Weeknd")
    addSong("Someone Like You - Adele")
    addSong("Believer - Imagine Dragons")

    showPlaylist()
    println()

    playAll()
    println()

    shuffleSongs()
    println("Shuffled Playlist:")
    showPlaylist()
    println()

    removeSong("Believer - Imagine Dragons")
    println("After Removing a Song:")
    showPlaylist()
}



var songs = mutableListOf<String>()

fun playAll() {
    for (song in songs) {
        println("Now playing: "+song)
    }
}

fun addSong(songTitle: String) {
    songs.add(songTitle)
}

fun shuffleSongs() {
    songs.shuffle()
}

fun removeSong(songTitle: String) {
    songs.remove(songTitle)
}

fun showPlaylist() {
    println("Playlist:")
    for (song in songs) {
        println(song)
    }
}

