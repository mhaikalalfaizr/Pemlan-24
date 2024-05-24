package GUITest;

import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame {

    JLabel nama = new JLabel("Nama Lengkapmu Siapa?");
    JTextField fieldNama = new JTextField(30);
    JLabel tglLahir = new JLabel("Tanggal Lahirmu Kapan?");
    JTextField fieldTglLahir = new JTextField(30);
    JLabel noReg = new JLabel("Nomor Pendaftaranmu Berapa?");
    JTextField fieldNoReg = new JTextField(30);
    JLabel noTelp = new JLabel("Nomor Teleponmu Berapa?");
    JTextField fieldNoTelp = new JTextField(30);
    JLabel alamat = new JLabel("Alamatmu Dimana?");
    JTextField fieldAlamat = new JTextField(30);
    JLabel email = new JLabel("Alamat E-mailmu Apa?");
    JTextField fieldEmail = new JTextField(30);
    JButton tombolSubmit = new JButton("Kirim Data");

    public GUI() {
        setTitle("Pendaftaran Ulang Mahasiswa Baru Universitas Ramah");
        setSize(500, 500);
        setBounds(500, 500, 475, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        mainFrame();
        setupActions();
    }

    void mainFrame() {
        setLayout(null);
        setVisible(true);

        add(nama);
        nama.setBounds(10, 10, 250, 20);
        add(fieldNama);
        fieldNama.setBounds(200, 10, 250, 20);

        add(tglLahir);
        tglLahir.setBounds(10, 40, 250, 20);
        add(fieldTglLahir);
        fieldTglLahir.setBounds(200, 40, 250, 20);

        add(noReg);
        noReg.setBounds(10, 70, 250, 20);
        add(fieldNoReg);
        fieldNoReg.setBounds(200, 70, 250, 20);

        add(noTelp);
        noTelp.setBounds(10, 100, 250, 20);
        add(fieldNoTelp);
        fieldNoTelp.setBounds(200, 100, 250, 20);

        add(alamat);
        alamat.setBounds(10, 130, 250, 20);
        add(fieldAlamat);
        fieldAlamat.setBounds(200, 130, 250, 40);

        add(email);
        email.setBounds(10, 180, 250, 20);
        add(fieldEmail);
        fieldEmail.setBounds(200, 180, 250, 20);

        add(tombolSubmit);
        tombolSubmit.setBounds(350, 220, 100, 20);
    }

    void setupActions() {
        this.tombolSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                    
                        if (fieldNama.getText().isEmpty() || fieldTglLahir.getText().isEmpty() ||
                        fieldNoReg.getText().isEmpty() || fieldNoTelp.getText().isEmpty() ||
                        fieldAlamat.getText().isEmpty() || fieldEmail.getText().isEmpty()) {

                        JOptionPane.showMessageDialog(GUI.this, "Semua kolom harus diisi yaa, jangan ada yang kosong..", "Perhatian!", JOptionPane.WARNING_MESSAGE);
                        
                        } else { 
                            int konfirmasi = JOptionPane.showConfirmDialog(GUI.this,
                            "Apakah kamu yakin data yang kamu isi udah bener?",
                            "Konfirmasi",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE);
                        
                        if (konfirmasi == JOptionPane.YES_OPTION) {

                        JTextArea textAreaOutput = new JTextArea();
                        textAreaOutput.append("Ini Namamu: " + fieldNama.getText() + "\n" +
                        "Ini Tanggal Lahirmu: " + fieldTglLahir.getText() + "\n" +
                        "Ini Nomor Pendaftaranmu: " + fieldNoReg.getText() + "\n" +
                        "Ini Alamatmu: " + fieldAlamat.getText() + "\n" +
                        "Ini E-mailmu: " + fieldEmail.getText() + "\n");

                        JOptionPane.showMessageDialog(null, textAreaOutput.getText(), "Data Kamu Udah Dimasukin Ke Sistem!", JOptionPane.INFORMATION_MESSAGE);
                    
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

}
