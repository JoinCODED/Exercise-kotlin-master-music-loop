fun playAll(songs: MutableList<String>) {
    if (songs.isEmpty()) {
        println("* Playlist empty.")
    } else {
        for (song in songs) {
            println("* Now playing: $song")
        }
    }
}
fun addSong(songs: MutableList<String>, newSong: String) {
    songs.add(newSong)
}

fun removeSong(songs: MutableList<String>, songTitle: String):Boolean {
    return songs.remove(songTitle)
}

fun shuffleSongs(songs: MutableList<String>) {
    if (songs.isNotEmpty()) {
        songs.shuffle()
        println("* Playlist shuffled.")
    } else {
        println("* Playlist is empty, nothing to shuffle.")
    }
}

fun showPlaylist(songs: MutableList<String>) {
    if (songs.isEmpty()) {
        println("* Playlist empty.")
    } else {
        println("* Current Playlist:")
        for (i in songs.indices) {
            println("${i + 1}. ${songs[i]}")
        }
    }
}

fun menu():Int? {
    println("\n-----MusicMaster Playlist Menu-----")
    println("1. play all songs")
    println("2. add a song")
    println("3. remove a song")
    println("4. shuffle playlist")
    println("5. show playlist")
    println("6. exit")
    print("Enter choice: ")

    return readln().toIntOrNull()

}


fun main() {
    //val songs: MutableList<String> = mutableListOf("Bohemian Rhapsody","Hotel California","Stairway to Heaven","Imagine")
    val songs: MutableList<String> = mutableListOf()

    while (true){
        when (menu()){
            1-> playAll(songs)
            2-> {
                print("Enter song title to add:")
                val newSong = readLine().toString()
                if (newSong.isNotEmpty()){
                    addSong(songs, newSong)
                    println("* '$newSong' added to the playlist.")
                } else{
                    println("* Invalid, please try again.")
                }
            }
            3-> {
                print("Enter song title to remove:")
                val songTitle = readln()

                if (songTitle !=null && removeSong(songs, songTitle.toString())) {
                    println("* '$songTitle' removed from the playlist.")
                } else {
                    println("* Song not found.")
                }
            }
            4-> shuffleSongs(songs)
            5-> showPlaylist(songs)
            6-> break
            else-> println("* Invalid, please try again.")
        }
    }
    println("* Exited MusicMaster")
}