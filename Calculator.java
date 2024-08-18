package codingmart;

class Calculator {
    public int integerReplacement(int n) {
        int temp=n;
        int count=0;
        while(temp!=1)
        {
            if(temp%2==0)
            {
                temp/=2;
                count+=1;
            }
            else
            {
                temp-=1;
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[]args)
    {
    	Calculator c =new Calculator();
    	c.integerReplacement(65535);
    }
	
}
