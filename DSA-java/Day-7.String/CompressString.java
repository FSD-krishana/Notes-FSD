package DSA.String;

public class CompressString {
    public static void main(String[] args) {

        StringBuilder ans = new StringBuilder();
        String name = "aabcccccaah";
        int count = 1;

        char[] array = name.toCharArray();

        for(int i =  0 ; i < array.length -1  ; i++){
            if(array[i]==array[i+1]){
                count++;
            }
            else{
                    ans.append(array[i-1]);
                    ans.append(count);
                    count = 1;
            }
        }

        ans.append(array[array.length-1]);
        ans.append(count);
        System.out.println(ans);

    }
}
