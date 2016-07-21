import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main {

	private JFrame frame;
	private JTextField txtPhoneOperatingSystem;
	private JTextField txtBatteryLife;
	private JTextField txtCarrier;
	private JTextField txtPersonToCall;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCreatePhone = new JButton("Create Phone");
		btnCreatePhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double battery = Double.parseDouble(txtBatteryLife.getText());
				Phone newPhone = new Phone(battery, txtPhoneOperatingSystem.getText(), txtCarrier.getText(), txtPersonToCall.getText());
				newPhone.draw();
			}
		});
		btnCreatePhone.setBounds(245, 473, 117, 29);
		frame.getContentPane().add(btnCreatePhone);
		
		txtPhoneOperatingSystem = new JTextField();
		txtPhoneOperatingSystem.setText("Phone Operating System");
		txtPhoneOperatingSystem.setBounds(53, 37, 192, 26);
		frame.getContentPane().add(txtPhoneOperatingSystem);
		txtPhoneOperatingSystem.setColumns(10);
		
		txtBatteryLife = new JTextField();
		txtBatteryLife.setText("100");
		txtBatteryLife.setBounds(53, 75, 192, 26);
		frame.getContentPane().add(txtBatteryLife);
		txtBatteryLife.setColumns(10);
		
		txtCarrier = new JTextField();
		txtCarrier.setText("Carrier");
		txtCarrier.setBounds(53, 113, 192, 26);
		frame.getContentPane().add(txtCarrier);
		txtCarrier.setColumns(10);
		
		txtPersonToCall = new JTextField();
		txtPersonToCall.setText("Person to Call");
		txtPersonToCall.setBounds(53, 169, 192, 26);
		frame.getContentPane().add(txtPersonToCall);
		txtPersonToCall.setColumns(10);
	}
}
