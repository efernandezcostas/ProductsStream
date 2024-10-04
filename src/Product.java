public class Product {
    private String codigo;
    private String descricion;
    private double prezo;

    public Product(){
        this.codigo = "";
        this.descricion = "";
        this.prezo = 0d;
    }

    public Product(String codigo, String descricion, double prezo){
        this.codigo = codigo;
        this.descricion = descricion;
        this.prezo = prezo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricion() {
        return descricion;
    }

    public double getPrezo() {
        return prezo;
    }
}
