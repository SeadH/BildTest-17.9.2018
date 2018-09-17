package Prvi;

public class Test {

	public static void main(String[] args) {
		
		Author autor = new Author("Mesa Selimovic", "Mesa123@hotmail.com", 'M');
		Book knjiga = new Book("Dervis i smrt", autor, 10.5, 2);
		System.out.println(autor.toString());
		System.out.println();
		System.out.println(knjiga.toString());
	}

}
