import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Client extends JPanel implements ActionListener {
    JButton connectButton = new JButton("Connect");
    JLabel connectionStatus = new JLabel("Connection Status: Not Connected");

    Client() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.WHITE);
        add(connectButton);
        add(connectionStatus);
        connectButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == connectButton) {
            // Perform network operations in a separate thread
            new Thread(() -> {
                try {
                    Socket socket = new Socket("localhost", 1024);
                    SwingUtilities.invokeLater(() -> {
                        connectionStatus.setText("Connection Status: Connected");
                    });
                } catch (IOException ex) {
                    ex.printStackTrace();
                    SwingUtilities.invokeLater(() -> {
                        connectionStatus.setText("Connection Status: Connection Failed");
                    });
                }
            }).start();
        }
    }
}