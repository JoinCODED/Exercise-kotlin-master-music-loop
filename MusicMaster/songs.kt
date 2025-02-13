val songs =  mutableListOf<String>()
fun  main(){
    songs.add("Stronger - Kanye West")
    songs.add("Can't Tell Me Nothing - Kanye West")
    songs.add("I Wonder - Kanye West")
    songs.add("Flashing Lights - Kanye West")
    addSong("God's Plan - Drake")
    showPlaylist(songs)
    shuffleSongs(songs)
    showPlaylist(songs)
    removeSong("Stronger - Kanye West")
    playAll(songs)
    findByArtist("kanye")
    findByArtist("Drake")
}
fun playAll(songs: MutableList<String>){
    for (song in songs)
        println("Now playing: $song")
}
fun addSong(songTitle: String){ songs.add(songTitle) }
fun shuffleSongs(songs: MutableList<String>){ songs.shuffle() }
fun removeSong(songToBeRemoved: String){songs.remove(songToBeRemoved)}
fun findByArtist(artistName: String){
    val artistsongs = songs.filter { it.contains(artistName, ignoreCase = true) }
    if(!artistsongs.isEmpty()) {
        println("$artistName has these in your playlist: ")
        for (artistSong in artistsongs){
            println(artistSong)
        }
        println("")
    }
    else
        println("No songs by $artistName")
}
fun showPlaylist(songs: MutableList<String>){
    println(songs)
}
