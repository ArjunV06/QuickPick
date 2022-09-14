//Arjun Vasudevan
public class QuickPick
{
    public static void main(String[] args)
    {
        System.out.println("   Texas Lottery - Quick Pick")
        int [] numbers = new int[6];
        for(int i = 0; i<6; i++)
        {
            numbers[i]=(int)(Math.random()*50)+1;
            //System.out.println(numbers[i]);
            
        }
        
    }
}