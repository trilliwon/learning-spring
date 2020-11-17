
class FreshJuice {
    enum FreshJuiceSize { SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;

    void print() {
        System.out.println("SOMETHING");
    }
}

public class FreshJuiceTest {
    
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);

        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
           System.out.print( x );
           System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};
  
        for( String name : names ) {
           System.out.print( name );
           System.out.print(",");
        }

        FreshJuice jj = new FreshJuice() {
            void print() {
                super.print();
                System.out.println("SOMETHING ELSE");
            };
        };

        jj.print();
    }
}


interface Animal {
    public void eat();
    public void travel();
 }


class Deer implements Animal {
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void travel() {
        // TODO Auto-generated method stub
        
    }
}