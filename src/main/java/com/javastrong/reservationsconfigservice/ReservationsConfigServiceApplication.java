package com.javastrong.reservationsconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ReservationsConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationsConfigServiceApplication.class, args);
    }

}
