import kotlin.random.Random

fun main() {
    val songs: MutableList<String> = mutableListOf() //empty list

    fun addSong(song: String) {
        songs.add(song)
    }

    fun playAll(songs: List<String>) {
        for (song in songs) {
            println("Now playing: $song")
        }
    }

    fun shuffleSongs() {
        songs.shuffle(Random)
    }

    fun removeSong(song: String) {
        if (songs.remove(song)) {
            println("Removed: $song")
        } else {
            println("Song not found: $song")
        }
    }

    fun findByArtist(artist: String) {
        val artistMatch = songs.filter { it.contains(artist, ignoreCase = true) }
        if (artistMatch.isEmpty()) {
            println("No songs found for $artist")
        } else {
            println("\nSongs by $artist:")
            artistMatch.forEach { println(it) }
        }
    }

    fun showPlaylist() {
        println("Playlist:")
        if (songs.isEmpty()) {
            println("No songs in the playlist.")
        } else {
            songs.forEach { println(it) }
        }
    }

    addSong("Purple Rain by Prince")
    addSong("Wildflower by The Cult")
    addSong("Chasing Pavements by Adele")

    showPlaylist()
    println()
    playAll(songs)
    println()
    shuffleSongs()

    println("Shuffled Playlist:")
    playAll(songs)
    println()

    removeSong("Purple Rain by Prince")
    showPlaylist()
    println()

    println("Songs by Adele:")
    findByArtist("Adele")
    println()
    println("Songs by Prince:") //removed
    findByArtist("Prince")
}
/* Bonus
fun showPlaylist() {
    println("Playlist:")
    if (songs.isEmpty()) {
        println("No songs in the playlist.")
    } else {
        var i = 0
        while (i < songs.size) { //iterate through list
            println(songs[i])
            i++
        }
    }
}
*/

/*
fun findByArtist(artist: String) {
    val artistMatch = songs.filter { it.contains(artist) }
    if (artistMatch.isEmpty()) {
        println("No songs found for $artist")
    } else {
        var i = 0
        do {
            println(artistMatch[i])
            i++
        } while (i < artistMatch.size)
    }
}
 */

/*
fun sortPlaylist() {
    songs.sort() //alphabetically
    println("Sorted Playlist:")
    songs.forEach { println(it) }
}
 */

/*
fun filterSongs(keyword: String) {
    val filteredSongs = songs.filter { it.contains(keyword, ignoreCase = true) }
    if (filteredSongs.isEmpty()) {
        println("No songs found containing \"$keyword\"")
    } else {
        println("Songs containing \"$keyword\":")
        filteredSongs.forEach { println(it) }
    }
}
 */