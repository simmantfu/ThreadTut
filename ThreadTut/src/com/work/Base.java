package com.work;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Base {

	private String url=Comman.url;
	private int port=Comman.port;
// 1000024
	public void sendPackate() {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			DatagramSocket datagramSocket = new DatagramSocket();
			InetAddress IPAddress = InetAddress.getByName(url);
			byte[] sendData = new byte[1024];
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
			datagramSocket.send(sendPacket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
