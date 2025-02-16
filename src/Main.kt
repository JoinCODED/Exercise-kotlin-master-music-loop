// Step 2: Crafting Your Song List
val songs: MutableList<String> =  mutableListOf(
    "Bohemian Rhapsody",
    "Hotel California",
    "Imagine",
    "Shape of You",
    "Billie Jean")
// Step 3: Exploring Loop Magic
fun playAll(songs: List<String>) {
    for (song in songs) {
        println("Now playing $song")
    }
}
// Step 4: Mastering the Playlist
fun addSong(song: String) {
    songs.add(song)
}
// Step 5: Feeling Shuffle-y?
fun shuffleSongs() {
    songs.shuffle()
}
//Step 6: Get Creative with Your Music!
fun removeSong(song: String) {
    songs.removeAt(songs.indexOf(song))
}

//fun findByArtist(artistName: String) {
//
//    println("Searching for songs by: $artistName ")
//}

// need some changes for the code that the upper steps didn't ask us to do

fun showPlaylist(songs: List<String>) {
    println("Your Playlist:")
    for (song in songs) {
        println("- $song")
    }
}

fun main() {
    playAll(songs)
    addSong("Smells Like Teen Spirit")
    println("////////////////////////////")
    shuffleSongs()
    playAll(songs)
    println("////////////////////////////")
    removeSong("Smells Like Teen Spirit")
    playAll(songs)
    showPlaylist(songs)

}