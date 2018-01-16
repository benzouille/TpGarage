package garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tpGarage.vehicule.Vehicule;

public class Garage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7350151441475784081L;
	protected List<Vehicule> voitures = new ArrayList<Vehicule>();
	protected ObjectInputStream ois;
	protected ObjectOutputStream oos;
	File fichier = new File("ressources/garage.txt");

	public Garage() {
		lireFichier();
	}

	public void addVoiture(Vehicule voit) {
		voitures.add(voit);	
	}

	public void lireFichier() {
		//tester si le fichier existe
		if(fichier.exists() == true) {
			try {
				ois = new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(
										new File("ressources/garage.txt"))));

				try {
					System.out.println(((Garage)ois.readObject()).toString());
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				System.out.println("le fichier n'existe pas");
				e.getMessage();
				//e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					ois.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void ecrireFichier(Garage garage) {
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("ressources/garage.txt"))));

			oos.writeObject(garage);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public String toString() {
		String str = "*************************\n* Garage OpenClassrooms *\n*************************\n";
		return str;

	}

}
