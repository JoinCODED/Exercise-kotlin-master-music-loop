fun main(){
val songs:MutableList<String> = mutableListOf("Smoke Sprite",
    "Luther","Miss Understood")

    playAll(songs)

    addSong("Marilyn Monroe",songs)
    println("Before Shuffle: $songs")

    shuffleSongs(songs)
    println("After Shuffle: $songs")

    removeSong(songs)
    println("New Playlist: $songs")

    findByArtist("DPR Ian", songs)

    showPlaylist(songs)



}
fun playAll(songs:List<String>){
 for (song in songs){
     println("Now Playing: $songs")
 }
}
fun addSong(songTitle: String, songs: MutableList<String>){
    songs.add(songTitle)
    println("Now Playing: $songTitle")

}
fun shuffleSongs(songs: MutableList<String>){
   songs.shuffle()

}
fun removeSong(songs:MutableList<String>){
    songs.remove("Luther")

}
fun findByArtist(artistName:String, songs:MutableList<String>){
    println("Songs By Artist: $artistName")

}
fun showPlaylist(songs: MutableList<String>) {
    println("Current Playlist: $songs")
}

