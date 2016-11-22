/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Sorteo {
    private String nombre;
    //aqui se guardan todos los participantes para este torneo
    private ArrayList<Cliente> participantes;
    //aqui se guardan todos los ganadores para este torneo
    private ArrayList<Cliente> ganadores;
    private boolean realizado;
    private int cantidadGanadores;
    private String descripcionPremio;
    private Date fechaInicio;
    private Date fechaFin;
    

    //Constructor
    public Sorteo(String nombre, int cantidadGanadores, String descripcionPremio, Date inicio, Date fin) {
        this.nombre = nombre;
        this.cantidadGanadores = cantidadGanadores;
        this.descripcionPremio = descripcionPremio;
        this.participantes = new ArrayList();
        this.ganadores = new ArrayList();
        this.realizado = false;
        this.fechaInicio = inicio;
        this.fechaFin = fin;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Cliente> participantes) {
        this.participantes = participantes;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public int getCantidadGanadores() {
        return cantidadGanadores;
    }

    public void setCantidadGanadores(int cantidadGanadores) {
        this.cantidadGanadores = cantidadGanadores;
    }

    public String getDescripcionPremio() {
        return descripcionPremio;
    }

    public void setDescripcionPremio(String descripcionPremio) {
        this.descripcionPremio = descripcionPremio;
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    public ArrayList<Cliente> realizarSorteo() {
        //realiza el sorteo con los clientes que hayan realizado evaluaciones validas hasta la fecha de realizacion del sorteo,
        //segun los parametros definidos. Si no se definio un sorteo no se hace nada y se avisa al usuario.
        ArrayList<Cliente> retorno = new ArrayList();
        if (!realizado) {
            if (participantes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay clientes participantes del sorteo");
            } else {
                //me defino los numeros de los participantes ganadores
                Random rand = new Random();
                int cantParticipantes = participantes.size();
                int cantGanadores = Math.min(cantidadGanadores, cantParticipantes);
                ArrayList<Integer> numerosGanadores = new ArrayList(cantGanadores);
                if (cantParticipantes <= cantGanadores) {
                    //ganan todos
                    for (int i = 0; i < cantGanadores; i++) {
                        numerosGanadores.add(i);
                    }
                } else {
                    //ganan algunos al azar
                    for (int i = 0; i < cantGanadores; i++) {
                        int numeroAzar = rand.nextInt(cantParticipantes);
                        while (numerosGanadores.contains(numeroAzar)) {
                            numeroAzar = rand.nextInt(cantParticipantes);
                        }
                        numerosGanadores.add(numeroAzar);
                    }
                }
                //aviso a ganadores y guardo para el retorno
                Mail mail = new Mail();
                for (int i = 0; i < cantGanadores; i++) {
                    int numero = numerosGanadores.get(i);
                    Cliente ganador = participantes.get(numero);
                    //lo agrego a la lista de retorno
                    retorno.add(ganador);
                    this.ganadores.add(ganador);
                    //mandar mail a ganador
                    if(mail.SendMail(ganador.getNombre(),nombre, ganador.getEmail(), descripcionPremio)){
                        this.realizado = true;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Hubo un error en el envio del correo, verifique su conexión");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este restaurante no tiene definido ningun sorteo");
        }
        return retorno;
    }
}
