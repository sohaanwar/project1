/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
 
 import java.util.Arrays;
public class vowels {
    public String s;
   
   char[]item=new char[10];
    
    
    int find(String s)
    {for(int i=0;i<s.length();i++)
    {if(s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='a'||s.charAt(i)=='u'||s.charAt(i)=='i')
        item[i]=s.charAt(i);
    System.out.print(item[i]);
        }
    return 0;
        }}
    

