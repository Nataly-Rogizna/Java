import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class okno extends JFrame {
    private int count = 0;

    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("Ваше имя?");
    private JLabel metkaDva = new JLabel("");

    public okno(String title) {
        super(title);
        SozdatxOkno();
    }

    private void SozdatxOkno() {
        JButton button = new JButton(" Нажми меня! ");
        JButton changeSizeButton = new JButton(" Больше! ");
        JLabel countLabel = new JLabel("Нажато 0 раз");
        changeSizeButton.addActionListener(e -> okno.getFrames()[0].setSize(500, 500));
        changeSizeButton.setBounds(160, 60, 120, 30);
        button.setBounds(5, 60, 120, 30);
        button.addActionListener(e -> {
            count++;
            countLabel.setText("Нажато " + count + " раз");
            metkaDva.setText("Спасибо, " + fio.getText() + "!");
        });
        metka.setBounds(15, 15, 95, 30);
        metkaDva.setBounds(15, 120, 200, 30);
        fio.setBounds(120, 15, 100, 30);
        countLabel.setBounds(15, 95, 200, 30);
        getContentPane().setLayout(null);
        getContentPane().add(button);
        getContentPane().add(changeSizeButton);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(fio);
        getContentPane().add(countLabel);
        setLocationRelativeTo(null);
    }
}