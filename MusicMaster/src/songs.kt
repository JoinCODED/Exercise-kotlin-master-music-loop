fun main() {
    var songs= mutableListOf<String>()

    songs.addAll(mutableListOf("Nothing Else Matters, by: Metallica", "Master of Puppets, by: Metallica ", "Enter Sandman, by: Metallica"))
    println(songs)

    fun playAll(songs: MutableList<String>) {
        for (song in songs){
            println("Now playing: $song")
        }
    }
    playAll(songs)

    fun addSong(song: String) {
        songs.add(song)
    }
    addSong("Am I Evil?, by: Metallica")
    println(songs)

    fun shuffleSongs(songs: MutableList<String>) {
        songs.shuffle()
    }

    shuffleSongs(songs)
    println(songs)

    fun removeSong(song: String) {
        val removedList: List<String> = songs.filter{it.contains(song, ignoreCase = true)}
        if (removedList.isNotEmpty()) {
            println("Removed: $song from your play list")}
        else println("$song does not exist in your play list")
    }
    removeSong("Enter Sandman")

    fun findByArtist(artist: String) {
        val filteredList: List<String> = songs.filter{it.contains(artist, ignoreCase = true)}
        if (filteredList.isNotEmpty()) {
            println("Songs by $artist in your play list: $songs")
        } else {
            println("No songs found by $artist")
        }
    }
    findByArtist("metallica")

    fun showPlaylist(songs: List<String>) {
        if(songs.isNotEmpty()) println("Play list: $songs")
        else println("Your play list is empty! start adding songs now")
    }

    showPlaylist(songs)


}