package com.dco.secpro.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime=System.currentTimeMillis();
		FileInputStream rd = null;
		FileOutputStream wt=null;
		BufferedOutputStream bw=null;
		 BufferedInputStream br=null;
		try {
			rd = new FileInputStream("C:\\matest\\ag.7z");
			
		//	br=new BufferedInputStream(rd);
			
			
	        wt=new FileOutputStream("c:\\matest\\ag-copy.7z");
	        
	        
	       //  bw=new BufferedOutputStream(wt);
	        
	        
	        byte[] ch=new byte[1024];
			
	        int len=0;
	        while((len=rd.read(ch, 0, 1024))!=-1) {
	        	
	        	wt.write(ch, 0, 1024);
	        }
			
			
	        
	        long endTime=System.currentTimeMillis();
	        
	        System.out.println("the total time is:"+(endTime-startTime) +" ms");

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

