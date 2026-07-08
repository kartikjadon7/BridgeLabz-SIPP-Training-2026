import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        while (true) {
            System.out.println("\n===== Music Playlist Recommendation Engine =====");
            System.out.println("1. Play Song");
            System.out.println("2. Search Song");
            System.out.println("3. Display Recently Played");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter song name: ");
                    String song = sc.nextLine();

                    if (playlist.contains(song)) {
                        playlist.remove(song);
                    }

                    playlist.addFirst(song);

                    if (playlist.size() > 10) {
                        String removedSong = playlist.removeLast();
                        System.out.println("Oldest song removed: " + removedSong);
                    }

                    System.out.println(song + " added to recently played.");
                    break;

                case 2:
                    System.out.print("Enter song to search: ");
                    String searchSong = sc.nextLine();

                    if (playlist.contains(searchSong)) {
                        System.out.println(searchSong + " is present in the recently played list.");
                    } else {
                        System.out.println(searchSong + " is not present in the recently played list.");
                    }
                    break;

                case 3:
                    if (playlist.isEmpty()) {
                        System.out.println("No songs played yet.");
                    } else {
                        System.out.println("\nRecently Played Songs:");
                        for (String s : playlist) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}