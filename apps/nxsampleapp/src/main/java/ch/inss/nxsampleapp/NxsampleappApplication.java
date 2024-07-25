package ch.inss.nxsampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ch.inss")
public class NxsampleappApplication {

  public static void main(String[] args) {
    SpringApplication.run(NxsampleappApplication.class, args);
  }

}
