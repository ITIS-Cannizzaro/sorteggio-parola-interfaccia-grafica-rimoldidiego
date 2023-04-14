import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameV1 extends JFrame implements ActionListener {
    JButton sorteggia=new JButton("SORTEGGIA");
    JLabel stringa=new JLabel("Stringa sorteggiata: ");
    JTextArea risultato=new JTextArea();

    public MyFrameV1() {
        super("Sorteggio Stringhe V1");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        c.add(stringa);
        c.add(risultato);

        risultato.setPreferredSize(new Dimension(235, 18));

        c.add(sorteggia);
        sorteggia.addActionListener(e -> random());

        setSize(350,200);
        setVisible(true);
        setResizable(false);
    }

    public void random(){
        String array[]={"ManchesterCity", "BayernMonaco", "Benfica", "Inter", "RealMadrid", "Chelsea", "Milan", "Napoli"};
        int lunghezza=array.length;
        int numRandom=(int)(Math.random()*lunghezza);
        String stringaRandom=array[numRandom];
        risultato.setText(stringaRandom);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sorteggia){
            random();
        }
    }
}

