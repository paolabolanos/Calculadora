
package calculadoraa;


public class Calculadoraa {

   
    public static void main(String[] args) {
      ventana inicio = new ventana();
        inicio.setTitle("calculadora basica");
        inicio.setBounds(500, 100, 500, 480);
        inicio.setResizable(false);
        inicio.insertarPanel();
        inicio.insertarEtiquetas();
        inicio.insertarTexto();
        inicio.insertarBotones();
    }
    
}
    
