package latihan.login;
import java.util.Scanner;
public class Latihan33Login {
	private static String usName;
	private static String passWord;
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		User user = new User();
		System.out.print("Masukkan Username : ");
		usName = reader.next();
		System.out.print("Masukkan Password : ");
		passWord = reader.next();
		user.pengecekanLogin(usName, passWord);
		
		reader.close();
	}

}
