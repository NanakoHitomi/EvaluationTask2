package DummyFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class CreateFile {
	protected static boolean createDummyFile(int byteSize)
	{
		//java.io.Fileをインポート
		File file = new File("./DummyFile");
		file.delete();
		
		//RandomAccessFileをインポート
		try(RandomAccessFile rFile = new RandomAccessFile(file.getPath(), "rw")){
			rFile.setLength(byteSize);
	//下記はなくてもクローズするのでコメントアウト
//			rFile.close();
			
			//IOExceptionをインポート
		 } catch (IOException e) {
			e.printStackTrace();
			return false;
	}
		//ReturnのRを小文字に変更
		return true;
	}
}
