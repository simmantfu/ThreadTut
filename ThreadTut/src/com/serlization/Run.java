package com.serlization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Run {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Path path = Paths.get("f.txt");
		byte[] data = Files.readAllBytes(path);
		String syst = "simmant";
		SerTest serTest = new SerTest();
		serTest.setName(data);
		FileOutputStream fout = new FileOutputStream("f2.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(syst.getBytes());
		out.flush();
		System.out.println("success");
	}

}
