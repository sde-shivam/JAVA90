
public class problems {
    public static void primeNum(int num) {

        boolean primeNum=true;
        if(num<=1) {
            System.out.print("Not Prime");
            return;
        }
        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num%i==0) {
                primeNum=false;
                break;
            }
        }
        if(primeNum) {
            System.out.print("Prime");
        }else {
            System.out.print("Not Prime");
        }
    }

    public static void conArr() {
        int num[] = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
        int row = 2;
        int col = 5;
        int num2[][] = new int[num.length][num.length];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num2[i][j] = num[index];
                index++;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num2[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------->");
        int newIndex = 0;
        for(int s=0;s<col;s++){
            for(int t=0;t<row;t++){
                  num2[s][t]= num[newIndex];
                  newIndex++;
                }
             }
        for(int s=0;s<col;s++){
            for(int t=0;t<row;t++){
                System.out.print(num2[s][t]);
            }
            System.out.println();
            }
    }
    public static void main(String[] args) {
        conArr();

    }

}

