import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("cod1", "parafusos", 3d);
        guardarDatos(p1);

        Product p2 = new Product("cod2", "cravos", 4d);
        guardarDatos(p2);

        Product p3 = new Product("cod3", "tachas", 6d);
        guardarDatos(p3);

        Product p4 = new Product("cod4", "grapas", 2d);
        guardarDatos(p4);

        Product po3 = new Product();
        leerDatos(po3);
    }

    static void guardarDatos(Product product){
        try(
                FileOutputStream fos = new FileOutputStream("produtos.txt", true);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos);
        ){
            dos.writeUTF(product.getCodigo());
            dos.writeUTF(product.getDescricion());
            dos.writeDouble(product.getPrezo());
        } catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    static void leerDatos(Product product){
        try(
                FileInputStream fis = new FileInputStream("produtos.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                DataInputStream dis = new DataInputStream(bis);
        ){
            System.out.println("Lista de produtos guardados no ficheiro produtos.txt");
            while (dis.available() != 0){
                product.setCodigo(dis.readUTF());
                product.setDescricion(dis.readUTF());
                product.setPrezo(dis.readDouble());
                System.out.println(product.getCodigo()+", "+product.getDescricion()+", "+product.getPrezo());

            }
        } catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
