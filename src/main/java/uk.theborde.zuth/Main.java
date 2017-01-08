package uk.theborde.zuth;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.*;

/**
 * Created by Rhodri Metcalfe-Davies on 08/01/2017.
 * Part of Zuth
 */
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Starting...");
        System.out.println("Initializing AnsiConsole...");
        AnsiConsole.systemInstall();
        System.out.println(ansi().render("@|red AnsiConsole Initialized|@"));
        System.out.println(ansi().render("@|red Starting Zuth Bot|@"));
    }
}
