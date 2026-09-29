public class recursuion2 {
    public static int tiling(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        //kam
        //vertical
        int fnm1 = tiling(n-1);

        //horizontal
        int fnm2 = tiling(n-2);

        //total
        int total = fnm1 + fnm2;
        return total;
    }

    //remove duplicate
    // public static int removeDuplicate(String str,int idx,StringBuilder newstr,boolean map[]){
    //     if(idx == str.length()){
    //         System.out.println(newstr);
    //         return;
    //     }
    //     char currchar = str.charAt(idx);
    //     if(map[currchar- 'a'] == true ){
    //         //duplicate
    //         removeDuplicate(str, idx+1, newstr, map);
    //     }
    //     else{
    //         map[currchar - 'a'] = true; 
    //         removeDuplicate(str, idx+1, newstr.append(currchar), map);
                
          
    //     }

    // }

    //friend pairing problem
    public static int frdpraing(int n){
        if( n == 1 || n == 2){
            return n;
        }
        //singal
        int fnm1 = frdpraing(n-1);
        //pair
        int fnm2 = frdpraing(n-2);

        int pairway = (n-1) * fnm2;

        int total = fnm1 + pairway;

        return total;

        //return frdpraing(n-1) + (n-1) * frdpairing(n-2);
    }

    //Binary search problem
        public static void binsearch(int n,int lastspace ,String str){
            if(n == 0){
                System.out.println(str);
                return;
            }

            binsearch(n-1, 0, str + "0");
            if(lastspace == 0){
                binsearch(n-1, 1, str + "1");

            }
        }
    public static void main(String args[]){
        // System.out.print(tiling(4));
        // String str = "appnnacollege";
        // removeDuplicate(str, 0, new StringBuilder(" "), new boolean[26]);
        System.out.print(frdpraing(5));
        binsearch(3, 0, "");
        
    }
}
