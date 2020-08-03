package pakageOne;

public class string_demo {

	public static void main(String[] args) {
		 
		System.out.print("String Length :" );
		              String message = "Learn Basic Java";
		              int Str_Len= message.length();
		              System.out.println("Length of String is : " + Str_Len);   
		              String Str1 = new String("Welcome to Tutorialspoint.com");
		              String Str2 = new String("Tutorials" );

		              System.out.print("String Length :" );
		              System.out.println(Str1.length());

		              System.out.print("String Length :" );
		              System.out.println(Str2.length());
		              String message_1 = "Learn Basic Java";
		              String message_2 = "and Learn Selenium";
		              String  Concat_message= message_1 +" "+ message_2;
		              System.out.println("Concatenation Result is : " + Concat_message);
		              
		              
		              
		              
		            
		                  int value1 = 1;
		                  int value2 = 2;
		                  int result;
		                  if(value1 == value2)
		                      System.out.println("value1 == value2");
		                  if(value1 != value2)
		                      System.out.println("value1 != value2");
		                  if(value1 > value2)
		                      System.out.println("value1 > value2");
		                  if(value1 < value2)
		                      System.out.println("value1 < value2");
		                  if(value1 <= value2)
		                      System.out.println("value1 <= value2");
		                  //ConditionalDemo1
		                  //&& Conditional-AND  || Conditional-OR
		                 
		                  if((value1 == 1) && (value2 == 2))
		                      System.out.println("value1 is 1 AND value2 is 2");
		                  if((value1 == 1) || (value2 == 1))
		                      System.out.println("value1 is 1 OR value2 is 1");
		          
		                  //ConditionalDemo2
		                  boolean someCondition = true;
		                  result = someCondition ? value1 : value2;

		                  System.out.println(result);
		                  
		                  
		                  //class InstanceofDemo
		                  Parent obj1 = new Parent();
		                  Parent obj2 = new Child();

		                  System.out.println("obj1 instanceof Parent: "
		                      + (obj1 instanceof Parent));
		                  System.out.println("obj1 instanceof Child: "
		                      + (obj1 instanceof Child));
		                  System.out.println("obj1 instanceof MyInterface: "
		                      + (obj1 instanceof MyInterface));
		                  System.out.println("obj2 instanceof Parent: "
		                      + (obj2 instanceof Parent));
		                  System.out.println("obj2 instanceof Child: "
		                      + (obj2 instanceof Child));
		                  System.out.println("obj2 instanceof MyInterface: "
		                      + (obj2 instanceof MyInterface));
		                  
		                  
		                  for(int i=0;i<5;i++)
		                  {
		                     System.out.println("Value of i is: "+i);
		                  }
		                  System.out.println("-----------------------------------------------------");
		                  //for (int j=5;j>0;j--)
		                  //{
		                       //  System.out.println("Value of j is: "+j);
		                         
		                         int i=0;
		                         while (i<15)
		                         {
		                              i=i+3;
		                              System.out.println("Value of i is :"+i);
		                           }
		                         
		                    System.out.println("--------------------------------------------"); 
		                    // In this case, value of j will be 0 and it will run infinite times.
		                      int j=0;
		                      while(j<15)
		                      System.out.println("Value of j is :"+j);
		                      {
		                         j=j+3;
		                      }
		                    }
		                   }
		                      
		                    
		                                       
  
		


class Parent {
	
}
class Child extends Parent implements MyInterface {
	}

interface MyInterface {

}		   
