/**
 * 
 */
package pac1;

/**
 * @author bluepi
 *
 */
class test 
{
    int a;
    int b;
    void meth(int i , int j) 
    {
        i = i*2;
        j = j/2;
    }          
}    
class Methods 
{
    public static void main(String args[])
    {
        test obj = new test();
    int a = 10;
        int b = 20;             
        obj.meth(a , b);
        System.out.println(a + " " + b);        
    } 
}