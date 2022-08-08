import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] =scanner.nextInt();
        }

        int maxAdd=0;
        int iMaxAdd=0;
        int maxDel=0;
        int iMaxDel=0;

        for (int i = 0; i <n; i++) {
            if (i%2==0)
                if (ai[i]>maxAdd) {
                    maxAdd = ai[i];
                    iMaxAdd =i;
                }
            else
            if (ai[i]>maxDel) {
                maxDel = ai[i];
                iMaxDel=i;
            }

        }

        int tmp;
        tmp=ai[iMaxAdd];
        ai[iMaxAdd] = ai[maxDel];
        ai[iMaxDel]=tmp;

        int sum=0;
        for (int i = 0; i < n; i++) {
            if (i%2 == 0)
                sum+=ai[i];
            else
                sum-=ai[i];

        }
        System.out.println(sum);
    }


}
