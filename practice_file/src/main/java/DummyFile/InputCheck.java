package DummyFile;

class InputCheck {
	
	private String str;
	
	public InputCheck (String str) {
		if (str == null) {
			str = ""; 
			}
	
		//引数strをメンバー変数strに代入する。this.を付け足し
		this.str = str;
		
		}
	//strの中が空白ならfalse
	protected boolean isNumeric() {
		//==はデータの比較の時に使うが、今回は文字列の比較のためequals
		if (this.str.equals("")) {
			return false;
		}
		
		for (int i = 0; i < this.str.length(); i++) {
			char c = this.str.charAt(i);
			//0より小さくて9より大きい場合はfalse
			if (c < '0' || c > '9') {
				return false;
				
			}
		}
		return true;
	}
	protected boolean checkSize() {
		if(this.str.length() <= 10) {
			
			//例外処理の追加とreturnでfalseに返した
			try {
			if(Math.abs(Integer.parseInt(this.str)) <= 1024*1024*100) {
				return true;
				
			}
			return false;
		
			} catch (Exception e) {
				
			}
			
		} else {
			return false;
		}
		return false;
	}

}
