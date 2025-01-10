import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;   
public class flight_booking{
 static long  choice,dep_choice,arr_choice,len4,ab,i,speeda3,manage_choice,len1,len2,slogin,gender;
        static long  nationchoice,strle, A,ans,visacon,nation,login,cpu,about_choice,other_choice;
        static String flightcode;
        static String pnr;
        static String p;
        static String ui;
        static String seatno;
        static String sflightcode;
        static String sui;
        static String name ;
        static String mobile;
        static String lval;
        static String cardmon;
        static String cardyear;
        static String cvv;
        static String debit;
        static String credit;
        static String surname;
        static String passportnumber;
        static String password;
        static String password1;
        static String question;
        static String ansquestion;
        static String medical;
        static String passport;
        static String upi;
        static String visanumber;
        static String temp2;
        static String user;
        static String pass3;
        static char[] passwords=new char[20];
        static Scanner s=new Scanner(System.in);  
        static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\n\t\t\t\t\t\t\t\t dd/MM/yyyy \n\n\t\t\t\t\t\t\t\t HH:mm:ss");  
        static LocalDateTime now = LocalDateTime.now(); 
            public static void delay(int time){
            try{
                Thread.sleep(time);
               }catch(Exception e) {}
            } 
            static void slog(){
                  visacon=1L;
            System.out.println("\t\t\t\t\t\t\t---------------[Welcome to ASK Airlines]---------------") ;
            delay(50);
            System.out.println("\t\t\t\t\t\t\t\t1> Sign Up\t\t2> Sign in ");
            delay(50);
            System.out.print("\t\t\t\t\t\t\t\t\t\tEnter your choice  : ");
            slogin=s.nextLong();
            if((int)slogin==1){
                    signup();
            }   
           if((int)slogin==2){
                    signin(); 
              }
            else{
                   System.out.println("\t\t\t\t\t\t\t\t\t\t Wrong choice ");    
                      slog();
                  }
            }
                 static void signup(){
                 System.out.print("\t\t\t\t\t\t\t\tENTER USER ID ");
                    System.out.print("\t\t= ");
                    ui=s.next();
                    System.out.println("\n\n");
                    System.out.println("\t\t\t\t\t\t\t*--------------------0--------------------0--------------------0");
                    System.out.println("\t\t\t\t\t\tpersonal detail          information           security            additional");
                    System.out.println("\n\n");
                    System.out.println("\t\t\t\t\t\t\t\tNOTE: you can't change your name,last name, gender,");
                    System.out.println("\t\t\t\t\t\t\t\tmobile number after signing up.so be careful while");
                    System.out.println("\t\t\t\t\t\t\t\tentering your data");
                    System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR FIRST NAME");
                    System.out.print("\t\t= ");
                    name=s.next();
                    System.out.print("\t\t\t\t\t\t\t\tENTER YOUR LAST NAME ");
                    System.out.print("\t\t= ");
                    surname=s.next();
                    System.out.print("\t\t\t\t\t\t\t\tENTER GENDER 1>Male \n\t\t\t\t\t\t\t\t\t\t 2>Female \n\t\t\t\t\t\t\t\t\t\t 3>Other");
                    System.out.print("\t\t= ");
                    gender=s.nextLong();
                    nocheck();
            }
                   static void nocheck(){
                    System.out.print("\t\t\t\t\t\t\t\tENTER YOUR MOBILE NUMBER");
                    System.out.print("\t\t= ");
                    mobile=s.next();
                    ab=mobile.length();
                    if(ab==10)
                    {
                        A=1L;
                        if(gender==1)
                        {
                            System.out.println("\n\t\t\t\t\t\t\t\tMALE" +"\t\t\t\t\t\t\t\t"+ A +"\n"+"\t\t\t\t\t\t\t\t" +name +"\n"+"\t\t\t\t\t\t\t\t" +mobile+"\n");
                            System.out.println("\n\t\t\t\t\t\t\t\tMALE" + "\t\t\t\t\t\t\t\t"+ui +"\n"+ "\t\t\t\t\t\t\t\t"+name +"\n"+"\t\t\t\t\t\t\t\t"+mobile+"\n");
                            information();
                        }
                        else if(gender==2)
                        {
                            System.out.println("\n\t\t\t\t\t\t\t\tFEMALE" +"\t\t\t\t\t\t\t\t"+ A+"\n" +"\t\t\t\t\t\t\t\t" +name +"\n"+"\t\t\t\t\t\t\t\t"+ mobile+"\n");
                            System.out.println("\n\t\t\t\t\t\t\t\tFEMALE" +"\t\t\t\t\t\t\t\t"+ ui+"\n" +"\t\t\t\t\t\t\t\t" +name +"\n"+"\t\t\t\t\t\t\t\t" +mobile+"\n");
                            information();
                        }
                        else if(gender==3)
                        {
                            System.out.println("\n\t\t\t\t\t\t\t\tOTHER " +"\t\t\t\t\t\t\t\t"+ A+"\n" + "\t\t\t\t\t\t\t\t"+name +"\n"+ "\t\t\t\t\t\t\t\t"+mobile+"\n");
                            System.out.println("\n\t\t\t\t\t\t\t\tOTHER" +"\t\t\t\t\t\t\t\t"+ ui+"\n" + "\t\t\t\t\t\t\t\t"+name +"\n"+ "\t\t\t\t\t\t\t\t"+mobile+"\n");
		information();
                        }
                   }
                 else
                    {
                        System.out.println("\t\t\t\t\t\t\t\tEnter correct mobile number:");
                        nocheck();
                    }
               }
              static void information(){
	System.out.println("\n\n");
                    System.out.println("\t\t\t\t\t\t\t\t0--------------------*--------------------0--------------------0");
                    System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
              System.out.println("\n\n");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t No. Place                                                                Code");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t1.  Australia.............................................................BNE");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t2.  China.................................................................BJS");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t3.  Dubai.................................................................DXB");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t4.  England...............................................................LHR");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t5.  France................................................................CDG");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t6.  Germany...............................................................FRA");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t7.  India.................................................................BOM");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t8.  Japan.................................................................KIX");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t9.  Malaysia..............................................................KUL");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t10. Singapore.............................................................SIN");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t11. United States of America..............................................JFK");
                    delay(50);
                    System.out.print("\n\n\t\t\t\t\t\t\t\tENTER YOUR NATIONALITY: [0-11]: ");
                    nationchoice=s.nextLong();
             System.out.println("\n\n");
	System.out.println("\t\t\t\t\t\t\t\t0--------------------*--------------------0--------------------0");
	System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
              System.out.println("\n\n");
               System.out.println("\t\t\t\t\t\t\t\tNOTE: you cannot change your passport number");
                System.out.println("\t\t\t\t\t\t\t\tafter signing up.so be careful while entering your data");
                passcheck();
                   }
             static void passcheck(){
              ab=nationchoice;
               System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR PASSPORT NUMBER:[8 char] ");
	System.out.print("\t\t=");
	passportnumber=s.next();
	strle=passportnumber.length();
	if(strle==8)
	{
		visa:
		 System.out.print("\t\t\t\t\t\t\t\tDO YOU HAVE AN VISA OF ANY COUNTRY: 1.YES");
		 System.out.print("\n\t\t\t\t\t\t\t\t                                      2.NO");
		System.out.print("\t\t=");
		ab=s.nextLong();
		if(ab==1)
		{
		      visa();
		}
		if(ab==2)
		{
			  System.out.println("\t\t\t\t\t\t\t\tYOU NEED A VISA NUMBER TO PROCEED");
                                            System.exit(0);
		}

		else
		{
			 System.out.println("\t\t\t\t\t\t\t\tENTER CORRECT CHOICE");
	              }
	}
	else
	{
		 System.out.println("\t\t\t\t\t\t\t\tPLEASE ENTER VALID PASSPORT NUMBER");
		delay(2000);
		passcheck();
	}
            }
            static void security(){
                            System.out.println("\n\n");
	System.out.println("\t\t\t\t\t\t\t\t0--------------------0--------------------*--------------------0");
	System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
              System.out.println("\n\n");
	System.out.print("\n\t\t\t\t\t\t\t\tSET YOUR PASSWORD");
	System.out.print("\t\t=");
	password=s.next();
	System.out.print("\n\t\t\t\t\t\t\t\tRE-TYPE YOUR PASSWORD");
	System.out.print("\t\t=");
	password1=s.next();
	ans=1;
	ans=password.compareTo(password1);
	if(ans==0)
	{
		System.out.print("\n\t\t\t\t\t\t\t\tSECURITY QUESTION:  MAKE YOUR QUESTION");
		System.out.print("\n\t\t\t\t\t\t\t\tWHAT IS YOUR FAVORITE  ");
		System.out.print("\t\t=");
		question=s.next();
		System.out.print("\n\t\t\t\t\t\t\t\tANSWER OF YOUR QUESTION:");
		System.out.print("\t=");
		ansquestion=s.next();
	              additional();
	}
	else
	{
		System.out.print("\n\t\t\t\t\t\t\t\tENTER CORRECT PASSWORD:");
		delay(500);
	              security();
               }   
             }
             static void additional(){
                             System.out.println("\n\n");
	System.out.println("\t\t\t\t\t\t\t\t0--------------------0--------------------0--------------------*");
	System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
              System.out.println("\n\n");
	System.out.println("\t\t\t\t\t\t\t\tNOTE: you can't change your medical condition status");
	System.out.println("\t\t\t\t\t\t\t\tafter signing up.so be careful while entering your data");
	System.out.print("\n\t\t\t\t\t\t\t\tDO YOU HAVE ANY MEDICAL CONDITION  1.YES");
	System.out.print("\n\t\t\t\t\t\t\t                                          2.NO");
	System.out.print("\t\t=");
	ab=s.nextLong();
	if(ab==1)
	{
		System.out.print("\n\t\t\t\t\t\t\t\tGIVE US SHORT DISCRIPTION ABOUT YOUR MEDICAL CONDITION OR NAME : ");
		medical=s.next();
	              payment();
	 }
	 if(ab==2)
	 {
	      	 payment();
	 }       
             } 
              static void  payment(){
                System.out.println("\n\n");
	System.out.println("\t\t\t\t\t\t\t\t0--------------------0--------------------0--------------------*");
	System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
              System.out.println("\n\n");
                System.out.println("\t\t\t\t\t\t\t\tNOTE: you can't change your credit card no,debit card no and upi");
	   System.out.println("\t\t\t\t\t\t\t\tafter signing up.so be careful while entering your data");
		
	System.out.print("\n\t\t\t\t\t\t\t\tDO YOU WANT TO SAVE YOUR CREDIT CARD,DEBIT CARD OR UPI: 1.YES");
	System.out.print("\n\t\t\t\t\t\t\t\t                                           2.NO \t\t\t");
	ans=s.nextLong();
	if(ans==1)
	{
		
		System.out.println("\n\n");
	              System.out.println("\t\t\t\t\t\t\t\t0--------------------0--------------------0--------------------*");
	              System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
          	              System.out.println("\n\n");
            	              System.out.println("\t\t\t\t\t\t\t\tNOTE: you can't change your credit card no,debit card no and upi");
	              System.out.println("\t\t\t\t\t\t\t\tafter signing up.so be careful while entering your data");
		System.out.print("\n\t\t\t\t\t\t\t\tWHAT DO YOU WANT TO SAVE:");
		System.out.print("\n\t\t\t\t\t\t\t\t1.CREDIT CARD");
		System.out.print("\n\t\t\t\t\t\t\t\t2.DEBIT CARD");
		System.out.print("\n\t\t\t\t\t\t\t\t3.UPI \t\t\t");
		ab=s.nextLong();
		if(ab==1)
		{
		       credit();
		}
		if(ab==2)
		{
		       debit();
		}
		if(ab==3)
		{
		      upi();
		}
                      }
                   if(ans==2)
	              {
 		System.out.print("\n\t\t\t\t\t\t\t\tOK NO PROBLEM:");
		delay(1000);
                            System.out.print("\n\n");
	              slog();
	               }       
            }
         static void credit(){
		System.out.println("\n\n");
	              System.out.println("\t\t\t\t\t\t\t\t0--------------------0--------------------0--------------------*");
	              System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
          	              System.out.println("\n\n");
			System.out.println("\t\t\t\t\t\t\t\tNOTE: you can't change your credit card number ");
		              System.out.println("\t\t\t\t\t\t\t\tafter signing up.so be careful while entering your data");
			System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR CREDIT CARD NUMBER");
			System.out.print("\t\t=");
			credit=s.next();
			ans=credit.length();
                                         creditmon(); 
                                     }
	static void creditmon(){
                               if(ans==16)
			{
			
				System.out.print("\n\t\t\t\t\t\t\t\tMONTH");
				System.out.print("\t\t=");
				cardmon=s.next();
				ans=cardmon.length(); 
                                                       credityear();     
                                             }
                                     else{
                                                        System.out.print("\n\t\t\t\t\t\t\t\tplease Enter correct credit card number");
			                credit();
                                          }
                                           }
             static void credityear(){
                                                        if(ans==2||ans==1)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tYEAR");
					System.out.print("\t\t=");
					cardyear=s.next();
					ans=cardyear.length();
                                                                     cvv();
                                                       }
                                                        else{
					System.out.print("\n\t\t\t\t\t\t\t\tplease Enter correct credit card number");
			                            creditmon();
                                                              }
                                                  }
                                                 static void cvv(){

                                                          if(ans==4)
					{
						cvv:
						System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR CVV");
						System.out.print("\t\t=");
						cvv=s.next();
						ans=cvv.length();
						if(ans==3)
						{
							System.out.print("\n\t\t\t\t\t\t\t\tTHANK YOU FOR JOINING ASK AIRLINSE");
						              payment();

						}
						else
						{
						System.out.print("\n\t\t\t\t\t\t\t\tplease Enter correct cvv number");
					              cvv();
						}
                                                                      }
                                                                        }

	                        static void debit(){ 

			System.out.println("\n\n");
	                           System.out.println("\t\t\t\t\t\t\t\t0--------------------0--------------------0--------------------*");
	                           System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
          	                           System.out.println("\n\n");
		 	System.out.println("\t\t\t\t\t\t\t\tNOTE: you can't change your debit card number");
			 System.out.println("\t\t\t\t\t\t\t\tafter signing up.so be careful while entering your data");
		              System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR DEBIT CARD NUMBER");
			System.out.print("\t\t=");
			debit=s.next();
			ans=debit.length(); 
                                          debitmon();
                                                            }

                                       static void debitmon(){
                                                         if(ans==16){
				System.out.print("\n\t\t\t\t\t\t\t\tMONTH");
				System.out.print("\t\t=");
				cardmon=s.next();
				ans=cardmon.length();
                                                        debityear();
                                                            }
                                                                        
                                                          else{
                                                                System.out.print("\n\t\t\t\t\t\t\t\tplease Enter correct Debit card number");
                                                                 debit();
                                                                }
                                                           }
                                        static void debityear(){
                                                                    if(ans==2||ans==1){
					System.out.print("\n\t\t\t\t\t\t\t\tYEAR");
					System.out.print("\t\t=");
					cardyear=s.next();
					ans=cardyear.length();
                                                                     cvvd();
                                                                     }
                                                            else{
                                                                  System.out.print("\n\t\t\t\t\t\t\t\tplease Enter correct Debit card Month");
                                                                    debitmon(); 
                                                                  }
                                                           }	
                                                   static void cvvd(){
                                                                                if(ans==4){
						System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR CVV");
						System.out.print("\t\t=");
						cvv=s.next();
						ans=cvv.length();
						if(ans==3)
						{
							System.out.print("\n\t\t\t\t\t\t\t\tTHANK YOU FOR JOINING ASK AIRLINSE");
						              payment();
						}
						else
						{
						System.out.print("\n\t\t\t\t\t\t\t\tplease Enter correct cvv number");
					              cvvd();
						}
                                                                                         }
                                                                                else
					{
						System.out.print("\n\t\t\t\t\t\t\t\tplease Enter correct credit card year");
						debityear();
					}
                                                           }
                                                    static void upi(){
			System.out.println("\n\n");
	                           System.out.println("\t\t\t\t\t\t\t\t0--------------------0--------------------0--------------------*");
	                           System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
          	                           System.out.println("\n\n");
                                        System.out.println("\t\t\t\t\t\t\t\tNOTE: you can't change your upi after signing up.");
			System.out.println("\t\t\t\t\t\t\t\tso be careful while entering your data");
			System.out.print("\n\t\t\t\t\t\t\t\tDO YOU WANT TO ADD UPI: 1. YES");
			System.out.print("\n\t\t\t\t\t\t                                          2.NO");
                                         System.out.print("\t\t=");
			A=s.nextLong();
			if(A==1)
			{
                                            upir();
                                            }
                                            else if(A==2){
                                               System.out.print("\n\t\t\t\t\t\t\t\tTHANK YOU FOR JOINING ASK AIRLINSE");
                                              }
                                            else
		                 {
			System.out.print("\n\t\t\t\t\t\t\t\tPLEASE ENTER CORRECT CHOICE");
		             payment();
	                   	    }
                                        }
                                          
			           static void upir(){
				System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR MOBILE NUMBER");
				System.out.print("\t\t=");
				System.out.print("\t@ASK");
				upi=s.next();
				ab=upi.length();
				if(ab==10)
				{
				  System.out.print("\n\t\t\t\t\t\t\t\tTHANK YOU FOR JOINING ASK AIRLINSE");
				   payment();
				}
				else
				{
				System.out.print("\n\t\t\t\t\t\t\t\tENTER VALID NUMBER:");
				 upir();

				}
			}

              static void visa(){
	System.out.println("\n\n");
                    System.out.println("\t\t\t\t\t\t\t\t0--------------------*--------------------0--------------------0");
                    System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
              System.out.println("\n\n");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t No. Place                                                                Code");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t1.  Australia.............................................................BNE");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t2.  China.................................................................BJS");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t3.  Dubai.................................................................DXB");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t4.  England...............................................................LHR");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t5.  France................................................................CDG");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t6.  Germany...............................................................FRA");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t7.  India.................................................................BOM");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t8.  Japan.................................................................KIX");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t9.  Malaysia..............................................................KUL");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t10. Singapore.............................................................SIN");
	delay(50);System.out.println("\t\t\t\t\t\t\t\t11. United States of America..............................................JFK");
	System.out.print("\n\n\t\t\t\t\t\t\t\tENTER YOUR VISA COUNTRY: [0-11]: ");
	visacon=s.nextLong();
	if(visacon>=1&&visacon<=11)
	{
	System.out.print("\n\n\t\t\t\t\t\t\t\t"+visacon);
	if(nationchoice!=visacon)
	{
	System.out.println("\n\n");
	System.out.println("\t\t\t\t\t\t\t\t0--------------------*--------------------0--------------------0");
	System.out.println("\t\t\t\t\t\t\tpersonal detail         information             security           additional");
              System.out.println("\n\n");
	System.out.println("\t\t\t\t\t\t\t\tNOTE: you can't change your visa number");
	 System.out.println("\t\t\t\t\t\t\t\tafter signing up.so be careful while entering your data");
	System.out.print("\n\n\t\t\t\t\t\t\t\tENTER YOUR VISA NUMBER [8 NUM]: ");
	 System.out.print("\t\t=");
	if(visacon==1)
	{
		
		System.out.print("\tAUS");
		visacon=1L;
	}
	if(visacon==2)
	{
		System.out.print("\tCHI");
		visacon=2L;
	}
	if(visacon==3)
              {
		System.out.print("\tDUB");
		visacon=3L;
	}
	if(visacon==4)
	{
		System.out.print("\tENG");
		visacon=4L;
	}
	if(visacon==5)
	{
		System.out.print("\tFRA");
		visacon=5L;
	}
	if(visacon==6)
	{
		System.out.print("\tGER");
		visacon=6L;
	}
	if(visacon==7)
	{
		System.out.print("\tIND");
		visacon=7L;
	}
	if(visacon==8)
	{
		System.out.print("\tJAP");
		visacon=8L;
	}
	if(visacon==9)
	{
		System.out.print("\tMAL");
		visacon=9L;
	}
	if(visacon==10)
	{
		System.out.print("\tSIN");
		visacon=10L;
	}
	if(visacon==11)
	{
		System.out.print("\tUSA");
		visacon=11L;
	}
	visanumber=s.next();
	strle=visanumber.length();
	if(strle==8)
	{
		security();
	}
      }
       else
	{
	System.out.print("\n\n\t\t\t\t\t\t\t\tENTER RIGHT CHOICE:");
              visa();
    }
}
                                      }

                static void signin(){
                                          int c=1;
                                         System.out.print("\n\n\t\t\t\t\t\t\t\tENTER YOUR USER ID:");
			ui=s.next();
			if(ui==null)
			{
				System.out.print("\n\n\t\t\t\t\t\t\t\tEnter right user id\n");
				signin();
			}
			else
			{
				System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR PASSWORD: ");
                                                       password1=s.next();
                                        ab=password.compareTo(password1);
			if(ab==0)
			{       login=1;
					System.out.print("\n\t\t\t\t\t\t\t\tNAME               :");System.out.print(name);
					System.out.print("\n\t\t\t\t\t\t\t\tPASSPORT NUMBER    :");System.out.print(passportnumber);
					System.out.print("\n\t\t\t\t\t\t\t\tMOBILE NUMBER      :");System.out.print(mobile);
					System.out.print("\n\t\t\t\t\t\t\t\tGENDER             :");System.out.print(gender);
				if(nation==1)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : Australia");
				}
				if(nation==2)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : China");
				}
				if(nation==3)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : Dubai");
				}
				if(nation==4)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : England");
				}
				if(nation==5)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : France");
				}
				if(nation==6)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : Germany");
				}
				if(nation==7)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : India");
				}
				if(nation==8)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : Japan");
				}
				if(nation==9)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : Malaysia");
				}
				if(nation==10)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : Singapore");
				}
				if(nation==11)
					{
					System.out.print("\n\t\t\t\t\t\t\t\tNATIONALITY        : United States of America");
				               }
					System.out.print("\n\t\t\t\t\t\t\t\tMEDICAL CONDITION  : "+medical);

				 if(ans==1)
				 {
					System.out.print("\n\t\t\t\t\t\t\t\tCREDIT CARD NUMBER :"+credit);
				 }
				 else if(ans==2)
				 {
					System.out.print("\n\t\t\t\t\t\t\t\tDEBIT CARD NUMBER  :"+debit);
				 }

				 else if(ans==3)
				 {
					System.out.print("\n\t\t\t\t\t\t\t\tUPI                :"+upi);
				 }
				if(visacon==1)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : AUS"+visanumber);
					visacon=1L;
				}
				if(visacon==2)
				{
					System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : CHI"+visanumber);
					visacon=2L;
				}
			if(visacon==3)
			{
				System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : DUB"+visanumber);
				visacon=3L;
			}
			if(visacon==4)
			{
				System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : ENG"+visanumber);
				visacon=4L;
			 }
			 if(visacon==5)
			{
				System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : FRA"+visanumber);
				visacon=5L;
			}
			if(visacon==6)
			{
				System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : GER"+visanumber);
				visacon=6L;
			}
			if(visacon==7)
			{
				System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : IND"+visanumber);
				visacon=7L;
			}
			if(visacon==8)
			{
				System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : JAP"+visanumber);
				visacon=8L;
			}
			if(visacon==9)
			{
				System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : MAL"+visanumber);
				visacon=9L;
			}
			if(visacon==10)
			{
				System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : SIN"+visanumber);
				visacon=10L;
			}
			if(visacon==11)
			{
				System.out.print("\n\t\t\t\t\t\t\t\tVISA NUMBER        : USA"+visanumber);
				visacon=11L;
			}
			 delay(5000);
			 mainmenu();
		  }

				else
			{
			System.out.print("\n\t\t\t\t\t\t\t\tenter correct userid or password");
			signin();
			}
	 }
               
                  }
                  
