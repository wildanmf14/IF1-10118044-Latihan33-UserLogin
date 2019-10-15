package latihan.login;
import java.util.Scanner;
public class Latihan33Login {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		User user = new User();
		System.out.print("Masukkan Username : ");
		String usName = reader.next();
		System.out.print("Masukkan Password : ");
		String passWord = reader.next();
		user.pengecekanLogin(usName, passWord);
		
		reader.close();
	}

}
