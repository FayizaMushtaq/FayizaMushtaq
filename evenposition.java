//java program to print the elements of array at even position//
public class evenposition
{
public static void main(String[] args)
{
int[]arr=new int[]{1,2,3,4,5,6,7,8,9,10};
System.out.println("elements of given array at even position are:");
for(int i=0;i<10;i++)
{if(i%2==0){
System.out.println(arr[i]+" ");
}
}}
}