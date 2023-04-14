package lavori_;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class areaRettangolo extends JFrame implements ActionListener{
	JLabel base = new JLabel("Base: ");
	JTextArea a = new JTextArea(1,1);
	JLabel altezza = new JLabel("Altezza: ");
	JTextArea b = new JTextArea(1,1);
	JLabel risultato = new JLabel ("Area: ");
	JTextArea r = new JTextArea (1,1);
	JButton inserisci = new JButton ("Calcola");
	JButton cancella = new JButton ("Cancella");
	public areaRettangolo() {
	super ("Area");	
	Container c = this.getContentPane();
	c.setLayout(new FlowLayout());

	c.add(base);
	c.add(a);
	c.add(altezza);
	c.add(b);
	c.add(risultato);
	c.add(r);
	c.add(inserisci);
	inserisci.addActionListener(this);
	c.add(cancella);
	cancella.addActionListener(this);
	setTitle("Calcola l'area del Rettangolo");
	setSize(400,400);
	setVisible(true);
	

}
	public void calcola() {
		double base = Double.parseDouble(a.getText());
		double altezza = Double.parseDouble(b.getText());
		double Area = base*altezza;
		r.setText(Double.toString(Area));
	}
	public void cancella() {
		b.setText("");
		a.setText("");
		r.setText("");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==inserisci) {
			calcola();
		}
		if (e.getSource()==cancella) {
			cancella();
		}
	}
}
