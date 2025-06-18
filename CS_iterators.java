public class CS_iterators {
    public static void main(String[] args) {
        int  x = 10 ;
        int y = 5 ;
        //conditional statements 
        if (x == 10 ){
            System.out.println("firsy") ;
        }
        else if (x == 5 ) {
            System.out.println("ntg");
        }else {
            System.out.println("ntg again");
        }

// switch ante (x) ki ee value unte edi chey ala 


        switch(x) {
            case 5:
            System.out.println("x is five");
            break;
            case 10:
            System.out.println("x is ten");
            break;
            default:
            System.out.println("x is something else");
        }
    
    
    
    int i = 10 ;
    for (int j =0 ; j <4 ; j++ ) {
        System.out.println("for loop");
    }
    for (;i < 15 ;){  // ela kuda rayochu , 
        System.out.println("for loop22");
        i++ ;
        
    }
    int ii = 5;
        while ( ii < 10 ) {
        System.out.println("while loop");
        ii++;
    }
    int jj = 5;
    do { 
        System.out.println("do while loop");
        jj++;
    } while (jj < 10);
    
    
    int z = x > y ? 5 : 10 ;
    System.out.println(z);
    System.out.println("int z = x > y ? 5 : 10 ;"); 

    
    
    
    
    
    
    
    

    
    }

    
}
