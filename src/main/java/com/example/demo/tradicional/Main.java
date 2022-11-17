package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentaCoche venderC= new VentaCoche();
		venderC.vender("Anddy Quisilema", "17214838", LocalDateTime.of(2022, 10, 2, 9, 40), "Don Lucho", "00147855", "MAZDA", "CARRITOS FAST");
	}

}
