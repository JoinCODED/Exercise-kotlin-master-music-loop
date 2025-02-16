package MusicMaster

class Song {
    var title: String = ""
        private set (value) {
            field = value.lowercase()
        }

    var artist: String = ""
        private set (value) {
            field = value.lowercase()
        }

    constructor(title: String, artist: String) {
        this.title = title;
        this.artist = artist;
    }

    override fun toString(): String {
        return "$title - $artist";
    }
}



