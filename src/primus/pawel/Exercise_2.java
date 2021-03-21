package primus.pawel;

import java.util.HashMap;
import java.util.Map;

class Exercise_2 {

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {

        int x = position[0];
        int y = position[1];
        final int MAX_X = fighters[0].length;
        final int MAX_Y = fighters.length;
        //System.out.println("MAX X = " + MAX_X + " MAX_Y = " + MAX_Y);
        String[] result = new String[moves.length];
        for (int i = 0; i < moves.length; i++) {
            switch (moves[i]) {
                case "right":
                    if (x==MAX_X-1) x=0; else x++;
                    result[i] = fighters[y][x];
                    //System.out.println(fighters[y][x]);
                    break;
                case "left":
                    if (x==0) x=MAX_X-1; else x--;
                    result[i] = fighters[y][x];
                    //System.out.println(fighters[y][x]);
                    break;
                case "up":
                    if (y!=0)  y--;
                    result[i] = fighters[y][x];
                    //System.out.println(fighters[y][x]);
                    break;
                case "down":
                    if (y!=MAX_Y-1) y++;
                    result[i] = fighters[y][x];
                    //System.out.println(fighters[y][x]);
                    break;
                default:
                    System.out.println("Error");
            }
        }
        return result;
    }


    public static void main(String[] args) {
        //System.out.println("Test");

        String[][] fighters = new String[][]{
                new String[]{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                new String[]{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
        };

        String[] moves = new String[]{"up", "left", "down", "right", "up", "left", "down", "right" };

        System.out.println(streetFighterSelection(fighters, new int[]{0,0}, moves));


    }
}
