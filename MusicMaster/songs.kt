songs.add(songTitle)
println("✅$songTitle has been added to your playlist!")
}
fun shuffleSongs(){
    songs.shuffle()
    println("🔀Songs shuffled!")
}
fun removeSong(songTitle: String){
    if (songs.remove(songTitle)) {
        println("🗑️$songTitle has been removed from the playlist.")
    } else {
        println("❌$songTitle is not in the playlist.")
    }
}
fun findByArtist(artistName: String){
    val results = songs.filter { it.contains(artistName, ignoreCase = true) }
    if (results.isNotEmpty()){
        println("🎤Songs by $artistName : $results")
    } else {
        println("❌No songs found by $artistName")
    }
}
fun showPlaylist () {
    if (songs.isEmpty()) {
        println("📭Your playlist is empty!")
    } else {
        println("🎼Your Playlist: $songs")
    }
}