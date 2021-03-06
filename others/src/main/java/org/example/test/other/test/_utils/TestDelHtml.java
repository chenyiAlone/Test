package org.example.test.other.test._utils;

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
        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式 
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式 
        String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式 
         
        Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE); 
        Matcher m_script=p_script.matcher(htmlStr); 
        htmlStr=m_script.replaceAll(""); //过滤script标签 
         
        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE); 
        Matcher m_style=p_style.matcher(htmlStr); 
        htmlStr=m_style.replaceAll(""); //过滤style标签 
         
        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE); 
        Matcher m_html=p_html.matcher(htmlStr); 
        htmlStr=m_html.replaceAll(""); //过滤html标签 

        return htmlStr.trim(); //返回文本字符串 
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
