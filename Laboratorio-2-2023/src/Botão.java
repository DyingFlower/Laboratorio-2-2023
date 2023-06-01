import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botão extends JButton{
	public String cor; 
	public String texto;
	public Painel painel;
	public Botão(String texto,Painel painel) {
		this.painel=painel;
		this.texto=texto;
		setBackground(Color.white);
		setSize(200,300);
		setVisible(true);
		setText(texto);
		
	}
	public class Cadastro implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
		//painel.setVisible(true);
		//Jtextfield escrever= 
		//painel.add();
	}
}
