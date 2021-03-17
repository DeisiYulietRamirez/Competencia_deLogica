package matriz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Disenio_Matriz extends JFrame{
    
    public Disenio_Matriz(){ //constructor
        initComponents();
    }
    
    JLabel [][] matriz;
    //int matriz_oculta[][];
    
    public void initComponents() {
        setVisible(true);
        setTitle("Creando Matriz");
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel contenedor = new JPanel();
        GridLayout capa = new GridLayout(10,5);
        contenedor.setLayout(capa);
        
        
        //creando la matriz de etiquetas
        matriz = new JLabel[10][5]; //10 fila, 5 columna
        
        for (int i = 0; i < 10; i++) { //Y
            for (int j = 0; j < 5; j++) { //X
                matriz[i][j] = new JLabel("X", SwingConstants.CENTER);
                contenedor.add(matriz[i][j]);
            }   
        }
        
        //int contador = 1;
        
        //creando eventos de las etiquetas
        for (int i = 0; i < 10; i++) { //Y
            for (int j = 0; j < 5; j++) { //X
                
                final int columna = j;
                final int fila = i;
                
                //final int post_contador = contador;
                
                matriz[i][j].addMouseListener(new MouseListener(){
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("Click en: "+fila+" - "+columna);
                        bloquearFilasColumnas(fila, columna);
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        
                    }
                });
                //contador += 1;
            }
        }
        
        add(contenedor);
        revalidate();
    }
    
    public void bloquearFilasColumnas(int fila, int columna){
        
        System.out.println("Bloqueadndo: "+fila);
        System.out.println("Bloqueando: "+columna);
        
        //bloqueando fila
        for (int i = 0; i < 10; i++) {
            matriz [i][fila].setOpaque(true);
            matriz [i][fila].setBackground(Color.gray);
            matriz[i][fila].setEnabled(false);
        }
        
        //bloqueando columna
        for (int i = 0; i < 5; i++) {
            matriz [columna][i].setOpaque(true);
            matriz [columna][i].setBackground(Color.gray);
            matriz[columna][i].setEnabled(false);
        }
    }
}
