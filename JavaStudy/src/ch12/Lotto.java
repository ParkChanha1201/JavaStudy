package ch12;

public class Lotto {
	public static void main(String[] args) {
		NetworkUtil u = new NetworkUtil();
		String data = u.get("https://dhlottery.co.kr/gameResult.do?method=byWin");

		int sidx = data.indexOf("num win");
		int eidx = data.indexOf("</p>", sidx);

		String lotto = data.substring(sidx, eidx);

		int pidx = lotto.indexOf("<p>");

		lotto = lotto.substring(pidx);

		// String[] strr = lotto.split("\">");
		
		System.out.println(lotto);
		
		sidx = 0;
		while (true) {
			sidx = lotto.indexOf("\">", sidx);
			eidx = lotto.indexOf("<", sidx);
			if(sidx == -1)break;
			String num = lotto.substring(sidx + 2, eidx);
			System.out.print(num + " ");
			sidx = eidx;
		}
	}
}
