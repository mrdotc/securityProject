package com.dco.secpro.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader rd = null;
		Writer wt=null;
		 BufferedWriter bw=null;
		 BufferedReader br=null;
		try {
			rd = new FileReader("C:\\matest\\JEE7.pdf");
			
			br=new BufferedReader(rd);
			
			
	        wt=new FileWriter("c:\\matest\\dJEE7.pdf");
	        
	        
	         bw=new BufferedWriter(wt);
	        
	        
	        char[] ch=new char[1024];
			
	        int len=0;
	        while((len=br.read(ch, 0, 1024))!=-1) {
	        	
	        	bw.write(ch, 0, 1024);
	        }
			
			

			/*
			 * int len = 0; while ((len = rd.read()) != -1) { System.out.print((char)len); }
			 */

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {

			ioe.printStackTrace();
		} finally {
			try {
			if(rd !=null) {
				
					rd.close();
					
			}
			bw.close();
		    br.close();
		    wt.close();
			
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

