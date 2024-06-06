package Toys;

class Main {
	  public static void main(String[] args) {
	    //add necessary test cases here

	    //PART 1
	    Toy t = new Toy( "sorry" );	
	    System.out.println( t.getCount() );	
	    System.out.println( t );
	    System.out.println( t.getName() );	
	    Toy z = new Toy( "ji goe" );	
	    System.out.println(z.getCount() );
	    z.setCount( 5 );	
	    System.out.println(z.getCount() );
	    System.out.println( z );
	    System.out.println();
	    System.out.println();


	    ToyStore sto = new ToyStore();	
	    System.out.println( sto );
	    String[] s;	
	    s = "sorry bat sorry sorry sorry train train teddy teddy ball ball".split(" ");	
	    sto.loadToys( s );	
	    System.out.println( sto );
	    System.out.println( "max == " + sto.getMostFrequentToy() );
	    System.out.println( sto.getThatToy( "sorry" ) );
	  }
	}