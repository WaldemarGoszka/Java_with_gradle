package zajavka._warsztaty.w2.w2FunctionProgramingEx.Ex2;

public class Main {
    public static void main(String[] args) {
        MyFunctionInterface<Dog> stringMyFunctionInterface = (s, i, o) -> s.length() + i + o.toString().length();
        Integer test = stringMyFunctionInterface.test("abc", 2, new Dog("abcd"));
        System.out.println(test);

        MyFunctionInterface<Dog> stringMyFunctionInterface2 = (s, i, o) ->
                countChars(s, 'a') +
                        i +
                        countChars(o.toString(), ',') +
                        countChars(o.toString(), '=');
        Integer test1 = stringMyFunctionInterface2.test("abc", 5, new Dog("burek"));
        System.out.println(test1);

    }

    private static Integer countChars(final String input, final Character searchedChar) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searchedChar) {
                count++;
            }
        }
        return count;
    }
    }
