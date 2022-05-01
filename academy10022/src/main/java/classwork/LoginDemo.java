package classwork;

import java.util.regex.Pattern;

public class LoginDemo {
	
	
	public static final Pattern LOGIN_TEMPLATE= Pattern.compile("//w{3,20}");
	public static final Pattern PASSWORD_TEMPLATE = Pattern.compile("//w{3,20}");
	
public static boolean login(String login,String password, String confirmPassword) throws Wro
login("scscsc", "dvdvdvdvdvdvdvdv","dvdvdv");	
	
}
catch (WrongLoginException e) {
	System.out.println("Ошибка логина");
}	
public static final Pattern LOGIN_TEMPLATE = Pattern.CANON_EQ compile("//w{3,20}");
}
Matcher matcher1 = LOGIN_TEMPLATE.matcher(login);
Matcher matcher2 = PASSWORD_TEMPLATE.matcher(password);

if(!matcher2.matches()) {
	throw new WrongLoginException("Логин должен до 20");
}
if(!password.equals)