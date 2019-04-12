package ch21;

import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import org.json.JSONArray;
import org.json.JSONObject;

public class Swing3 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://dapi.kakao.com/v2/search/image?query=java");
			URLConnection con = url.openConnection();
			con.addRequestProperty("Authorization", "KakaoAK 0a7c5408897da72ef62213f279237f86");

			InputStream in = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String result = "";
			while (true) {
				String data = reader.readLine();
				if (data == null)
					break;
				result += data;
//				System.out.println(data);
			}
//			System.out.println(result);

			JFrame j = new JFrame();
			j.setLayout(new FlowLayout());

			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			MouseListener ml = new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseExited(MouseEvent e) {
				}

				@Override
				public void mouseEntered(MouseEvent e) {
				}

				@Override
				public void mouseClicked(MouseEvent e) {
					JButton btn = (JButton) e.getComponent();
					String text = btn.getText();
					try {
						Desktop.getDesktop().browse(new URI(text));
					} catch (IOException ee) {
						// TODO Auto-generated catch block
						ee.printStackTrace();
					} catch (URISyntaxException ee) {
						// TODO Auto-generated catch block
						ee.printStackTrace();
					}
				}
			};

			JSONObject obj = new JSONObject(result);
			JSONArray documents = obj.getJSONArray("documents");

			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(0, 1));

			for (int i = 0; i < documents.length(); i++) {
				JSONObject doc = documents.getJSONObject(i);
				String image_url = doc.getString("image_url");
				System.out.println(image_url);

				JButton b1 = new JButton(image_url);
				b1.addMouseListener(ml);
				panel.add(b1);
			}
			JScrollPane jp = new JScrollPane(panel);
			j.add(jp);
			j.setSize(500, 300);
			j.setVisible(true);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
