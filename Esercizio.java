//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Lista<String> rubrica = new Lista<>();
        
        System.out.println("=== RUBRICA CONTATTI ===\n");
        
        rubrica.aggiungiInTesta("Alice");
        rubrica.aggiungiInCoda("Bob");
        rubrica.aggiungiInCoda("Charlie");
        rubrica.aggiungiInTesta("Zoe");
        rubrica.aggiungiInPosizione("Marco", 2);
        
        System.out.println("Lista iniziale:");
        System.out.println(rubrica);
        System.out.println("Dimensione: " + rubrica.size());
        
        String cercato = "Marco";
        int posizione = rubrica.indiceDi(cercato);
        System.out.println("\nPosizione di " + cercato + ": " + posizione);
        
        System.out.println("Primo contatto: " + rubrica.leggiTesta());
        System.out.println("Ultimo contatto: " + rubrica.leggiCoda());
        System.out.println("Contatto in posizione 2: " + rubrica.leggiInPosizione(2));
        
        System.out.println("\nRimuovo 'Bob'...");
        rubrica.cancella("Bob");
        System.out.println(rubrica);
        
        System.out.println("\nRimuovo posizione 1...");
        String rimosso = rubrica.cancellaInPosizione(1);
        System.out.println("Rimosso: " + rimosso);
        System.out.println(rubrica);

        System.out.println("\nContiene 'Alice'? " + rubrica.contiene("Alice"));
        System.out.println("Contiene 'Bob'? " + rubrica.contiene("Bob"));
        
        System.out.println("\nDimensione finale: " + rubrica.size());
        System.out.println("Lista vuota? " + rubrica.isEmpty());
        
        Lista<String> altriContatti = new Lista<>();
        altriContatti.aggiungiInCoda("Diana");
        altriContatti.aggiungiInCoda("Eva");
        
        System.out.println("\nConcateno altri contatti...");
        rubrica.concatena(altriContatti);
        System.out.println(rubrica);
        System.out.println("Dimensione finale: " + rubrica.size());
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md