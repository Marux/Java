public class Sueldo {

    private int Sueldo_base;
    private int Bono_asistencia;
    private int Porciento_afp;
    private int Porciento_med;

    public int getSueldo_base() {
        return Sueldo_base;
    }

    public void setSueldo_base(int Sueldo_base) {
        this.Sueldo_base = Sueldo_base;
    }

    public int getBono_asistencia() {
        return Bono_asistencia;
    }

    public void setBono_asistencia(int Bono_asistencia) {
        this.Bono_asistencia = Bono_asistencia;
    }

    public int getPorciento_afp() {
        return Porciento_afp;
    }

    public void setPorciento_afp(int Porciento_afp) {
        this.Porciento_afp = Porciento_afp;
    }

    public int getPorciento_med() {
        return Porciento_med;
    }

    public void setPorciento_med(int Porciento_med) {
        this.Porciento_med = Porciento_med;
    }

    public int Calcular_bono(int Sueldo_base, int _Asistencia) {
        int sueldo = Sueldo_base;
        if (_Asistencia == 100) {
            sueldo = (int) (Sueldo_base + (Sueldo_base * 0.04));
        }
        return sueldo;
    }

    public int Calculo_afp(int sueldo) {
        int afp = (int) (0.10 * sueldo);
        return afp;
    }

    public int Calculo_med(int sueldo) {
        int med = (int) (0.07 * sueldo);
        return med;
    }

}
