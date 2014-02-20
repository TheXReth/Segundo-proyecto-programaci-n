package version1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz() {
		setTitle("Pedidos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 800, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton botonDiaAnterior = new JButton("<");
		
		JButton botonDia = new JButton("D\u00EDa");
		
		JButton botonDiaSiguiente = new JButton(">");
		
		JButton botonMesAnterior = new JButton("<");
		
		JButton botonMes = new JButton("Mes");
		
		JButton botonMesSiguiente = new JButton(">");
		
		JButton botonAñoAnterior = new JButton("<");
		
		JButton botonAño = new JButton("A\u00F1o");
		
		JButton botonAñoSiguiente = new JButton(">");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton botonAñadir = new JButton("A\u00F1adir");
		
		JButton botonModificar = new JButton("Modificar");
		
		JButton botonEliminar = new JButton("Eliminar");
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aviso aviso = new Aviso();
				aviso.setVisible(true);
			}
		});
		
		JButton botonBuscar = new JButton("Buscar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(botonAñoAnterior, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(botonAño, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(botonAñoSiguiente, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(86)
							.addComponent(botonAñadir)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(botonModificar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(botonEliminar)
							.addPreferredGap(ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
							.addComponent(botonBuscar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botonDiaAnterior)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(botonDia, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botonMesAnterior, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(botonMes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(botonDiaSiguiente, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(botonMesSiguiente, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(botonDiaAnterior)
						.addComponent(botonDia)
						.addComponent(botonDiaSiguiente))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(botonMesAnterior)
						.addComponent(botonMesSiguiente)
						.addComponent(botonMes))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(botonAñoAnterior)
						.addComponent(botonAño)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(botonAñoSiguiente)
							.addComponent(botonBuscar)
							.addComponent(botonEliminar)
							.addComponent(botonModificar)
							.addComponent(botonAñadir)))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
