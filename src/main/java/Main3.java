import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] =scanner.nextInt();
        }

        int minAdd=ai[0];
        int iMinAdd=0;
        int maxDel=ai[1];
        int iMaxDel=1;

        for (int i = 0; i <n; i++) {
            if (i%2==0) {
                if (ai[i] < minAdd) {
                    minAdd = ai[i];
                    iMinAdd = i;
                }
            }
            else
            if (ai[i]>maxDel) {
                maxDel = ai[i];
                iMaxDel=i;
            }

        }

        int tmp;
        tmp=ai[iMinAdd];
        ai[iMinAdd] = ai[iMaxDel];
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
