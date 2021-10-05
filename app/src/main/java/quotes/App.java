/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Random;

public class App {


    public static void main(String[] args) throws IOException {

        Gson gson=new Gson();
        Reader reader =new FileReader("app/src/main/resources/recentquotes.json");

        Type collectionsType=new TypeToken<List<Quote>>(){}.getType();
        List<Quote> booksList= new Gson().fromJson(reader,collectionsType);
        System.out.println(collectionsType);

        
        Random random=new Random();
        int faker=random.nextInt((booksList.size()-1)+1);

        System.out.println(faker);
        System.out.println(booksList.get(faker).toString());

        System.out.println(booksList.get(faker).toString());
        System.out.println(booksList.get(faker).toString());
        System.out.println(collectionsType);

    }
}


