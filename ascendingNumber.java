import java.util.Scanner;

public class ascendingNumber {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Input Numbe'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''r:");
        int inputNo = s.nextInt();
        int len= Integer.toString(inputNo).length();
        int a[] = new int[len];
        int temp = 0;
        // converting Number values in array
        System.out.println("value of Len :"+ len);
        for (int i=len; i>0; i--)
        {
            //System.out.println("inside loop i= "+i);
            a[i-1] = inputNo % 10;
            //System.out.println("inside loop value of input: "+inputNo);
            inputNo = inputNo /10;
            //System.out.println("inside loop value of input = input/10: "+inputNo);
            System.out.println("inside loop a["+(i-1)+"] ="+a[i-1]);
            //System.out.println("Current value of digits = "+inputNo);
            //System.out.println("a["+i+"] = "+a[i-1]);
        }


        // sorting inside array
        for (int i = 0; i < len; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if (a[i] > a[j])
                {
                   // System.out.println("inside loop before a["+i+"] ="+a[i]);
                   // System.out.println("inside loop before a["+j+"] ="+a[j]);
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                   // System.out.println("inside loop after sort a["+i+"] ="+a[i]);
                   // System.out.println("inside loop after sort a["+j+"] ="+a[j]);
                }
            }
        }

        // display
        System.out.print("Output in assending order : ");
        for (int i = 0; i < len;i++)
        {
            System.out.print(a[i]);
        }
    }
}