static void mainmenu()
{
about_choice=0;
other_choice=0;
dep_choice=0;
arr_choice=0;
manage_choice=0;
speeda3=100;
System.out.print("\n\n\n");
delay(150);
System.out.print("\n\t\t\t\t\t\t1. Book a Flight");
delay(150);
System.out.print("\t\t\t\t\t2. Check In");
delay(150);
System.out.print("\n\n\t\t\t\t\t\t3. Manage Flight");
delay(150);
System.out.print("\t\t\t\t\t4. Check Status");
delay(150);
System.out.print("\n\n\t\t\t\t\t\t5. Account");
delay(150);
System.out.print("\t\t\t\t\t\t6. About ASKAir");
 delay(150);
System.out.print("\n\n\t\t\t\t\t\t7. Other");
 delay(150);
System.out.print("\t\t\t\t\t\t8. Exit");
 delay(150);
System.out.print("\n\n\t\t\t\t\t\tEnter Your Choice [1-8]: ");
choice=s.nextLong();
if (login!=1)
 {
	System.out.print("\n\t\t\t\t\t\t\t\tPLEASE SIGH IN TO PROCEED\n\n");
	delay(3000);
	slog();
 }
if(choice==1){
departure();
}
else if(choice==2){
Check();
}

else if(choice==3){
manage();
}

else if(choice==4){
status();
}

else if(choice==5){
Account();
}

else if(choice==6){
About();
}

else if(choice==7){
Other();
}
else if(choice==8){
System.exit(0);
}
}
static void departure(){
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[DEPARTURE]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t3.  Dubai..............Dubai International Airport................DXB");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t4.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.  India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Japan..............Kansai International Airport...............KIX");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t9.  Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t11. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-11]: ");
dep_choice=s.nextLong();
 arrival();
}
static void arrival(){
if(dep_choice==1){
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t1.  China..............Beijing Capital International Airport......BJS");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  Dubai..............Dubai International Airport................DXB");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t3.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t4.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.  Japan..............Kansai International Airport...............KIX");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
		 case 1:
			  pnr="BNEBJS";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="BNEDXB";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="BNELHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="BNECDG";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="BNEFRA";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="BNEBOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="BNEKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="BNEDME";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="BNESIN";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="BNEJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==2){
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  Dubai..............Dubai International Airport................DXB");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t3.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t4.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.  Japan..............Kansai International Airport...............KIX");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {   
		 case 1:
			  pnr="BJSBNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="BJSDXB";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="BJSLHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="BJSCDG";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="BJSFRA";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="BJSBOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="BJSKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="BJSDME";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="BJSSIN";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="BJSJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==3){
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t3.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t4.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.  Japan..............Kansai International Airport...............KIX");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
                           case 1:
			  pnr="BJSBNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			  pnr="DXBBJS";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="DXBLHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="DXBCDG";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="DXBFRA";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="DXBBOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="DXBKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="DXBDME";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="DXBSIN";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="DXBJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==4){
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t3.  Dubai..............Dubai International Airport................DXB");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t4.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.  Japan..............Kansai International Airport...............KIX");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
		 case 1:
			  pnr="LHRBNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="LHRBJS";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="LHRDXB";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="LHRCDG";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="LHRFRA";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="LHRBOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="LHRKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="LHRDME";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="LHRSIN";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="LHRJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==5){
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t3.  Dubai..............Dubai International Airport................DXB");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t4.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.  Japan..............Kansai International Airport...............KIX");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
		 case 1:
			  pnr="CDGBNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="CDGBJS";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="CDGDXB";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="CDGLHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="CDGFRA";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="CDGBOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="CDGKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="CDGDME";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="CDGSIN";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="CDGJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==6){
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t3.  Dubai..............Dubai International Airport................DXB");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t4.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.  Japan..............Kansai International Airport...............KIX");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
		 case 1:
			  pnr="FRABNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="FRABJS";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="FRADXB";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="FRALHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="FRACDG";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="FRABOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="FRAKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="FRADME";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="FRASIN";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="FRAJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==7)
{delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t3.  Dubai..............Dubai International Airport................DXB");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t4.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.  Japan..............Kansai International Airport...............KIX");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
		 case 1:
			  pnr="BOMBNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="BOMBJS";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="BOMDXB";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="BOMLHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="BOMCDG";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="BOMFRA";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="BOMKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="BOMDME";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="BOMSIN";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="BOMJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==8){
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t3.  Dubai..............Dubai International Airport................DXB");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t4.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.   India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
		 case 1:
			  pnr="KIXBNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="KIXBJS";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="KIXDXB";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="KIXLHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="KIXCDG";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="KIXFRA";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="KIXBOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="KIXDME";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="KIXSIN";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="KIXJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==9){
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t3.  Dubai..............Dubai International Airport................DXB");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t4.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.   India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Japan..............Kansai International Airport...............KIX");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Singapore..........Changi Airport.............................SIN");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
		 case 1:
			  pnr="DMEBNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="DMEBJS";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="DMEDXB";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="DMELHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="DMECDG";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="DMEFRA";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="DMEBOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="DMEKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="DMESIN";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="DMEJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==10){delay(50);
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t3.  Dubai..............Dubai International Airport................DXB");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t4.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.   India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Japan..............Kansai International Airport...............KIX");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. US.................John F Kennedy International Airport.......JFK");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
		 case 1:
			  pnr="SINBNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="SINBJS";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="SINDXB";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="SINLHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="SINCDG";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="SINFRA";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="SINBOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="SINKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="SINDME";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="SINJFK";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
