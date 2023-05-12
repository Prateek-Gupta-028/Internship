import java.util.*;
import static java.lang.Math.random;
class bingo{
    static boolean check(int val[],int i)
    {
        int p=10;
        if(val[i]!=0)
        {
            while(p<10)
            {   
                p = val[i]-10;
            }
            for(int y=p+10;y<=5;y++)
            {
                if(val[y]!=0)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int val[] = new int[10];
        for(int i=0;i<10;i++)
        {
            int a = (int)(Math.random()*(5-1+1)+1);
            int b = (int)(Math.random()*(5-1+1)+1);
            val[i] = Integer.parseInt(a+""+b);
            arr[a][b] = sc.nextInt();
            if(check(val,i))
            {
                break;
            }
        }
        for(int r=1;r<=5;r++)
        {
            for(int s=1;s<=5;s++)
            {
                System.out.print(arr[r][s]);
            }
        }
        
    }
}
