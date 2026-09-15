public class TextFormatter {

    String formatText(String text) {
        return text.toUpperCase();
    }

    String formatText(String text, int times) {
        String result = "";

        for (int i = 0; i < times; i++) {
            result += text;
            if (i < times - 1) {
                result += " ";
            }
        }

        return result;
    }

    String formatText(String text, String prefix) {
        return "[" + prefix + "] " + text;
    }

    public static void main(String[] args) {

        TextFormatter tf = new TextFormatter();

        System.out.println(tf.formatText("hello"));
        System.out.println(tf.formatText("Echo", 3));
        System.out.println(tf.formatText("System updated", "INFO"));
    }
}
