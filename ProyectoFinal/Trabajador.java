public class Trabajador extends Persona{
    
    private String _email;
    private String _empresa;
    private int _numTelefono;

    public Trabajador() {
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public String getEmpresa() {
        return _empresa;
    }

    public void setEmpresa(String _empresa) {
        this._empresa = _empresa;
    }

    public int getNumTelefono() {
        return _numTelefono;
    }

    public void setNumTelefono(int _numTelefono) {
        this._numTelefono = _numTelefono;
    }
    
    
}
