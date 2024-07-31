package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controlador que nos permite trabajar con JSON
public class HelloController {

    @Value("${app.message}")
    String message;

    @GetMapping("/hola") //Esto es a la URL a la que iria
    public String holaMundo(){
    return "Hola Mundo que tal";
    }

    @GetMapping("/bootstrap")
    public String bootstrap(){
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                  </head>
                  <body>
                    <h1>Hello, world!</h1>
                    <a class="btn btn-primary" href="https://www.google.com" target="_blank">Bootstrap</a>
                  </body>
                </html>
                """;
    }

}
