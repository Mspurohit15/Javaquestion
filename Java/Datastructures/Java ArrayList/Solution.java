import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> []line = new ArrayList[n];
        for(int i=0;i<n;i++){
            ArrayList<Integer> number=new ArrayList();
            int db=sc.nextInt();
            for(int j=0;j<db;j++)
                number.add(sc.nextInt());
                line[i]=number;    
        }
        int query=sc.nextInt();
        for(int i=0;i<query;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(line[x-1].get(y-1));
            }catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }

    }
}
