package book.util;
import javax.servlet.http.*;
public class CookieUtil {
    
    public static String getCookieValue(Cookie[] cookies, String cookieName)
    {
        String cookieValue = "";
        if(cookies != null)
        {
            for(int idx = 0; idx < cookies.length; idx++)
            {
                if(cookieName.equals(cookies[idx].getName()))
                {
                    cookieValue = cookies[idx].getName();
                }
            }
        }
        return cookieValue;
    }
}
