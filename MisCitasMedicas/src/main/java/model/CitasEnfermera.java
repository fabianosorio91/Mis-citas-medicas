package model;

import java.util.Date;

public class CitasEnfermera implements ICalendario{

    private int id;
    private Enfermera enfermera;
    private Paciente paciente;
    private Date fecha;
    private String hora;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enfermera getEnfermera() {
        return enfermera;
    }

    public void setEnfermera(Enfermera enfermera) {
        this.enfermera = enfermera;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public void calendario(Date fecha, String hora) {

    }
}
