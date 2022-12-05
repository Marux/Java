package Entidades;
// Generated 02-dic-2022 15:08:20 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Asistencia generated by hbm2java
 */
public class Asistencia  implements java.io.Serializable {


     private int idRegistro;
     private int idEmpleado;
     private Date fecha;
     private Date horaEntrada;
     private Date horaSalida;

    public Asistencia() {
    }

	
    public Asistencia(int idRegistro, int idEmpleado, Date fecha, Date horaEntrada) {
        this.idRegistro = idRegistro;
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
    }
    public Asistencia(int idRegistro, int idEmpleado, Date fecha, Date horaEntrada, Date horaSalida) {
       this.idRegistro = idRegistro;
       this.idEmpleado = idEmpleado;
       this.fecha = fecha;
       this.horaEntrada = horaEntrada;
       this.horaSalida = horaSalida;
    }
   
    public int getIdRegistro() {
        return this.idRegistro;
    }
    
    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getHoraEntrada() {
        return this.horaEntrada;
    }
    
    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public Date getHoraSalida() {
        return this.horaSalida;
    }
    
    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }




}

