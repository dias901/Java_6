package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		// C:\\Users\\User\\eclipse-workspace\\lucas_2\\summary.csv
		List<Produto> list = new ArrayList<>();
		
		System.out.println("Insira o caminho da pasta:");
		String PathA = sc.nextLine();
				
		File pasta = new File(PathA); //representa e encapsula
		String pathB = pasta.getParent(); //caminho sem o nome do arquivo
		
		boolean sucess = new File(pathB+"\\out").mkdir(); //criar pasta
		
		String arquivo = pathB + "\\out\\summary.csv";
		
		try (BufferedReader bw = new BufferedReader(new FileReader(PathA))){
			String item_csv = bw.readLine();
			while (item_csv!=null) {
				String[] fields = item_csv.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				int quantidade = Integer.parseInt(fields[2]);
				list.add(new Produto(name,price,quantidade));
				item_csv = bw.readLine();
			}
			
			try(BufferedWriter bf = new BufferedWriter(new FileWriter(arquivo))){
				for (Produto item :list) {
					bf.write(item.getNome()+","+item.total());;
					bf.newLine();
					System.out.println(item.getNome()+"\n"+item.total());
				}
				System.out.println("Created");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
		}

}
