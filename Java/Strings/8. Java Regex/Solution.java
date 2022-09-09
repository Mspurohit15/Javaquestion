First solution 

1. 
class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
/*
     [01]?\\d{1,2}   matches numbers 0-199.
     2[0-4]\\d       matches numbers 200-249
     25[0-5]         matches numbers 250-255
*/
class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;
}


2. solution 
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String pattern = "^([0-9]|[0-9][0-9]|[0][0-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.([0-9]|[0-9][0-9]|[0][0-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.([0-9]|[0-9][0-9]|[0][0-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.([0-9]|[0-9][0-9]|[0][0-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])$";
    while(scan.hasNext()){
        String IP = scan.nextLine();
         boolean b =Pattern.matches(pattern, IP); 
         System.out.println(b); 
    }
}

3. Solution 

class MyRegex {
    String pattern = "^(((2[0-4][0-9]|25[0-5]|[01]?[0-9]{1,2})\\.){3})(25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})$";

}
