import java.util.*;
public class Q10
{
	public static void main(String[] args) 
	{
	      Scanner scn=new Scanner(System.in);
	      while(true)
	      {
	            String str=scn.nextLine();
	            switch(str)
		      {
		            case "e":
		                  String str1=scn.nextLine();
		                  int n1=str1.length();
		                  StringBuilder stbr1=new StringBuilder(str1);
		                  int k1=scn.nextInt();
		                  scn.nextLine();
		                  k1%=26;
		                  for(int i=0;i<n1;i++)
		                  {
		                        char ch=stbr1.charAt(i);
		                        if(Character.isLetter(ch))
		                        {
		                              if(Character.isUpperCase(ch))
		                              {
		                                    int ich1=(int)ch;
		                                    ich1=ich1+32+k1;
		                                    ich1%=122;
		                                    if(ich1<97)
		                                          ich1+=97;
		                                    ch=(char)ich1;
		                                    stbr1.setCharAt(i,ch);
		                              }
		                              else
		                              {
		                                    int ich1=(int)ch;
		                                    ich1=(ich1-32)+k1;
		                                    ich1%=90;
		                                    if(ich1<65)
		                                          ich1+=65;
		                                    ch=(char)ich1;
		                                    stbr1.setCharAt(i,ch);
		                              }
		                        }
		                  }
		                  System.out.println(stbr1.toString());
		                  break;
		            case "d":
		                  String str2=scn.nextLine();
		                  int n2=str2.length();
		                  StringBuilder stbr2=new StringBuilder(str2);
		                  int k2=scn.nextInt();
		                  scn.nextLine();
		                  k2%=26;
		                  for(int i=0;i<n2;i++)
		                  {
		                        char ch=stbr2.charAt(i);
		                        if(Character.isLetter(ch))
		                        {
		                              if(Character.isUpperCase(ch))
		                              {
		                                    int ich2=(int)ch;
		                                    ich2=ich2+32-k2;
		                                    if(ich2<97)
		                                          ich2=123-(97-ich2);
		                                    ch=(char)ich2;
		                                    stbr2.setCharAt(i,ch);
		                              }
		                              else
		                              {
		                                    int ich2=(int)ch;
		                                    ich2=(ich2-32)-k2;
		                                    ich2%=90;
		                                    if(ich2<65)
		                                          ich2=91-(65-ich2);
		                                    ch=(char)ich2;
		                                    stbr2.setCharAt(i,ch);
		                              }
		                        }
		                  
		                  }
		                  System.out.println(stbr2.toString());
		                  break;
                        case "t":
                              System.exit(0);
		     
		      }
	      }
	}
}

