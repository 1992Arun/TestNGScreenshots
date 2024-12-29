package org.Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.test.BaseClas;

public class Utility extends BaseClas {

	public static String email(){


		String format = new SimpleDateFormat("hhmmss").format(new Date());

		String email= format+"@gmail.com";


		return email;


	}


	public static String password(){


		String format = new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date());

		return format;


	}

	public static File file(String filename){

		
		return  new File(filename);

    

	}



}
