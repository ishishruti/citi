import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class DemoChecked {

	public static void main(String[] args) {
		try (FileWriter fileWriter = new FileWriter("a");){
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("You got exception");
		} finally {
			System.out.println("from final");
		}
		
		
	}

}
