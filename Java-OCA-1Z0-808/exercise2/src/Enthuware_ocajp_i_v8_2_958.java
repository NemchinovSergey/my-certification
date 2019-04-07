/**
    Actually it prints -46.
    This is because the information was lost during the conversion from type int to
    type float as values of type float are not precise to nine significant digits.
    Note: You are not required to know the number of significant digits that can be stored by a float for the exam.
    However, it is good to know about loss of precision while using float and double.

    @see <a href="https://enthuware.com/forum/viewtopic.php?f=2&t=1435">Discussion</a>
 */
public class Enthuware_ocajp_i_v8_2_958 {

    public static void main(String[] args) {
        int i = 1234567890;
        float f = i; // f = 1.23456794E9, (int) f = 1234567936
        System.out.println(i - (int) f); // -46

        i = 123456789;
        f = i; // f = 1.23456792E8, (int) f = 123456792
        System.out.println(i - (int) f); // -3

        i = 12345678;
        f = i; // f = 1.2345678E7, (int) f = 12345678
        System.out.println(i - (int) f); // 0
    }

}
