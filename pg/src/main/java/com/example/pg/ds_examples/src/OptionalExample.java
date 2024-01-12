import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
	
		String[] str= new String[10];
		// getting null pointer exception
		//System.out.println(str[6].toLowerCase());
		
		
		str[6]="abc";
		// use optional so that we dont need to put null checks and we can write clean code
		//ofNullable() returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.
		Optional<String> obj= Optional.ofNullable(str[6]);
		
		//check for value is present or not  
		if(obj.isPresent()) {
			System.out.println(str[6].toLowerCase());
			//If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
			System.out.println(obj.get());
		}
		else {
			
		}
		
	}

}
