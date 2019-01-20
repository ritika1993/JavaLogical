import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my.song.mp3 11b " + "\n" + "greatSong.flac 1000b" + "\n" + "not3.txt 5b" + "\n" + "video.mp4 200b"
				+ "\n" + "game.exe 100b" + "\n" + "mov!e.mkv 10000b";

		String[] sArray = s.split("\n");

		Map<String, String[]> catMap = new HashMap<>();

		Map<String, Integer> resultMap = new ConcurrentHashMap<>();

		catMap.put("music", new String[] { "mp3", "flac", "aac" });
		catMap.put("images", new String[] { "jpg", "bmp", "gif" });
		catMap.put("movies", new String[] { "mp4", "avi", "mkv" });
		catMap.put("other", new String[] { "7z", "txt", "zip", "exe" });

		for (String str : sArray) {
			for (Entry<String, String[]> v : catMap.entrySet()) {

				String[] sAr = v.getValue();
				for (String k : sAr) {
					int value = 0;
					if (str.contains(k)) {

						if (resultMap.get(v.getKey()) != null) {
							value = Integer.parseInt(str.replace("b", "").trim().substring(str.indexOf(" ") + 1))
									+ resultMap.get(v.getKey());
							resultMap.put(v.getKey(), value);
						} else {
							resultMap.put(v.getKey(),
									Integer.parseInt(str.replace("b", "").trim().substring(str.indexOf(" ") + 1)));
						}

					}

				}

			}
		}

		for (Entry<String, String[]> v1 : catMap.entrySet()) {

			if (!resultMap.containsKey(v1.getKey())) {

				resultMap.put(v1.getKey(), 0);
			}

		}

		String finalResult2 = "music " + resultMap.get("music") + "b" + "\n" + "images " + resultMap.get("images") + "b"
				+ "\n" + "movies " + resultMap.get("movies") + "b" + "\n" + "other " + resultMap.get("other") + "b";
		System.out.println(finalResult2);

	}

}
