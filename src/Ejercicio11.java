public class Ejercicio11 {
	
	public static void main(String[] args){

		int i = 10;
		Customer[] cus = new Customer[i];
		// oh, un cambio!

		for(int j = 0; j < i; j++){
			cus[j] = new Customer();
		}
		
		cus[0] = new Employee();		// piso el primer elemento con un objeto Employee, que al ser heredado de Customer, se puede meter en el array de Customer
		
		for(Customer c : cus){			// iterator
			System.out.println( c );
		}
		
		for(Customer c1 : cus){
			for(Customer c2 : cus){
				if( !c1.equals(c2) && c1.neighbor(c2) )
					System.out.println( c1.getName() + " es vecino de " + c2.getName() );
			}
		}
		
	}
}