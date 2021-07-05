package chae4ek.simplechat;

import chae4ek.simplechat.client.Client;
import chae4ek.simplechat.server.Server;

public class Main {
  public static void main(String[] args) {
    boolean started = false;
    if (args.length == 1) {
      if (args[0].equals("--client")) {
        started = true;
        System.out.println("Client is running...");
        Client client = new Client();
        client.startClient();
      } else if (args[0].equals("--server")) {
        started = true;
        System.out.println("Server is running...");
        Server server = new Server();
        server.startServer();
      }
    }
    if (!started) {
      System.out.println("Invalid arguments!");
      System.out.println("Use --server or --client");
    } else {
      System.out.println("Exit.");
    }
  }
}
