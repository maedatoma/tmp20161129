// CopyByteFile.java
// 	画像ファイルをコピーする

import java.io.*;

public class CopyByteFile{
	public static void main(String[] args) {
			// 1. 変数・データを準備
			FileInputStream in   = null;
			FileOutputStream out = null;

			// 2. ストリーム処理
			// 		1byteずつ読み書きする
			try{

				// 1. ストリームを作る
				in  = new FileInputStream("abc.png");
				out = new FileOutputStream("xyz.png");

				// 2. データを読み書きする
				int d;

				while( (d = in.read() ) != -1 ){
					out.write(d);
				}

				System.out.println( d );
				System.out.println("Copy Completed.");

			// 例外処理
			} catch( IOException e ){
				System.out.println("IOエラーです");

			} finally {

				// ストリームを閉じる
				try{
					in.close();
					out.close();

				// 例外処理
				} catch( IOException e ){
					System.out.println("IOエラーです");
				}
			}

	}
}