// function take songs as input and print which song is playing
fun plaAll(songs: List<String>){
    for(song in songs){
        println("Now playing: [$song]")
    }
}

// function to add song to a list of songs
fun addSong(songTitle: String, songs: MutableList<String>){
    println("\nSong to be added [$songTitle]")
    songs.add(songTitle)
    println("[$songTitle] has been added")
    println(songs)
}

// shuffle songs
fun shuffleSongs(songs: MutableList<String>){
    var shuffledSongs = songs.shuffled()
    println("\nSongs after shuffle: $shuffledSongs")
}

// remove a song
fun removeSong(songTitle: String, songs: MutableList<String>){
    println("\nSong to be removed [$songTitle]")
    songs.remove(songTitle)
    println("[$songTitle] has been removed")
    println(songs)
}



fun main() {
    // Looping through songs
    var songs = mutableListOf("Riptide", "No time to Die", "Cigarettes", "Marie", "Amigo")
    plaAll(songs)

    // adding a song to a list called songs
    addSong("Maybe", songs)

    // Shuffling songs
    shuffleSongs(songs)
    
    // remove song
    removeSong("Maybe",songs)

}