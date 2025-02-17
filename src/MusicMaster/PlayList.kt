package MusicMaster

class PlayList(var songs: MutableList<Song>) {
    var activeSong: Song? = null
    private var songsIterator: MutableIterator<Song> = songs.iterator()

    val playAll: () -> Unit = {
        if (songs.isEmpty()) {
            println("[!] Playlist is empty... add a song")
        }
        playNext()
        println("Playing: $activeSong")
    }

    private fun playNext() {
        if (songsIterator.hasNext()) {
            activeSong = songsIterator.next()
        } else {
            println("[!] Playlist finished")
        }
    }

    val addSong = { title: String, artist: String ->
        songs.add(Song(title, artist))
    }
    val shuffleSong = {  songs.shuffle() }
    val filterByArtist = { artist: String ->
        PlayList(songs.filter {
            it.artist.lowercase() == artist.lowercase() ||
                    it.artist.lowercase().contains(artist.lowercase())
        }
            .toMutableList())
    }

    val showPlayList: () -> Unit = {
        if (songs.size > 0) {
            (0..songs.size - 1)
                .toList()
                .forEach { e -> println("${e + 1} - ${songs[e]}") }
        }
    }

    fun removeSong(title: String): Boolean {
        if (songs.isEmpty()) return false

        val kSearchTerm = title.lowercase()
        var found = false
        var index = 0
        for (song in songs) {
            if (song.title.lowercase() == kSearchTerm) {
                songs.removeAt(index)
                found = true
                break
            }
            index++
        }
        return found
    }

    // @param position represents user friend song position in playlist
    // starting from number 1 onwards, i.e. @param position 1 == index 0
    fun removeSong(position: Int): Boolean {
        if (position <= 0) return false;
        if (songs.isEmpty()) return false;
        if (songs.size - 1 < position) return false;

        songs.removeAt(position - 1)
        return true
    }
}