/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import model.*;
import View.*;

public class controller extends MouseAdapter implements ActionListener{
    private Aplikasi model;
    private View view;
    private Buku buku;
    private Pendaftaran pendaftaran;
    private int i;
    public controller(Aplikasi model) {
        this.model = model;
        HalamanAwal m = new HalamanAwal();
        m.setVisible(true);
        m.addListener((ActionListener) this);
        view = m;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (view instanceof HalamanAwal) {
            HalamanAwal m = (HalamanAwal) view;
            if (source.equals(m.getBtnMasuk())) {
                MainMenu e = new MainMenu();
                e.setVisible(true);
                e.addListener(this);
                m.dispose();
                view = e;
            }
        }
    }
}
