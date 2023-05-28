public class Swtich {
    public static void main(String[] args) {
        int n=2;
        int result;
        switch(n){
            case 1:
            System.out.println("Block A");
            result=n;
            break;
            case 2:
                System.out.println("Block C");
                result=n*n*n;
                break;
                default:
                    result=0;
                    break;
        }
        System.out.println("result:"+result);
    }
}
