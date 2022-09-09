public class addString {
    public static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        if (add("" ) != 0){
            System.exit(1);
        }
        if (add("3") != 3){
            System.exit(5);
        }
        if (add("1,4") != 5){
            System.exit(3);
        }
        if (add("2,5") != 7){
            System.exit(6);
        }
        if (add("3,6") != 9){
            System.exit(7);
        }
    }

    private static int add(String a) {
        if (a == ""){
            return 0;
        }
        String[] split = a.split(",");
        int result = 0;
        for (int i = 0; i < split.length; i++){
            result += Integer.parseInt(split[i]);
        }
        return result;
    }
}
