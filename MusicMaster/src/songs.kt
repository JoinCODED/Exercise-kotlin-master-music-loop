val songs = mutableListOf("OneRepublic - Secrets",
    "Bruno Mars - Locked out of Heaven",
    "Lana Del Rey - Margaret",
    "Jamie Lawson - Wasn't Expecting That" ,
    "Coldplay - Paradise")

fun playAll (songs: List<String>) {
     for (song in songs) {
        println("Now playing: $song")
    }
}
fun addSong (songTitle: String){
  //  var songs: List <String> = songs
    songs.add(songTitle)
}

fun shuffleSong (songs: List<String>) {

    return println(songs.shuffled())
}

fun removeSong (song: String){
    songs.remove(song)
}

fun findByArtists (artists: String) {

     val results = songs.filter { it.contains(artists) }
    if (results.isNotEmpty()) {
        println("$results")
    } else
        println("There is no song in the playlist for $artists")
}

fun showPlayList (songs: List<String>) {
    println(songs)
}