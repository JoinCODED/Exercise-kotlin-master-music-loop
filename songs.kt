var songs = mutableListOf<String>()
fun main(){
    //2
    val songs : MutableList<String> = mutableListOf()
    songs.add("Die with me - Bruno Mars")
    songs.add("Ensan Akthar - Abdulmajeed Abdullah")
    songs.add("Gedar - Balqees")
    songs.add("set fire to the rain - Adele")
    println(songs)
    //3
    playAll(songs)
    //4
    println(addSong(songs,"ana blayak - Majid Almuhandis"))




    println(removeSong(songs, "Die with me - Bruno Mars"))
    findByArtist(songs, "Adele")
    println(showPlaylist(songs))



}

//3
fun playAll(songs: MutableList<String>){
    for (songTitle in songs )
        println("Now playing: $songTitle")
}

//4
fun addSong(songs: MutableList<String>, songTitle: String) {
    songs.add(songTitle)
    println(songTitle)
}
//5
fun shuffleSongs(songs: MutableList<String>){
    songs.shuffle()
}



fun removeSong(songs: MutableList<String>, songTitle: String) {
    if (songs.contains(songTitle)) {
        songs.remove(songTitle)

    }
}
fun findByArtist(songs: MutableList<String>,artistName: String) {
    val artistNameresult = songs.filter { it.contains(artistName) }
    if (artistNameresult.isNotEmpty()) {
        for (song in artistNameresult) {
            println(song)
        }

    }


}
fun showPlaylist(songs: MutableList<String>) {
    println(songs)
}



