/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcolatricev1santuccimaicol;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe che rappresenta la risposta dell'operazione matematica.
 */
public class OperazioneResponseV1 {

    private double operando1;
    private double operando2;
    private String operatore;
    private double risultato;
    private String operazione;
    private String timestamp; // Data e ora di esecuzione dell'operazione

    /**
     * Costruttore vuoto necessario per la deserializzazione GSON.
     */
    public OperazioneResponseV1() {
    }

    /**
     * Costruttore completo.
     *
     * @param operando1 primo operando
     * @param operando2 secondo operando
     * @param operatore operatore matematico
     * @param risultato risultato del calcolo
     */
    public OperazioneResponseV1(double operando1, double operando2,
                              String operatore, double risultato) {

        this.operando1 = operando1;
        this.operando2 = operando2;
        this.operatore = operatore;
        this.risultato = risultato;

        this.operazione = String.format("%.2f %s %.2f = %.2f",
                operando1, operatore, operando2, risultato);
        this.timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public double getOperando1() {
        return operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public String getOperatore() {
        return operatore;
    }

    public double getRisultato() {
        return risultato;
    }

    public String getOperazione() {
        return operazione;
    }

    public String getTimestamp() {
        return timestamp;
    }

    

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public void setOperatore(String operatore) {
        this.operatore = operatore;
    }

    public void setRisultato(double risultato) {
        this.risultato = risultato;
    }

    public void setOperazione(String operazione) {
        this.operazione = operazione;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}


