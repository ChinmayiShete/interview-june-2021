package exam;
import java.io.*;
public class ConvertToBinary {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int BiNum[]=new int[32];
    int i=0;
    while(n>0){
      BiNum[i]=n%2;
      n=n/2;
      i++;
    }
    for(int j=i-1;j>=0;j--)
      System.out.print(BiNum[j]);
}
  public static void main(String args[])
  {
    toBinary(n);
  }
