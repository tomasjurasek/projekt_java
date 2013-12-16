/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author silent
 */
public class PDF {
    
    public void tisk(String id,String jmeno,String adresa, String mesto,String psc, String datum_vystaveni,String datum_splatnosti) {
      try{
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream("faktura_"+id+".pdf"));
      document.open();
      document.add(new Paragraph("                                         FAKTURA", FontFactory.getFont(FontFactory.TIMES_BOLD,20)));
      document.add(new Paragraph("Cislo Faktury: " + id, FontFactory.getFont(FontFactory.TIMES_BOLD,20)));
      document.add(new Paragraph("Jmeno: " + jmeno));
      document.add(new Paragraph("Adresa: " + adresa));
      document.add(new Paragraph("Mesto: " + mesto));
      document.add(new Paragraph("PSC: " + psc));
      document.add(new Paragraph("Datum Vystaveni: " + datum_vystaveni));
      document.add(new Paragraph("Datum Splatnosti: " + datum_splatnosti));
      
      document.close();
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex);
      }
      
    }
}
