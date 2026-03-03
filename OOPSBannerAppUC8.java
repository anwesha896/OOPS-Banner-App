import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    // Method to build and return the character pattern map
    public static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for 'O'
        patternMap.put('O', new String[]{
                "   ***   ",
				" **   ** ",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				" **   ** ",
				"   ***   "
        });

        // Pattern for 'P'
        patternMap.put('P', new String[]{
                "******   ",
				"**    ** ",
				"**     **",
				"**    ** ",
				"******   ",
				"**       ",
				"**       ",
				"**       ",
				"**       "
        });

        // Pattern for 'S'
        patternMap.put('S', new String[]{
                "   *****   ",
				" **        ",
				"**         ",
				" **        ",
				"   ***     ",
				"      **   ",
				"       **  ",
				"      **   ",
				" *****     "
        });

        return patternMap;
    }

    // Method to display banner message
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {

        int height = 9; // each character has 5 rows

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                if (patternMap.containsKey(ch)) {
                    line.append(patternMap.get(ch)[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Map<Character, String[]> characterPatternMap = buildCharacterPatternMap();

        String bannerMessage = "OOPS";

        displayBanner(bannerMessage, characterPatternMap);
    }
}
