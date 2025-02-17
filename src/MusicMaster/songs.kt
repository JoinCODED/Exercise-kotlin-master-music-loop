fun main() {
    val songList = mutableListOf("Bleed","Memento Mori","From the Start")
    playAll(songList)
    println("--------")

    fun addSong(songTitle: String) {
        songList.add(songTitle)
    }
    addSong("Enter Sandman")
    playAll(songList)
    println("--------")

    fun shuffleSongs() {
        songList.shuffle()
    }
    shuffleSongs()
    playAll(songList)
    println("--------")

    fun removeSong(songTitle: String) {
        if (songList.remove(songTitle)) {
            println("$songTitle removed from the playlist.")
        } else {
            println("$songTitle not found in the playlist.")
        }
    }
    removeSong("Bleed")
    println("--------")


    fun showPlaylist() {
        println("Current Playlist:")
        songList.forEachIndexed { index, song -> println("${index + 1}. $song") }
    }
    showPlaylist()

}
fun playAll(songs: List<String>) {
    for( song in songs){
        println("Now playing: $song")
    }
}
