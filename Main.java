//Andriy Zasypkin
//2016-03-15
//Practice 2014 - 06: Spawn of Ungoliant

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    //create an input reader object
    BufferedReader input
            = new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      int W,H;
      String[] tmp = input.readLine().split("\\s+");
      W = Integer.valueOf(tmp[0]);
      H = Integer.valueOf(tmp[1]);

      if(H == 0 || W == 0)
        break;

      char[][] map = new char[H][W];
      for(int i=0; i<H; i++) {
        map[i] = input.readLine().toCharArray();
        for(int j=0; j<W; j++) {
        }
      }
      while(true){
        int nChanges = 0;
        for(int i=0; i<H; i++) {
          for(int j=0; j<W; j++) {
            if(map[i][j] == 'S') {
              //up    i-1
              if(i-1 >= 0) {
                if(map[i-1][j] == 'T') {
                  map[i-1][j] = 'S';
                  nChanges++;
                }
              }

              //down  i+1
              if(i+1 < H) {
                if(map[i+1][j] == 'T') {
                  map[i+1][j] = 'S';
                  nChanges++;
                }
              }

              //left  j-1
              if(j-1 >= 0) {
                if(map[i][j-1] == 'T') {
                  map[i][j-1] = 'S';
                  nChanges++;
                }
              }

              //right j+1
              if(j+1 < W) {
                if(map[i][j+1] == 'T') {
                  map[i][j+1] = 'S';
                  nChanges++;
                }
              }
            }
          }
        }
        if(nChanges == 0)
          break;
      }
      for(char[] line : map) {
        for(char c : line)
          System.out.print(c);
        System.out.println();
      }
    }

    //close stream
    input.close();

    System.exit(0);
  }
}
