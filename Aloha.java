import java.io.*;

public class Aloha{
	public static void main(String[] args){
		try{
			// 1. データを準備
			String name;
			String msg = "さん、アロハ！";

			File f = new File("aloha.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			// 2. メッセージを生成する
			name = args[0];
			pw.println( name + msg );

			// 3. ファイルを閉じる
			pw.close();

		} catch(IOException e){
			System.out.println("ファイル書き込みエラー");
			e.printStackTrace();
		}
	}
}
