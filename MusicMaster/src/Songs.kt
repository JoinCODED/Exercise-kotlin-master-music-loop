fun main(){
    var songs = mutableListOf("Slipping through my fingers by ABBA","Instant Crush by Daft Punk", "Lonely by Akon")
    playAll(songs)
    println("---------------------------")
    addSong(songs)
    println("A new song has been added: $songs")
    println("---------------------------")
    println("Shuffle mode activated")
    shuffleSongs(songs)
    println("---------------------------")
    println(showPlaylist(songs))
}

fun playAll(songs: MutableList<String>){
    for (song in songs ){
        println("Now playing: $song")
    }
}

fun addSong(songs: MutableList<String>){
    songs.add("I feel it coming by The Weeknd")
}

fun shuffleSongs(songs: MutableList<String>){
    songs.shuffle()
    for (song in songs ){
        println("Now playing: $song")
    }
}

fun showPlaylist(songs: MutableList<String>){
    println("Here's your playlist:")
    for (song in songs ){
        println(song)
    }
    println("Wow! you've got impeccable taste :D")
}