package MusicMaster

import kotlin.system.exitProcess
import kotlin.reflect.KFunction

class MusicApp {
    private var selectedPlayList: Map.Entry<String, PlayList>? = null

    private var playLists: MutableMap<String, PlayList> = mutableMapOf(
        "All time favs" to PlayList(
            mutableListOf(
                Song(title = "Disillusioned", artist = "a perfect circle"),
                Song(title = "Stranger", artist = "a perfect circle"),
                Song(title = "Blackbird song", artist = "Lee DeWyze"),
                Song(title = "One", artist = "metallica")
            )
        ),
    )

    fun run() {
        displayMenu()
        displayActivePlayList()
        do {
            try {
                val userInput = getUserInput()
                if (userInput !in commands.keys) continue
                else execCommand(userInput)
                println()
            } catch (e: Exception) {
                println(e)
            }
        } while (true)
    }

    private fun displayMenu() {
        println("Commands:")
        for (command in commands.entries) {
            println("\t${command.key} - ${command.value.keys.toList()[0]}")
        }
        println()
    }

    private fun displayActivePlayList() {
        if (selectedPlayList == null) {
            println("No active playlist")
        } else {
            println("Active playlist: ${selectedPlayList!!.key}")
        }
    }

    private fun displayPlayLists() {
        println("Available playlists: ")
        if (playLists.isEmpty()) println("\t[-] No playlists available")
        playLists.keys.forEach { println("\t[-] $it") }
        println()
    }

    private fun getUserInput(prompt: String = "Enter option: "): String {
        print(prompt)
        return readln()
    }

    private val commands = mapOf(
        "1" to mapOf("display playlist" to ::displayPlayLists),
        "2" to mapOf("select playlist" to ::selectPlayList),
        "3" to mapOf("new playlist" to ::newPlaylist),
        "4" to mapOf("delete playlist" to ::deletePlayList),
        "5" to mapOf("play active playlist" to ::playActivePlaylist),
        "6" to mapOf("next song" to ::playActivePlaylist),
        "7" to mapOf("view playlist songs" to ::showPlayListSongs),
        "8" to mapOf("add song to playlist" to ::addSongToPlayList),
        "9" to mapOf("delete a song" to ::deleteSongFromActivePlayList),
        "10" to mapOf("filter by artist" to ::filterPlayListByArtist),
        "11" to mapOf("shuffle playlist" to ::shuffleActivePlaylist),
        "q" to mapOf("exit" to ::exit)
    )

    private fun execCommand(command: String) {
        commands[command]!!.values.toList()[0].invoke()
    }

    private fun selectPlayList() {
        if (playLists.isEmpty()) {
            println("You do not have any playlists... create one")
        } else {
            displayPlayLists()
            while (true) {
                print("Select a playlist: ")
                val userInput = readln()
                if (!playLists.containsKey(userInput)) {
                    println("Invalid playlist... try again")
                    continue
                }
                selectedPlayList = playLists.entries.find { it.key == userInput }
                break
            }
        }
    }

    private fun deletePlayList() {
        print("[!] Enter playlist name (or type back): ")
        val playListName: String = readln()
        if (!playLists.containsKey(playListName) || playListName == "back") return
        playLists.remove(playListName)
    }

    private fun addSongToPlayList() {
        if (selectedPlayList == null) {
            println("[!] No active playlist! Select a playlist to add a song to.")
        } else {
            val songTitle = getUserInput("Enter song title: ")
            val artist = getUserInput("Enter artist name: ")
            selectedPlayList!!.value.addSong(songTitle, artist)
        }
    }

    private fun newPlaylist() {
        print("[-] Playlist name: ")
        val newPlayListName = readln()
        val songs = mutableListOf<Song>()
        playLists[newPlayListName] = PlayList(songs)
    }

    private fun showPlayListSongs() {
        if (selectedPlayList == null) {
            println("[!] No active playlist! Select a playlist to view included songs.")
        } else {
            selectedPlayList!!.value.showPlayList()
        }
    }

    private fun deleteSongFromActivePlayList() {
        if (selectedPlayList == null) {
            println("[!] No active playlist! Select a playlist to delete a song from.")
        }
        else {
            val songTitle = getUserInput("Enter a song name: ")
            selectedPlayList!!.value.removeSong(title = songTitle)
        }
    }

    private fun filterPlayListByArtist() {
        if (selectedPlayList == null) {
            println("[!] No active playlist! Select a playlist to filter by artist.")
        }
        else {
            val artistName = getUserInput("Enter a artist name: ")
            val filteredPlayList: PlayList = selectedPlayList!!.value.filterByArtist(artistName)
            playLists["$artistName playlist"] = filteredPlayList
        }
    }

    private fun shuffleActivePlaylist() {
        if (selectedPlayList == null) {
            println("[!] No active playlist! Select a playlist to shuffle ")
        }
        else {
            selectedPlayList!!.value.shuffleSong()
        }
    }

    private fun playActivePlaylist() {
        if (selectedPlayList == null && playLists.isEmpty()) {
            println("[!] You do not have any playlists... try creating one")
            return;
        }
        if (selectedPlayList == null) {
            selectedPlayList = playLists.entries.random()
        }
        selectedPlayList!!.value.playAll()
    }

    fun exit() {
        println("Exiting the application...")
        exitProcess(0)
    }
}