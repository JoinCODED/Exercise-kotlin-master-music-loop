import kotlin.random.Random

fun playAll(songs: MutableList<String>){
    for(song in songs){
        println("Now Playing: $song ")
    }
}

fun addSong(songs: MutableList<String>, songTitle: String){
    songs.add(songTitle)
    println("Added: $songTitle")
}

fun shuffleSongs(songs: MutableList<String>){
    songs.shuffle(Random)
}

fun removeSong(songs: MutableList<String>, songTitle: String) {
    if (songs.contains(songTitle)) {
        songs.remove(songTitle)
        println("Removed: $songTitle")
    } else {
        println("Song not found!")
    }
}

fun findByArtist(songsWithArtists: List<Pair<String, String>>, artistName: String){
    val artistSongs = songsWithArtists.filter { it.second == artistName }.map { it.first }
    println("Songs by $artistName:")
    artistSongs.forEach { println(it) }
}

fun showPlaylist(songs: MutableList<String>) {
    println("Your Playlist:")
    for (song in songs) {
        println(song)
    }
}


//Bonus
fun playAllWithWhile(songs: List<String>) {
    var i = 0
    while (i < songs.size) {
        println("Now playing: ${songs[i]}")
        i++
    }
}
fun sortPlaylist(songs: MutableList<String>) {
    songs.sort()
    println("Playlist Sorted")
}

fun filterSongs(songs: MutableList<String>, filter: String) {
    val filteredSongs = songs.filter { it.contains(filter, ignoreCase = true) }
    println("Filtered playlist (songs containing '$filter'):")
    for (song in filteredSongs)
    {
        println(song)
    }
}


fun  main() {
    val songs = mutableListOf<String>()

    songs.add("Levitating")
    songs.add("Blinding Lights")
    songs.add("Poker Face")

    val songsWithArtists = mutableListOf<Pair<String, String>>(
        Pair("Levitating", "Dua Lipa"),
        Pair("Blinding Lights", "The Weeknd"),
        Pair("Shape of You", "Ed Sheeran")
    )

    playAll(songs)
    addSong(songs, "Rolling in the Deep")
    println("-------------")


    shuffleSongs(songs)
    showPlaylist(songs)
    println("-------------")

    removeSong(songs, "Poker Face")
    showPlaylist(songs)
    println("-------------")

    findByArtist(songsWithArtists, "Dua Lipa")


    println("\n------BONUS-------")
    playAllWithWhile(songs)
    println("-------------")
    sortPlaylist(songs)
    showPlaylist(songs)
    println("-------------")
    filterSongs(songs, "L")



}