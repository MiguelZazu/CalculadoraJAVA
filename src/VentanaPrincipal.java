import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {

    Container container;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bSuma, bResta, bMultiplicar, bDividir, bIgual,bborrar;
    JTextField pantalla;
    JPanel superior, central, derecha, centralCientifica;
    boolean operando = false;
    int op1, op2;
    int tipoOperacion;

    public void initGUI() {


        instancias();
        configurarContainer();
        setSize(new Dimension(300, 300));
        setLocationRelativeTo(null);
        acciones();
        setVisible(true);

    }

    private void configurarContainer() {
        container.add(configurarSuperior(), BorderLayout.NORTH);
        container.add(configurarCentro(), BorderLayout.CENTER);
        container.add(configurarDerecha(), BorderLayout.EAST);
    }

    private JPanel configurarCentro() {
        central.setLayout(new GridLayout(4, 3, 10, 10));
        central.add(b1);
        central.add(b2);
        central.add(b3);
        central.add(b4);
        central.add(b5);
        central.add(b6);
        central.add(b7);
        central.add(b8);
        central.add(b9);
        central.add(b0);
        central.add(bIgual);
        central.add(bborrar);
        return central;
    }

    private JPanel configurarSuperior() {
        superior.setLayout(new BorderLayout());
        superior.add(pantalla, BorderLayout.CENTER);
        return superior;
    }

    private JPanel configurarDerecha() {
        derecha.setLayout(new GridLayout(4,1,10,10));
        derecha.add(bSuma);
        derecha.add(bResta);
        derecha.add(bMultiplicar);
        derecha.add(bDividir);
        return derecha;
    }

    private void acciones() {
        Component[] componentes = central.getComponents();
        for (Component item : componentes) {

            ((JButton) item).addActionListener(this);
        }
    }

    private void instancias() {
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bSuma = new JButton("+");
        bResta = new JButton("-");
        bMultiplicar = new JButton("*");
        bDividir = new JButton("/");
        bIgual = new JButton("=");
        bborrar = new JButton("DEL");
        pantalla = new JTextField();
        container = this.getContentPane();
        central = new JPanel();
        superior = new JPanel();
        derecha = new JPanel();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "1");
            }
            else
                pantalla.setText("1");
                operando=false;

        } else if (e.getSource() == b2) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "2");
            }
            else
                pantalla.setText("2");
                operando=false;
        } else if (e.getSource() == b3) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "3");
            }
            else
                pantalla.setText("3");
                operando=false;
        } else if (e.getSource() == b4) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "4");
            }
            else{
                pantalla.setText("4");
                operando=false;
            }
        } else if (e.getSource() == b5) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "5");
            }
            else{
                pantalla.setText("5");
                operando=false;
            }
        } else if (e.getSource() == b6) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "6");
            }
            else{
                pantalla.setText("6");
                operando=false;
            }
        } else if (e.getSource() == b7) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "7");
            }
            else{
                pantalla.setText("7");
                operando=false;
            }
        } else if (e.getSource() == b8) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "8");
            }
            else{
                pantalla.setText("8");
                operando=false;
            }
        } else if (e.getSource() == b9) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "9");
            }
            else{
                pantalla.setText("9");
                operando=false;
            }
        } else if (e.getSource() == b0) {
            if (!operando) {
                pantalla.setText(pantalla.getText() + "0");
            }
            else{
                pantalla.setText("0");
                operando=false;
            }
        }else if (e.getSource() == bborrar) {
            pantalla.setText("");
        }
        else if (e.getSource() == bSuma) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            pantalla.setText("");
            tipoOperacion = 1;
        } else if (e.getSource() == bResta) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 2;

        }else if (e.getSource() == bMultiplicar) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 2;

        }else if (e.getSource() == bDividir) {
            operando = true;
            op1 = Integer.valueOf(pantalla.getText());
            tipoOperacion = 2;

        } else if (e.getSource() == bIgual) {
            op2 = Integer.valueOf(pantalla.getText());
            int resultado=0;
            switch (tipoOperacion){
                case 1:
                    resultado = op1+op2;
                    pantalla.setText(String.valueOf(resultado));
                    break;
                case 2:
                    resultado = op1-op2;
                    break;

            }

            pantalla.setText(Integer.toString(resultado));
        }
    }
}