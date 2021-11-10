import javax.swing.*;
import java.util.Date;
public class ContohOptionPane {
	public static void main(String[] args) {
		
		String teks = "Jumlah Mahasiswa :";
		int jml = 20;
		Date tgl = new Date();
		System.out.printf("Tampilkan %S %d di hari %tA", teks,jml,tgl);
		
		
		
		JFrame kotak;
		kotak=new JFrame();
		String name = JOptionPane.showInputDialog(kotak,"Masukkan Nama Anda");
		JOptionPane.showMessageDialog(kotak,"Selamat Datang, "+name);
	}
}
