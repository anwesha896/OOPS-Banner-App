public class OOPSBannerAppUC7 {
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        
        public Character getCharacter() {
            return character;
        }

        
        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getOPattern() {
        return new String[]{
                "   ***   ",
				" **   ** ",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				"**     **",
				" **   ** ",
				"   ***   "
        };
    }

  
    public static String[] getPPattern() {
        return new String[]{
                "******   ",
				"**    ** ",
				"**     **",
				"**    ** ",
				"******   ",
				"**       ",
				"**       ",
				"**       ",
				"**       "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "   *****   ",
				" **        ",
				"**         ",
				" **        ",
				"   ***     ",
				"      **   ",
				"       **  ",
				"      **   ",
				" *****     "
        };
    }

    public static void main(String[] args) {

        
        CharacterPatternMap[] mappings = {
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S', getSPattern())
        };

        String message = "OOPS";

        // Print banner dynamically using mapping
        for (int row = 0; row < mappings[0].getPattern().length; row++) {
            for (int i = 0; i < message.length(); i++) {

                char currentChar = message.charAt(i);

                for (CharacterPatternMap map : mappings) {
                    if (map.getCharacter() == currentChar) {
                        System.out.print(map.getPattern()[row] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
