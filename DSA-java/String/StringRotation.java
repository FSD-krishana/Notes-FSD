package DSA.String;

public class StringRotation {
    public static void main(String[] args) {
//        String Rotation: Given two strings, check if one is a rotation of the other using only one call to a substring method.
//        For example, "waterbottle" is a rotation of "erbottlewat".

        String word1 = "waterbottle";
        String word2 = "erbottlewat";

        boolean ans = false;

        char[] rotation = word1.toCharArray();


        for (int j = 0; j < rotation.length; j++) {

            StringBuilder sc = new StringBuilder();
            char firstValue = rotation[0];
            int n = rotation.length;

            for (int i = 0; i < n - 1; i++) {
                rotation[i] = rotation[i + 1];
            }

            rotation[rotation.length - 1] = firstValue;

            for(int k = 0 ; k < rotation.length;k++){
                sc.append(rotation[k]);
            }

            String word = sc.toString();

            if(word.equals(word2)){
                ans = true;
                break;
            }

        }
        System.out.println(ans);
    }
}
