package com.mehmetkoca;

import sun.awt.image.ImageWatched;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
//        private static void printList(LinkedList<String> linkedList) {
//            //for-loop görevi görüyor.
//            Iterator<String> i = linkedList.iterator();
//            while (i.hasNext()) {
//                System.out.println("Now visiting " + i.next());
//            }
//            System.out.println("=============================");
//        }


        Album album = new Album("Fırtınayt","Büyük Ev Ablukada");
        album.addSong("Benim Kafam Siktirmiş Gitmiş",3.4);
        album.addSong("Güneş Yerinde",4.7);
        album.addSong("Evren Bozması",4.49);
        album.addSong("Boşluk",3.4);
        album.addSong("Arayan Bulur",3.4);
        album.addSong("Hoşçakal Kadar",3.4);
        album.addSong("Hayaletler",3.4);
        album.addSong("Hepsine Ne Fena",3.4);
        album.addSong("İhtimallerin Heyecanına Üzülüyorum",3.4);
        albums.add(album);

        album = new Album("Sandal", "YYK");
        album.addSong("Tek Gecelik Mavi İpek Gecelik",3.23);
        album.addSong("Ateş Edecek Misin?",4.56);
        album.addSong("Yaz biter",4.67);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Fırtınayt",playList);
        albums.get(0).addToPlaylist("Sandal",playList);
        albums.get(0).addToPlaylist("Speed King",playList); //Does not exist
        albums.get(0).addToPlaylist(9,playList);
        albums.get(1).addToPlaylist(8,playList);
        albums.get(1).addToPlaylist(3,playList);
        albums.get(1).addToPlaylist(24,playList); //there is no track 24

        play(playList);

    }


    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the list.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions\npress");
        System.out.println("0 - to quit\n" +
                    "1 - to play next song\n" +
                    "2 - to play previous song\n" +
                    "3 - to play the current song\n" +
                    "4 - list songs in the playlist\n" +
                    "5 - print available actions.\n"+
                    "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==============================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==============================");
    }
}
