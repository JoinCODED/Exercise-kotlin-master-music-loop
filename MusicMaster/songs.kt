fun main(){
    val songs: MutableList<String> = mutableListOf()
    songs.add("Song 1")
    songs.add("Song 2")
    songs.add("Song 3")
    songs.add("Song 4")
    songs.add("Song 5")
    songs.add("Song 6")
    songs.add("Song 7")
    songs.add("Song 8")
    songs.add("Song 9")
    songs.add("Song 10")
    addSong(songs, "Song 11")
    removeSong(songs, "Song 5")
    songs.shuffle()

    playAll(songs)


}
fun playAll(songs: MutableList<String>){
    for (i in 0..songs.size - 1){
        println("Now playing: ${songs[i]}")
    }
    println("Done Playing ${songs.size} songs.")
}
fun addSong(songs: MutableList<String>, songName: String){
    songs.add(songName)
}
fun removeSong(songs: MutableList<String>, songName: String) {
    if (songs.remove(songName)) {
        println("Removed: $songName")
    } else {
        println("Song not found: $songName")
    }
}

fun shuffleSongs(songs: MutableList<String>){
    songs.shuffle()
}
fun showPlaylist(songs: MutableList<String>){
    println("Playlist:")
    for (i in 0..songs.size - 1){
        println("${songs[i]}")
    }

}

