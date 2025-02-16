fun main(){
    val songs:MutableList<String> = mutableListOf()
    songs.addAll(listOf("Haru -Yorushika", "Be a flower -Ryokuoushoku Shakai ", "Renai Circulation -Kana Hanazawa",
        "Overdose -natori", "KAMAKURA STYLE -BotchiBoromaru", "Otonoke -Creepy Nuts" ) )
//    songs.add("Haru by: Yorushika")
//    songs.add("Be a flower Ryokuoushoku Shakai")
//    songs.add("Renai Circulation by: Kana Hanazawa")
//    songs.add("Overdose by: natori)
//    songs.add("KAMAKURA STYLE by: BotchiBoromaru")
//    songs.add("Otonoke by: Creepy Nuts")

    addSong("Dramaturgy", songs)
    removeSong("Overdose -natori", songs)
    shuffleSongs(songs)

    songs.addAll(listOf("As You Like it -Eve", "How to Devour Life -Eve", "The Secret About That Girl -Eve", "Last Dance -Eve"))
    findByArtist("Eve", songs)

    showPlaylist(songs)

}
//Step 3
fun playAll(playlist:List<String>) {
    for (song in playlist) {
        println("Now playing: $song")
    }
}

//Step 4
fun addSong(songTitle:String, playlist: MutableList<String>){
    playlist.add(songTitle)
}

//Step 5
fun shuffleSongs(playlist: MutableList<String>): List<String> {
    playAll(playlist.shuffled())
    return playlist.shuffled()
}

//Step 6.1
fun removeSong(songTitle:String, playlist: MutableList<String>){
    playlist.remove(songTitle)
}

//Step 6.2
fun findByArtist(artistName:String, playlist: MutableList<String>){
    println(playlist.filter{ it.contains(artistName, ignoreCase = true)})
}

//Step 6.3
fun showPlaylist(playlist: List<String>){
    println(playlist)
}


