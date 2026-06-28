  import java.util.Random;
  import java.util.Scanner;
  
  public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
    	int number;
    	int total=0;
    	int die;
    	
    	System.out.println("Enter the number of times you want to roll a die:\n");
    	number=scanner.nextInt();
    	
    	
    	
    	for (int i =0 ; i<number;i++ ) {
    		
    		if(number<1) {
    			System.out.println("number cant be negative");
    		}
    		else {
    			die = random.nextInt(1,7);
    			dieprint(die);
    			total+=die;
    			
    			
    		}
    		
    		
    		
    		
    		
    	}
    	
    	
    	System.out.printf("your total is : %d",total);
    	scanner.close();
    	
    	
    
    
    }
    
    static void dieprint(int number) {
    	String one="""
    			--------
    			|      |
    			|   •  |
    			|      |
    			--------
    			  """;
    	String two="""
    			--------
    			|•     |
    			|      |
    			|     •|
    			--------
    			  """;
    	String three="""
    			--------
    			|•     |
    			|   •  |
    			|     •|
    			--------
    			  """;
    	String four="""
    			--------
    			|•    •|
    			|      |
    			|•    •|
    			--------
    			  """;
    	String five="""
    			--------
    			|•    •|
    			|   •  |
    			|•    •|
    			--------
    			  """;
    	String six="""
    			--------
    			|• •  •|
    			|• •  •|
    			|• •  •|
    			--------
    			  """;
    	int times;
    	times = number;
    	
    	
    	switch(times) {
    	case 1-> {System.out.println(one);}
    	case 2-> {System.out.println(two);}
    	case 3-> {System.out.println(three);}
    	case 4-> {System.out.println(four);}
    	case 5-> {System.out.println(five);}
    	case 6-> {System.out.println(six);}
    	
    	
    	
    	
    	
    	}



       
    }

