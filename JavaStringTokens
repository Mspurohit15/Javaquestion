String tokenization is a process where a string is broken into several parts. Each part is called a token

  Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
         s=s.trim(); 
         The trim() method in Java String is a built-in function that eliminates leading and trailing spaces. 
         The Unicode value of space character is ‘\u0020’. The trim() method in java checks this Unicode value before and after the string, 
         if it exists then removes the spaces and returns the omitted string. The trim() method also helps in trimming the characters in Java.
        if (s.length() == 0) {
        System.out.println(0);
        }
        String[] arr =s.split("[!,?._'@ ]+");
        
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
        scan.close();
    }
}
    
    you can produce the same results using the StringTokenizer class.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer str = new StringTokenizer(s, " ,!,?,.,_,',@");
        System.out.println(str.countTokens());
        while(str.hasMoreTokens())
        {
            System.out.println(str.nextToken())
    }
    scan.close();
}
