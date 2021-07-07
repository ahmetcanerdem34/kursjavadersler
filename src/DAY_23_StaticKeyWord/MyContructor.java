package DAY_23_StaticKeyWord;

public class MyContructor {
    
    int x =3;
    int y =5;
    
    MyContructor () {
        x+=1;
        System.out.println("-x"+x);       
    }
    
    MyContructor (int i) {
        this();
        
        this.y=i;
        x+=y;
        System.out.println("-x"+x);
        }
    
    MyContructor (int i, int i2) {
        this(3);
        
        this.x-=4;
        System.out.println("-x"+x);
    }
    public static void main(String[] args) {
        MyContructor mc1 = new MyContructor (4,3);
   	

	}

}
