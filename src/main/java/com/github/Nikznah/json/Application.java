package com.github.Nikznah.json;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        SuperHero superHero1 = new SuperHero("Никита", 24, "Marvel", "Белый");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(superHero1);
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(new File(
                "C:\\Users\\Admin\\IdeaProjects\\json\\src\\main\\resources\\superhero.json"), json);
        System.out.println("Записал в файл");

        SuperHero superHero2 = mapper.readValue
                (new FileReader("C:\\Users\\Admin\\IdeaProjects" +
                        "\\json\\src\\main\\resources\\superheroread.json"), SuperHero.class);
        System.out.println(superHero2);

    }

}

