package test._utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDelHtml {
    public static void main(String[] args) {
        String str ="fdfdfdfdfdfdfdfdfdfdfdffdfdfdff4343434343vdfsdfsdfdff\n2323";
        System.out.println(str.substring(0, 15));
        System.out.println(str.length());
        System.out.println(subTittle(str)); 
    }
    
    public static String delHTMLTag(String htmlStr){ 
        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //����script��������ʽ 
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //����style��������ʽ 
        String regEx_html="<[^>]+>"; //����HTML��ǩ��������ʽ 
         
        Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE); 
        Matcher m_script=p_script.matcher(htmlStr); 
        htmlStr=m_script.replaceAll(""); //����script��ǩ 
         
        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE); 
        Matcher m_style=p_style.matcher(htmlStr); 
        htmlStr=m_style.replaceAll(""); //����style��ǩ 
         
        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE); 
        Matcher m_html=p_html.matcher(htmlStr); 
        htmlStr=m_html.replaceAll(""); //����html��ǩ 

        return htmlStr.trim(); //�����ı��ַ��� 
    } 
    
    public static String subTittle(String str) {
        String dest = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\w+\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            if(m.find()) {
                dest = m.group();
                if(dest.length()<15) {
                    return dest;
                }
                return dest.substring(0, 15);
            }
            
        }
        return "";
       
    }
    
    
}
