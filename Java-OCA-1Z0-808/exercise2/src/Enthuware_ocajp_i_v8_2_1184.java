import java.time.temporal.Temporal;

/**
 * You need to understand how append, insert, delete, and substring methods of StringBuilder/StringBuffer work.
 * Please go through JavaDoc API for these methods. This is very important for the exam.
 * Observe that substring() does not modify the object it is invoked on but append, insert and delete do.
 * In the exam, you will find questions that use such quirky syntax, where multiple calls are chained together.
 * For example:
 *
 * sb.append("a").append("asdf").insert(2, "asdf").
 *
 * Make yourself familiar with this technique.
 * If in doubt, just break it down into multiple calls.
 * For example, the aforementioned statement can be thought of as:
 *
 * sb.append("a");
 * sb.append("asdf");
 * sb.insert(2, "asdf")
 *
 * Note that the method substring() in StringBuilder/StringBuffer returns a String
 * (and not a reference to itself, unlike append, insert, and delete).
 * So another StringBuilder method cannot be chained to it.
 *
 * For example, the following is not valid: sb.append("a").substring(0, 4).insert(2, "asdf");
 * The following is valid though:  
 *
 * String str = sb.append("a").insert(2, "asdf").substring(0, 4);
 */
public class Enthuware_ocajp_i_v8_2_1184 {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1() {
        System.out.println("test1:");

        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");

        b1.append(b2.substring(2, 5).toUpperCase());

        System.out.println(b1); // snorklerODL
        System.out.println(b2); // yoodler
        System.out.println();
    }

    private static void test2() {
        System.out.println("test2:");

        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");

        b2.insert(3, b1.append("a"));

        System.out.println(b1); // snorklera
        System.out.println(b2); // yoosnorkleradler
        System.out.println();
    }

    private static void test3() {
        System.out.println("test3:");

        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");

        b1.replace(3, 4, b2.substring(4)).append(b2.append(false));

        System.out.println(b1); // snolerkleryoodlerfalse
        System.out.println(b2); // yoodlerfalse
        System.out.println();
    }

}
