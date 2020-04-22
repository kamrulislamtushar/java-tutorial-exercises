import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//External iterations start
		for(int i = 0; i < 6; i++) {
			System.out.println(values.get(i));
		}
		
		Iterator<Integer> i = values.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		
		for(int value : values) {
			System.out.println(value);
		}
		
		//Internal Iterations
		
		values.forEach(val -> 
		{
			if(val % 2 == 0 ) {
				System.out.print(val);
			}
		}
		);
	}
}
