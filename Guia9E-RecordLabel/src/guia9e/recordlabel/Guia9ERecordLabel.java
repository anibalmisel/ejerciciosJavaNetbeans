/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9e.recordlabel;

import guia9e.recordlabel.servicio.SingerService;
import java.util.ArrayList;

/**
 *
 * @author aniba
 */
public class Guia9ERecordLabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingerService ss = new SingerService();
        ArrayList al = new ArrayList();
        al = ss.famouSinger();
        ss.menu(al);
    }   
}