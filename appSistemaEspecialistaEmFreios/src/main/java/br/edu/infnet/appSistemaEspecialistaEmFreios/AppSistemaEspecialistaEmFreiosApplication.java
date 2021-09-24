package br.edu.infnet.appSistemaEspecialistaEmFreios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppSistemaEspecialistaEmFreiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSistemaEspecialistaEmFreiosApplication.class, args);
	}

}
