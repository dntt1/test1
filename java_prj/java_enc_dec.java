import java.io.*;
public class t3
{
    public static void main(String args[])throws IOException
    {
       
        int j=0,len=5,ref=64,i=0;
        char ch;
      
        /* 65- A
66- B
67- C
68- D
69- E
70- F
71- G
72- H
73- I
74- J
75- K
76- L
77- M
78- N
79- O
80- P
81- Q
82- R
83- S
84- T
85- U
86- V
87- W
88- X
89- Y
90- Z

         * 
         */
        int n1[]={19,5,15,19,8};//main code seosh
        int c1[]={19,5,15,19,8};//backup/copy code seosh
        int s1[]={-1,-1,-1,-1,-1};//possiblity storage code
        String prg;
        BufferedWriter out = new BufferedWriter(new FileWriter("test1.txt"));
        prg="the code in numeric form is present";
        System.out.println(prg);
        out.write(prg);
        for(j=0;j<len;j++)
        {
           s1[j]=c1[j]+0+ref;//calculation to decode the original code seosh
             out.write(s1[j]);
        ch=(char)s1[j];//makes an integer value as a character value
            System.out.print(ch);
            out.write(ch);
        }
        prg="Now computing all possiblity";
        System.out.println("Now computing all possiblity");
         out.write(prg);
        for(i=0;i<=26;i++)
        {
            prg=" possiblity "+(i);
              System.out.println(" possiblity "+(i));
              out.write(prg);
        for(j=0;j<len;j++)
        {
            
           s1[j]=c1[j]+i+ref;//calculating possiblity by increasing the index by 1
           if(s1[j]>90)//if value extends Z i.e 90 , make the next value as A 
           {
           s1[j]=s1[j]-26;
        }
        else
        {
        }
        
            ch=(char)s1[j];
             System.out.print(ch);
             out.write(ch);
        }
        System.out.println("");
        out.write("");
    }
    out.close();
    }
    
}
