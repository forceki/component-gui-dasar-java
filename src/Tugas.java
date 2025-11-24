
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Tugas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLayout(new BorderLayout());
                //tuils ulang code dari Latihan4 dengan menambahkan fungsionalitas pada tombol
                //north
                JLabel labelNorth = new JLabel("Label ada di Atas (NORTH)");
                frame.add(labelNorth, BorderLayout.NORTH);
                

                //south
                JButton buttonSouth = new JButton("Tombol ada di Bawah (SOUTH)");
                buttonSouth.addActionListener(e -> {
                    labelNorth.setText("Tombol di SOUTH diklik!");
                });
                frame.add(buttonSouth, BorderLayout.SOUTH);

                //west
                JButton buttonWest = new JButton("WEST");
                buttonWest.addActionListener(e -> {
                    labelNorth.setText("Tombol di WEST diklik!");
                });
                frame.add(buttonWest, BorderLayout.WEST);

                //east
                JButton buttonEast = new JButton("EAST");
                buttonEast.addActionListener(e -> {
                    labelNorth.setText("Tombol di EAST diklik!");
                });
                frame.add(buttonEast, BorderLayout.EAST);

                //center
                JButton buttonCenter = new JButton("CENTER");
                buttonCenter.addActionListener(e -> {
                    labelNorth.setText("Tombol di CENTER diklik!");
                });
                frame.add(buttonCenter, BorderLayout.CENTER);

                frame.setVisible(true);
            }
        });
    }
}
