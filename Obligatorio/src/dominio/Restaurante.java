package dominio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Guillermo
 */
public class Restaurante {

    private String nombre;
    private String direccion;
    private String horarioAbrir;
    private String horarioCerrar;
    private String tipoComida;
    //Aqui se guardan todas las evaluaciones del restaurante
    private ArrayList<Evaluacion> evaluaciones;
    //Aqui se guardan todos los sorteos que pertenecen al restaurante
    private ArrayList<Sorteo> sorteos;

    //Constructor para nuevo restaurante;
    public Restaurante(String nombre, String direccion, String horarioAbrir, String horarioCerrar, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioAbrir = horarioAbrir;
        this.horarioCerrar = horarioCerrar;
        this.tipoComida = tipoComida;
        this.evaluaciones = new ArrayList();
        this.sorteos = new ArrayList();
    }

    //Metodos Getters y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorarioAbrir() {
        return horarioAbrir;
    }

    public void setHorarioAbrir(String horarioAbrir) {
        this.horarioAbrir = horarioAbrir;
    }

    public String getHorarioCerrar() {
        return horarioCerrar;
    }

    public void setHorarioCerrar(String horarioCerrar) {
        this.horarioCerrar = horarioCerrar;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public ArrayList getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public ArrayList getSorteos() {
        return sorteos;
    }

    public void setSorteos(ArrayList<Sorteo> sorteos) {
        this.sorteos = sorteos;
    }

    //Override de metodo Eguals, define que dos Restaurantes son iguales con igual nombre y direccion
    @Override
    public boolean equals(Object obj) {
        boolean retorno = false;
        if (this.getNombre().equals(((Restaurante) obj).getNombre()) && this.getDireccion().equals(((Restaurante) obj).getDireccion())) {
            retorno = true;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return nombre + ", " + direccion;
    }

    public void agregarEvaluacion(String nombre, String mail, int puntuacion, String resena) {
        //crea el cliente y si eligio no ser anonimo se guarda en la lista de clientes para participar en la rifa
        //crea la evaluacion y la guarda en la lista
        Date date = new Date();
        Cliente cliente = new Cliente(nombre, mail);
        Evaluacion evaluacion = new Evaluacion(cliente, puntuacion, resena);
        evaluaciones.add(evaluacion);
        //se fija por cada sorteo de este restaurante si el cliente esta en condiciones de participar
        for (int i = 0; i < sorteos.size(); i++) {
            if (!date.before(sorteos.get(i).getFechaInicio()) && !date.after(sorteos.get(i).getFechaFin()) && !sorteos.get(i).isRealizado() && !sorteos.get(i).getParticipantes().contains(cliente) && cliente.noEsAnonimo() && !resena.equals("")) {
                //cliente y resena valido para participar del sorteo, entonces lo agrego a la lista de participantes
                sorteos.get(i).getParticipantes().add(cliente);
            }
        }

    }

    public void definirSorteo(String nombre, int cantidadGanadores, String premio, Date inicio, Date fin) {
        //define los parametros del sorteo y lo agrega a la lista de sorteos del restaurante
        Sorteo sorteo = new Sorteo(nombre, cantidadGanadores, premio, inicio, fin);
        this.sorteos.add(sorteo);
    }

}
