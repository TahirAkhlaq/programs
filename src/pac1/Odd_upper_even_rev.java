/**
 * 
 */
package pac1;

/**
 * @author bluepi
 *
 */
public class Odd_upper_even_rev {
	public static void main(String args[]){
		String str="This is a test string!!";
		String finalstr="",arr[]=str.split(" ");
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
			{
				arr[i]=arr[i].toUpperCase();
				
			}
			else
			{
				StringBuffer sb=new StringBuffer(arr[i]);
				StringBuffer temp=sb.reverse();
				String s=new String(temp);
				arr[i]=s;
				
			}
		}
		for(int j=0;j<len;j++)
		{
			finalstr=finalstr+" "+arr[j];
		}
		System.out.println(finalstr);
        		
	}

}
