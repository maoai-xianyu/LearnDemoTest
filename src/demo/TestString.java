package demo;

/**
 * Created by zhangkun
 * on 2018/2/6.
 */
public class TestString {

    public static final String CourseType = "communication_problem solving_knowledge_words & expressions" +
            "_grammar & sentences_phonics & pronunciation_listening & reading" +
            "_appreciation_songs_speaking test_examination_writing_textbook";

    public static void main(String[] args) {

        System.out.println(" date " + CourseType.contains("problem solving"));
        System.out.println(" date " + CourseType.contains("speaking test"));
        System.out.println(" date " + CourseType.contains("phonics & pronunciation"));
        System.out.println(" date " + CourseType.contains("textbook"));
        System.out.println(" date " + CourseType.contains("words & expressions"));


        String test1 = "VM06";
        String test2 = "VM06";
        System.out.println("sdasdsad " + test1.equals(test2));

        String word = "morning'";

        String substring = word.substring(word.length() - 1);

        if (substring.equals("'")){
            System.out.println(" substring "+substring);
        }

        String words = "morning\"";
        String substrings = words.substring(words.length() - 1);
        if (substrings.equals("'")){
            System.out.println(" substrings "+substring);
        }


        String it = "it's";
        String its = it.substring(it.length() - 1);
        if (its.equals("'")){
            System.out.println(" its "+its);
        }
    }
}
