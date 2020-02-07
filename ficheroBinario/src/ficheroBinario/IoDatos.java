package ficheroBinario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IoDatos {
	public IoDatos() {

	}

	public static void guardarDatosFichero(Ventas[] vVentas) {

		File fichero = new File("datos/ventas.dat");
		DataOutputStream dit = null;
		FileOutputStream fout = null;

		if (!fichero.exists()) {
			try {
				fichero.createNewFile();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			fout = new FileOutputStream(fichero);
			dit = new DataOutputStream(fout);

			for (Ventas venta : vVentas) {
				if (venta != null) {
					dit.writeUTF(venta.getCliente());
					dit.writeInt(venta.getCodigoProducto());
					dit.writeInt(venta.getUnidadesVendidas());
					dit.writeDouble(venta.getPrecioUnitario());
				}

			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			System.out.println("lectura realizada");
			// e.printStackTrace();
		} finally {
			try {
				dit.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static Ventas[] cargarDatosFichero() {

		FileInputStream fi;
		DataInputStream di;

		Ventas[] vVentas = new Ventas[20];

		File fichero = new File("datos/ventas.dat");
		
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			fi = new FileInputStream(fichero);
			di = new DataInputStream(fi);

			for (int i=0; ;i++) {
				vVentas[i]= new Ventas(di.readUTF(), di.readInt(), di.readInt(), di.readDouble());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Fin de lectura del disco");
		}

		return vVentas;
	}
}
