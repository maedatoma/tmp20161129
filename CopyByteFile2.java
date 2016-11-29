// CopyByteFile2.java
// 	画像ファイルをコピーする

import java.io.*;

public class CopyByteFile2{
	public static void main(String[] args) {
			// 1. 変数・データを準備
			FileInputStream in   = null;
			FileInputStream in2  = null;
			FileOutputStream out = null;

			// 2. ストリーム処理
			// 		1byteずつ読み書きする
			try{

				// 1. ストリームを作る
				in  = new FileInputStream("chicken.png");
				in2 = new FileInputStream("xyz.png");
				out = new FileOutputStream("xyz.png");

				// 2. データを読み書きする
				int i = 0;    // 回数をカウント
				int d;

				while( (d = in.read() ) != -1 ){
					out.write(d);
					i++;

					// byteデータの表示
					System.out.println( d );
				}

				System.out.println("done.");
				System.out.println("i: "+ i );

			// 例外処理
			} catch( IOException e ){
				System.out.println("IOエラーです");

			} finally {

				// ストリームを閉じる
				try{
					in.close();
					in2.close();
					out.close();

				// 例外処理
				} catch( IOException e ){
					System.out.println("IOエラーです");
				}
			}

	}
}