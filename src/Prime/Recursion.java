package  Prime;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public  class Recursion {

    public static class  point{
        int x;
        int y;
        point (int x,int y){
            this.x=x; //row numer
            this.y=y; //string positon
        }
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {

        String[] maze = {
                "S....",
                "...#.",
                "#...#",
                "...#."
        };

        point start = new point(0,0);
        char end='E';
        char wall='#';


        point[] path = solve(maze , start,end ,wall);

        if(path==null){
            System.out.println("is error occured or maze has no ending");

        }
        System.out.println(Arrays.toString(path));


    }

    static  point[] solve(String[] maze, point start ,char end , char wall ){
        boolean[][] seen =new boolean[maze.length][maze[0].length()];
        ArrayList<point> path  = new ArrayList<>();
        if(walk(maze,start,end,wall,seen,path)){
            return  path.toArray(new point[0]);
        }

        return  null;
    }

    //recusive fuction
    public  static int[][] dir={
            {-1,0},//up,
            {1,0},//down
            {0,1} ,//rignt,
            {0,-1} //down,

    };

    static  boolean walk(String[] maze , point currPoint, char end , char wall ,boolean[][] seen,ArrayList<point> path){
        //base conditon to break whle tranvesin the point for a codrignat

        //1) out of scope
        if(currPoint.x<0 || currPoint.x>=maze.length || currPoint.y<0||currPoint.y>=maze[0].length()){
            return  false;
        }
        //if seen elemt & if wall

        if(seen[currPoint.x][currPoint.y] || maze[currPoint.x].charAt(currPoint.y)==wall){
            return  false;
        }
        //if found end
        if (maze[currPoint.x].charAt(currPoint.y)==end) {
            path.add(new point(currPoint.x, currPoint.y));  // Add the end point to the path
            return true;
        }

        //append point
        seen[currPoint.x][currPoint.y]=true;
        path.add(new point(currPoint.x, currPoint.y));

        //recusive call
        for ( int []curr:dir){
            if(walk(maze,new point(currPoint.x+curr[0],currPoint.y+curr[1]),end,wall,seen,path)){
                return true;
            }
        }

        path.remove(path.size() - 1);
        //will run at last coridnate all four dir retrn flase then (mean stuck hence no end point)
        return  false;
    }
}
