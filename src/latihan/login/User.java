package latihan.login;

public class User {
	private final String username = "RizkiAdam";
	private final String password = "terbaikselalu";
	private boolean statusAkun;
	
	private boolean cekAkun(String parUserName, String parPassword) {
		if(parUserName.equals(username) && parPassword.equals(password))
			return true;
		return false;			
		
	}
	private void hasilLogin(boolean status, String parUserName) {
		if (status)
			System.out.println("********Hallo " + parUserName + "********\n Selamat Datang di Aplikasi ini"); 
		else
			System.out.println("Oooops, Username atau Password anda salah ");
	}
	public void pengecekanLogin(String parUserName, String parPassword) {
		statusAkun = cekAkun(parUserName,parPassword);
		hasilLogin(statusAkun, parUserName);
	}
}