else if(dep_choice==11){
delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t         -----------------[ARRIVAL]-----------------");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\tNo. Place               Airport                                 Code");
 delay(50); 
 System.out.print("\n\t\t\t\t\t\t\t\t1.  Australia..........Brisbane Airport...........................BNE");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t2.  China..............Beijing Capital International Airport......BJS");
 delay(50);
  System.out.print("\n\t\t\t\t\t\t\t\t3.  Dubai..............Dubai International Airport................DXB");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t4.  England............Heathrow Airport...........................LHR");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t5.  France.............Charles de Gaulle Airport..................CDG");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t6.  Germany............Frankfurt Interational Airport.............FRA");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t7.   India..............Chhatrapati Shivaji International Airport..BOM");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t8.  Japan..............Kansai International Airport...............KIX");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t9. Russia.............Moscow Domodedovo Airport..................DME");
 delay(50);
System.out.print("\n\t\t\t\t\t\t\t\t10. Singapore..........Changi Airport.............................SIN");
 delay(50);
 System.out.print("\n\t\t\t\t\t\t\t\t0.  To Go Back To Main Menu.");
 System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [0-10]: ");
arr_choice=s.nextLong();
switch((int)arr_choice)
	   {
		 case 1:
			  pnr="JFKBNE";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 2:
			   pnr="JFKBJS";
			  System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 3:
			   pnr="JFKDXB";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 4:
			  pnr="JFKLHR";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 5:
			   pnr="JFKCDG";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);			 
                                             delay(2000);
			    mainmenu();
		 case 6:
			  pnr="JFKFRA";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 7:
			   pnr="JFKBOM";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 8:
			   pnr="JFKKIX";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 9:
			   pnr="JFKDME";
                                            System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 10:
                                           pnr="JFKSIN";
			   System.out.print("\n\t\t\t\t\t\t\t\tYOUR PNR IS :"+pnr);
			    delay(2000);
			    mainmenu();
		 case 0:
			   departure();

		 default:
			   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
			   arrival();
}
}
}
static void manage(){
int i=1;
 System.out.print("\n\t\t\t\t\t\t\t\t--------------------[MANAGE FLIGHT]------------------- ");
 System.out.print("\n\t\t\t\t\t\t\t\t1. Facilities");
 System.out.print("\n\t\t\t\t\t\t\t\t2. Cancel Booking");
 System.out.print("\n\t\t\t\t\t\t\t\t3. Go Back");
 System.out.print("\n\t\t\t\t\t\t\t\tChoose from the above: ");
 manage_choice=s.nextLong();
   switch((int)manage_choice)
 {
   case 1:
  System.out.print("\n\t\t\t\t\t\t\t\t-------------------[FACILITIES]----------------");
  System.out.print("\n\t\t\t\t\t\t\t\t1> First Class");
  System.out.print("\n\t\t\t\t\t\t\t\t ASK Airlines First Class. The new definition of luxury.");
  System.out.print("\n\t\t\t\t\t\t\t\t2> Executive Class");
  System.out.print("\n\t\t\t\t\t\t\t\tASK Airlines Executive Class. A haven for business & leisure travelers.");
  System.out.print("\n\t\t\t\t\t\t\t\t3> Economy Class");
  System.out.print("\n\t\t\t\t\t\t\t\tASK Airlines Economy Class. For our budget minded travelers.");
   try{
   System.out.println("\n\t\t\t\t\t\t\t\tPress Enter to continue... ");
  System.in.read(); 
  }catch(IOException e){}
  delay(1000);
  manage();
 case 2:
       System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR FLIGHT CODE");
       System.out.print("\n\t\t\t\t\t\t\t\t[flight code is first 6 digit of you PNR]");
       System.out.print("\t\t=");
       flightcode=s.next();
       System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR USERNAME");
       System.out.print("\t\t=");
       ui=s.next();
        
      System.out.print("\t\t\t\t\t\t\t\t\t [");
   while(i<=30)
         {
       delay(100);
        System.out.print("-");
        i++;
       }
       System.out.print("]");
       System.out.print("\n\t\t\t\t\t\t\t\tYOUR TICKET IS SUCCESFULLY CANCELED");
       delay(1000);
       manage();
  case 3:
       mainmenu();
    default:
       System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Arrival Function");
        manage();
   } 
}
    static void status(){
               System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR FLIGHT CODE");
	 System.out.print("\n\t\t\t\t\t\t\t\t[flight code is first 6 digit of you PNR]");
	 System.out.print("\t\t=");
	 sflightcode=s.next();
	 System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR USERNAME");
	 System.out.print("\t\t=");
	 sui=s.next();
	 len1=sflightcode.length();
	 len2=sui.length();
	 while(i<=len1)
	 {
	 if(sflightcode==flightcode)
	 {
	   i++;
	  }
	  else
	  {
	   System.out.print("\n\t\t\t\t\t\t\t\tUsername or flightcode is wrong please enter correct");
	   status();
	  }
	 }
	  System.out.println(dtf.format(now)); 
	 delay(2000);
	 mainmenu();
   }
         static void Account(){
	delay(200);
	System.out.print("\n\t\t\t\t\t\t\t\t1. Change User Info");
	delay(250);
	System.out.print("\n\t\t\t\t\t\t\t\t2. LogOut");
	delay(300);
	System.out.print("\n\t\t\t\t\t\t\t\t3. Go Back ");
	delay(300);
	System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [1-3] :   ");
	A=s.nextLong();
	switch((int)A)
	 {
case 1:
	delay(200);
	System.out.print("\n\t\t\t\t\t\t\t\t1. Change your Password");
	delay(200);
	System.out.print("\n\t\t\t\t\t\t\t\t2. Change your Username");
	delay(300);
	System.out.print("\n\t\t\t\t\t\t\t\t3. Go Back ");
	delay(300);
	System.out.print("\n\t\t\t\t\t\t\t\tEnter Your Choice [1-3] :   ");
	cpu=s.nextLong();
	  switch((int)cpu)
	       {
    case 1:    
		System.out.print("\n\t\t\t\t\t\t\t\tyour current password is: "+ password);
		System.out.print("\n\t\t\t\t\t\t\t\tset your new password : ");
		password=s.next();
		 System.out.print("\n\t\t\t\t\t\t\t\tTHANK YOU FOR JOINING ASK AIRLINES");
		Account();
     case 2:
	System.out.print("\n\t\t\t\t\t\t\t\tyour current user id is: " +ui);
	System.out.print("\n\t\t\t\t\t\t\t\tset your new user id : ");
	ui=s.next();
	System.out.print("\n\t\t\t\t\t\t\t\tTHANK YOU FOR JOINING ASK AIRLINES");
	Account();
  case 3:
	     Account();
  default:
	   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running About Function.");
	   Account();
		}
  case 2:
	   System.out.print("\n\t\t\t\t\t\t\t\tTHANK YOU FOR JOINING ASK AIRLINES");
	   delay(2000);
	   System.exit(0);
  case 3:
	   mainmenu();
  default:
	   System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running About Function.");
	    Account();
	  }
             }
    static void About(){
System.out.print("\n\t\t\t\t\t\t\t\t-------------------[ABOUT]--------------- ");
 delay(150);
System.out.print("\n\t\t\t\t\t\t\t\t1. About Us.");
 delay(150);
System.out.print("\n\t\t\t\t\t\t\t\t2. Services.");
 delay(150);
 System.out.print("\n\t\t\t\t\t\t\t\t3. Go Back To The Main Menu.");
 delay(150);
 System.out.print("\n\t\t\t\t\t\t\t\tChoose from the above: ");
 about_choice=s.nextLong();
 switch((int)about_choice)
 {
case 1:
  delay(150);System.out.print("\n\t\t\t\t\t\t\t\t----------------------[ASK Airlines]----------------------");
  delay(50);
  System.out.print("\n\t\t\t\t\t\t\t         ASKAIR is an international aviation group founded in 1995,");
  delay(50);
  System.out.print("\n\t\t\t\t\t\t\t          serving millions of passengers with global connections in  ");
  delay(50);
  System.out.print("\n\t\t\t\t\t\t\t         over 11 countries.In 2017, it generated about 31.7 Million  ");
  delay(50);
  System.out.print("\n\t\t\t\t\t\t\t           USD and had over 40000 hardworking staff members. This    ");
  delay(50);
  System.out.print("\n\t\t\t\t\t\t\t          revolutionary idea was started by 4 individuals aspiring   ");
  delay(50);
  System.out.print("\n\t\t\t\t\t\t\t          for an inexpensive and luxurious way to travel the world.  ");
  delay(50);
  System.out.print("\n\t\t\t\t\t\t\t         When you fly with us, we guarantee that you will experience ");
  delay(50);
  System.out.print("\n\t\t\t\t\t\t\t           something unlike ever before. Have a fantastic journey.   ");
  delay(50);
  System.out.print("\n\t\t\t\t\t\t\t                       -The ASK Airlines Team                      ");
  delay(7000);
   About();

case 2:
  delay(150);System.out.print("\n\t\t\t\t\t\t\t\t--------------------[SERVICES]---------------------");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\t\t1> Handicap services like Wheelchairs,");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\t\t2> Medical Services/Emergency landing,");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\t\t3> High Security,");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\t\t4> Personal Information Privacy,");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\t\t5> In-flight Food & Entertainment.");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\t\t6> and much more.");
  delay(7000);
  About();

