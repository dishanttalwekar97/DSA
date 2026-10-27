class Practice {
    //reverse a string
    public void ReverseString(){
       String str = "hello";
       String rev = " " ;

       for(int i=str.length()-1;i>=0;i--){
        rev = rev + str.charAt(i);
       }
       System.out.println(rev);
       
    }

   //check if a number is palindrome or not
    public void PalindromeNumber(){
        String str = "madam";
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.print("String is Palindrome");
        }else{
            System.out.print("String is not palndrome  ");
        }
        System.out.println();
    }
    

    //Count Vowels in a string
    public void CountVowels(){
        String str = "hello world";
        int count = 0;

        for(int i=0;i<str.length();i++){
            char ch  = str.charAt(i);

            if(ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u'){
                count++
;            }
        }
        System.out.println("Number of vowels in the string: " + count);
        System.out.println();
    }


    //Count Frequency of each character in a string
    public void CountFrequenc(){
        String str = "Dishanthello";
        

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int count = 0;

            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            
            
            System.out.print(ch + " = " + count);
        }
        System.out.println();
 }
 


    //dupicate in Array
    public void DuplicateInArray(){
        int arr[] = {1, 2, 3, 2, 4, 3};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Element is : "+arr[i]);
                }

            }
       
        }
        System.out.println();

    }
    

    //Find maxinmum Array
    public void MaximumArray(){
        int arr[] = {1,23,44,34,25,12};

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element in Array is : "+max);
        System.out.println();
    }

    //Find minimum Element in array
    public void MinimumArray(){
        int arr[] = {1,23,44,34,54,12};
        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println("minimum Element in Array is : "+min);
        System.out.println();

    }

    //FInd Second largest in the arrar

    public void SecondLargestArray7(){
        int arr[] = {1,22,32,44,54,12};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element in Array is : "+secondLargest);
    }
   
   //Sum of All Element in Arrat
   public void SumofAllElementinArray(){
    int arr[] = {1,2,3,4,5};
    int sum = 0;

    for(int i=0;i<arr.length;i++){
        sum = sum + arr[i];
    }
    System.out.println("Sum of all Element in Array is : "+sum);
   }
    public static void main(String []args){
        Practice obj = new Practice();
        obj.ReverseString();

        Practice obj1 = new Practice();
        obj1.PalindromeNumber();
 
        Practice obj2 = new Practice();
        obj2.CountVowels();

        Practice obj3 = new Practice();
        obj3.CountFrequenc();
        
        Practice obj4 = new Practice();
        obj4.DuplicateInArray();

        Practice obj5 = new Practice();
        obj5.MaximumArray();

        Practice obj6 = new Practice();
        obj6.MinimumArray();

        Practice obj7 = new Practice();
        obj7.SecondLargestArray7();

        Practice obj8 = new Practice();
        obj8.SumofAllElementinArray();
    }
}