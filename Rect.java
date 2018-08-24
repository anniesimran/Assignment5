import java.util.*;
class Rect 
{ 
            int l,b; 
            void setval(int x,int y) 
            { 
                        l=x; 
                        b=y; 
            } 
            int area() 
            { 
                        return (l*b); 
            } 
}; 
class Area
{ 
            
            public static void main (String args[]) 
            { 
                Scanner sc = new Scanner(System.in);
              System.out.println("Enter length ");
                 int x = sc.nextInt();
              System.out.println("Enter Breadth");
                 int y = sc.nextInt();
                        Rect rect = new Rect(); 
                        rect.setval (x,y); 
                        System.out.println("Area of Rectangle is : "+rect.area()); 
            } 
};