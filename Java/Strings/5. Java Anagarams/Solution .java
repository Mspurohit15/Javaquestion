https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=

1.Check by Sorting
-->This solution is easy to understand and implement. However, the overall running time of this algorithm is O(n log n)
because sorting an array of n characters takes O(n log n) time. For the algorithm to function, it must make a copy of
both input strings as character arrays, using a little extra memory.


boolean isAnagramSort(String string1, String string2) {
    if (string1.length() != string2.length()) {
        return false;
    }
    char[] a1 = string1.toCharArray();
    char[] a2 = string2.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
}

2. 
private static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
        return false;
    }
    a = a.toLowerCase();
    b = b.toLowerCase();
    
    for (int i = 0; i < b.length(); i++) {
        a = a.replaceFirst(String.valueOf(b.charAt(i)), "");
    }

    return a.isEmpty() ? true : false;
}

3. 
 s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()==s2.length())

        {
            int[] a = new int[256];
            int[] b = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                a[(int) s1.charAt(i)] += 1;
                b[(int) s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (a[i] != b[i])
                    return false;

            }
            return true;
        }
        else
        {
            return false;
        }
    }