case 3:
    mainmenu();

default:
  System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running About Function.");
  delay(1000);
  About();
    }
  }

 static void Other(){
 delay(150);System.out.print("\n\t\t\t\t\t\t\t\t--------------------[OTHER]-------------------");
 delay(150);
 System.out.print("\n\t\t\t\t\t\t\t\t1. Rules/Disciplines.");
 delay(150);
 System.out.print("\n\t\t\t\t\t\t\t\t2. Contact Us.");
 delay(150);
 System.out.print("\n\t\t\t\t\t\t\t\t3. Go Back To The Main Menu.");
 delay(150);
 System.out.print("\n\t\t\t\t\t\t\t\tChoose from the above: ");
 other_choice=s.nextLong();
    switch((int)other_choice)
      {
	case 1:
	      delay(150);System.out.print("\n\t\t\t\t\t\t\t         ------------------[RULES]-----------------");
  delay(150);
 System.out.print("\n\t\t\t\t\t\t\tAs per Government Regulations, all passengers at airports will be frisked   ");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\tand their hand baggage checked by the security staff before boarding the    ");
  delay(150);
 System.out.print("\n\t\t\t\t\t\t\tflight.                                                                     ");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\tIn case of damaged or lost baggage, the passenger should immediately report ");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\tit to our ground staff on arrival, before leaving the terminal building.    ");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\tThe boarding gate closes 25 minutes prior to departing time.Please check the");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\tflight information screen to get the latest updates.                        ");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\tPassengers are requested to co-operate with ASK Airline and the relevant  ");
  delay(150);
  System.out.print("\n\t\t\t\t\t\t\tauthorities. Have a pleasant flight.                                        ");
  delay(7000);
  Other();

