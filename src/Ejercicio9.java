public class Ejercicio9 {
	
	public static void main(String[] args){
		int i = 10;
		Customer[] cs = new Customer[i];
		
		for(int j = 0; j<i; j++){
			cs[j] = new Customer();
		}
		
		for(Customer c : cs){
			System.out.println(c);
		}
	}
}