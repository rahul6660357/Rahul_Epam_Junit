package RahulEpam_junit;

public class StringQues {
    String res;
    public String removeA(String s)
    {
        int l = s.length();
        if(l>2) {
            if (s.charAt(0) == 'A' && s.charAt(1) == 'A') {
                res = s.substring(2);
            } else if (s.charAt(0) == 'A' && s.charAt(1) != 'A') {
                res = s.substring(1);
            } else if (s.charAt(0) != 'A' && s.charAt(1) == 'A') {
                res = s.charAt(0) + s.substring(2);
            }
            else if(s.charAt(0)!='A' && s.charAt(1)!='A')
            {
                res = s;
            }
        }
        else
        {
            if(s.charAt(0)=='A' && s.charAt(1)=='A')
            {
                res="";
            }
            else if(s.charAt(0)!='A' && s.charAt(1)=='A')
            {
                res=""+s.charAt(0);
            }
            else if(s.charAt(0)=='A' && s.charAt(1)!='A')
            {
                res=""+s.charAt(1);
            }
            else
            {
                res=s;
            }
        }
        return res;
    }
}