case 2:
  delay(150);System.out.print("\n\t\t\t\t\t\t\t\t  ----------------[CONTACT]-----------------");
  delay(150);
  System.out.print("\n\n\t\t\t\t\t\t\t\tWEBSITE: ASK Airline.com");
  delay(150);
  System.out.print("\n\n\t\t\t\t\t\t\t\tEMAIL: ASK.support@gmail.com , askair@gmail.com");
  delay(150);
  System.out.print("\n\n\t\t\t\t\t\t\t\tPHONE: 2889402176");
  delay(5000);
  Other();

case 3:
   mainmenu();

default:
  System.out.print("\n\t\t\t\t\t\t\t\tINPUT ERROR. Re-running Other Function.");
  delay(1000);
  Other();
       }

                       }
  static void Check(){
 System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR FLIGHT CODE");
 System.out.print("\n\t\t\t\t\t\t\t\t[flight code is first 6 digit of you PNR]");
 System.out.print("\t\t=");
 flightcode=s.next();
 System.out.print("\n\t\t\t\t\t\t\t\tENTER YOUR USERNAME");
 System.out.print("\t\t=");
 ui=s.next();
System.out.print("\n\n\n");
System.out.println("\t\t\t\t	      A	  	         B		    C		       D		  E");
System.out.println("\t\t\t\t             _ _                _ _                _ _                _ _                _ _");
System.out.println("\t\t\t\t  1         |_ _|              |_ _|              |_ _|              |_ _|              |_ _|");
System.out.println("\t\t\t\t             _ _                _ _                _ _                _ _                _ _");
System.out.println("\t\t\t\t  2         |_ _|              |_ _|              |_ _|              |_ _|              |_ _|");
System.out.println("\t\t\t\t             _ _                _ _                _ _                _ _                _ _");
System.out.println("\t\t\t\t  3         |_ _|              |_ _|              |_ _|              |_ _|              |_ _|");
System.out.println("\t\t\t\t             _ _                _ _                _ _                _ _                _ _");
System.out.println("\t\t\t\t  4         |_ _|              |_ _|              |_ _|              |_ _|              |_ _|");
System.out.println("\t\t\t\t             _ _                _ _                _ _                _ _                _ _");
System.out.println("\t\t\t\t  5         |_ _|              |_ _|              |_ _|              |_ _|              |_ _|");

 System.out.print("\n\n\t\t\t\t\t\t\t\tENTER SEAT NUMBER (EX:A1)     :");
 seatno=s.next();
 ab=seatno.length();
 if(ab==2)
 {
   System.out.print("\n\t\t\t\t\t\t\t\t\t [");
   while(i<=30)
         {
       delay(100);
        System.out.print("-");
        i++;
       }
       System.out.print("]"); 
 }
System.out.print("\n\n\t\t\t\t\t\t\t\tYOUR BORDING PASS IS SEND SUCCESSFULLY");
 System.out.print("\n\n\t\t\t\t\t\t\t\tTHANK YOU OF CHOOSING ASK AIRLINES");
 delay(1000);
  mainmenu();
}
public static void main(String[] args){
   slog(); 
   mainmenu();        
}
}