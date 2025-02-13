fun main(){

    //list of my fav songs
    val songs  = mutableListOf(
        "Video Games - Lana Del Rey",
        "It's My Life - Bon Jovi",
        "Blue - MARINA",
        "Stairway to Heaven - Led Zeppelin",
        "Smells Like Teen Spirit - Nirvana"
    )

    //printing the list by using for loop
    println("Using For loop:")
    playAll(songs)

    //printing the list by using for while loop
    println("\nUsing While loop:")
    playAllWhile(songs)

    //printing the list by using for do-while loop
    println("\nUsing Do-While loop:")
    playAllDoWhile(songs)

    //add songs to the list then print the list
    addSong(songs, "Bring Me To Life - Evanescence")
    addSong(songs, "Control - Zoe Wees")
    println("\nAfter adding new songs:")
    playAll(songs)

    //sorting
    println("\nSorted Playlist:")
    sortSongs(songs)

    //used built in to shuffle and the print the shuffled list (i can import random to shuffle too)
    shuffleSongs(songs)
    println("\nAfter shuffling:")
    playAll(songs)

    //remove a song and then print
    removeSong(songs, "Stairway to Heaven - Led Zeppelin")
    println("\nAfter removing a song:")
    playAll(songs)

    //finding by artist name
    val artistSongs = findByArtist(songs, "Nirvana")
    println("\nSongs by Nirvana:")
    artistSongs.forEach { println(it) }

    //filter and sorting
    val filteredAndSorted = filterAndSortSongs(songs, "Blue")
    println("\nFiltered and Sorted Songs containing 'Blue':")
    filteredAndSorted.forEach { println(it) }

    //print All
    println("\nFull Playlist:")
    showPlaylist(songs)
}


fun playAll(songs: List<String>){
    for(song in songs){
        println("Now playing: $song")
    }
}

fun playAllWhile(songs: List<String>) {
    var index = 0
    while (index < songs.size) {
        println("Now playing: ${songs[index]}")
        index++
    }
}

fun playAllDoWhile(songs: List<String>) {
    var index = 0
    do {
        println("Now playing: ${songs[index]}")
        index++
    } while (index < songs.size)
}

fun addSong(songs: MutableList<String>, songTitle: String) {
    songs.add(songTitle)
}

fun shuffleSongs(songs: MutableList<String>) {
    songs.shuffle()
}

fun removeSong(songs: MutableList<String>, songTitle: String) {
    songs.remove(songTitle)
}

fun findByArtist(songs: List<String>, artistName: String): List<String> {
    return songs.filter { song -> song.contains(artistName, ignoreCase = true) }
}

fun showPlaylist(songs: List<String>) {
    //println("Playlist:")
    songs.forEach { println(it) }
}

fun sortSongs(songs: MutableList<String>) {
    songs.sort()
    songs.forEach { println(it) }
}

fun filterSongs(songs: List<String>, keyword: String): List<String> {
    return songs.filter { it.contains(keyword, ignoreCase = true) }
}

fun filterAndSortSongs(songs: List<String>, keyword: String): List<String> {
    return songs.filter { it.contains(keyword, ignoreCase = true) }
        .sorted()
}